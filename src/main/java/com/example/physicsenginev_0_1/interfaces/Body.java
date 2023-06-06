package com.example.physicsenginev_0_1.interfaces;

import com.example.physicsenginev_0_1.RigidBodies.RigidBody;
import javafx.scene.canvas.GraphicsContext;

public interface Body {
    void calcForce(RigidBody body);
    void draw(RigidBody body, GraphicsContext context);
    void sim(RigidBody body, float delta);
    void applyForce(RigidBody body, double xF, double yF);
}
