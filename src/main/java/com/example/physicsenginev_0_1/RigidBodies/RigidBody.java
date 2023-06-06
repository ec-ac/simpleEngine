package com.example.physicsenginev_0_1.RigidBodies;

import javafx.scene.paint.Color;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class RigidBody {
    private double xVel;
    private double yVel;
    private double xPos;
    private double yPos;
    private double xNetForce;
    private double yNetForce;
    private double mass;
    private Color color;
    private double k;
    private Boolean isMovable;



}
