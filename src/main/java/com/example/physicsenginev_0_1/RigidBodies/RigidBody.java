package com.example.physicsenginev_0_1.RigidBodies;

import javafx.scene.paint.Color;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class RigidBody {
    private double accel[] = new double[2];
    private double velocity[] = new double[2];
    private double position[] = new double[2];
    private double momentum[] = new double[2];
    private double mass;
    private double drag;
    private Color color;

    public void calcForce() {
        //a
    }

    public void sim() {
        //a
    }


    public abstract void draw();
}
