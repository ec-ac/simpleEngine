package com.example.physicsenginev_0_1.RigidBodies;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RigidRectangle extends RigidBody{
    private double height;
    private double width;

    //draw the object, once every 1/60 of a second
    @Override
    public void draw(){
        //aa
    }


}
