package com.example.physicsenginev_0_1.implementations;

import com.example.physicsenginev_0_1.RigidBodies.RigidBody;
import com.example.physicsenginev_0_1.RigidBodies.RigidCircle;
import com.example.physicsenginev_0_1.RigidBodies.RigidRectangle;
import com.example.physicsenginev_0_1.interfaces.Body;
import javafx.scene.canvas.GraphicsContext;

public class BodyOperations implements Body {
    @Override
    public void calcForce(RigidBody body) {
        if (body != null) {
            double y = -body.getMass() * 0 - body.getK() * body.getYVel();
            double x = -body.getK() * body.getXVel();
            body.setYNetForce(y);
            body.setXNetForce(x);
        }

    }

    @Override
    public void draw(RigidBody body, GraphicsContext context) {
        if (body != null) {
            context.setFill(body.getColor());

            double x = (body.getXPos() + 5) * 50;
            double y = (8 - body.getYPos()) * 50;

            if(body.getClass() == RigidRectangle.class) {
                RigidRectangle rectangle = (RigidRectangle) body;
                double w = rectangle.getWidth() * 50;
                double h = rectangle.getHeight() * 50;
                context.fillRect(x, y, w, h);
            } else if (body.getClass() == RigidCircle.class) {
                RigidCircle circle = (RigidCircle) body;
                double r = circle.getRadius()  * 50;
                context.fillOval(x-r,y-r,r*2,r*2);
            }
        }

    }

    @Override
    public void sim(RigidBody body, float delta) {
        if(body != null) {
            double xAccel = body.getXNetForce()/body.getMass();
            double yAccel = body.getYNetForce()/body.getMass();

            double netXVel = delta * xAccel + body.getXVel();
            double netYVel = delta * yAccel + body.getYVel();

            if (body.getIsMovable()) {
                body.setXPos(body.getXVel() * delta + body.getXPos());
                body.setYPos(body.getYVel() * delta + body.getYPos());
            }
        }

    }

    @Override
    public void applyForce(RigidBody body, double xF, double yF) {
        double nXF = body.getXNetForce() + xF;
        double nYF = body.getYNetForce() + yF;

        body.setXNetForce(nXF);
        body.setYNetForce(nYF);
    }
}
