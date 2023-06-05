package com.example.physicsenginev_0_1.RigidBodies;

import lombok.Data;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RigidRectangle extends RigidBody {
    private double height;
    private double width;

}
