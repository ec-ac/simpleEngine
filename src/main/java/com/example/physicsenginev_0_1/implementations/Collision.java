package com.example.physicsenginev_0_1.implementations;

import com.example.physicsenginev_0_1.RigidBodies.RigidBody;
import com.example.physicsenginev_0_1.RigidBodies.RigidCircle;
import com.example.physicsenginev_0_1.RigidBodies.RigidRectangle;
import com.example.physicsenginev_0_1.interfaces.Body;
import com.example.physicsenginev_0_1.interfaces.Collisions;

import java.util.List;

public class Collision implements Collisions {

    @Override
    public Boolean collisionCheck(RigidCircle c1, RigidCircle c2, double k) {
        double drx = c2.getXPos() - c1.getXPos();
        double dry = (c2.getYPos() - c1.getYPos());

        double dr = (double) Math.sqrt((Math.pow(drx, 2)) + (Math.pow(dry, 2)));

        double d = c1.getRadius() + c2.getRadius() - dr;

        if (d > 0) {
            double nXF = -(1/dr) * drx * k * d;
            double nYF = -(1/dr) * dry * k * d;

            Body body = new BodyOperations();
            body.applyForce(c1, nXF, nYF);
            body.applyForce(c2, -nXF, -nYF);
        }
        return d > 0;
    }

    @Override
    public void checkCollision(RigidCircle c1, RigidRectangle r1, double k) {


    }

    @Override
    public void objectCollide(List<RigidBody> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {

                if (list.get(i) instanceof RigidCircle & list.get(j) instanceof RigidCircle) {
                    RigidCircle c1 = (RigidCircle) list.get(i);
                    RigidCircle c2 = (RigidCircle) list.get(j);

                    if (collisionCheck(c1, c2, 2000)) {
                        if (!c1.getIsMovable()) {
                            list.set(j, null);
                        } else if (!c2.getIsMovable()) {
                            list.set(i, null);
                        }
                    }

                } else {
                    if (list.get(i) instanceof RigidCircle & list.get(j) instanceof RigidRectangle) {
                        checkCollision((RigidCircle) list.get(i), (RigidRectangle) list.get(j), 2000);
                    }
                    if (list.get(j) instanceof RigidCircle & list.get(i) instanceof RigidRectangle)   {
                        checkCollision((RigidCircle) list.get(j), (RigidRectangle) list.get(i), 2000);
                    }

                }
            }
        }
    }
}
