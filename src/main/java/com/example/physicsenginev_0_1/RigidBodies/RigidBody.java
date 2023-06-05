package com.example.physicsenginev_0_1.RigidBodies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class RigidBody {
    private double velocity[] = new double[2];
    private double position[] = new double[2];
    private double netForce[] = new double[2];
    private double mass;
    private double color;
    private double drag;
    private Boolean isMovable;



}
