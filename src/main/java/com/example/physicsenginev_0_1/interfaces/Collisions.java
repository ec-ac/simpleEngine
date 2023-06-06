package com.example.physicsenginev_0_1.interfaces;

import com.example.physicsenginev_0_1.RigidBodies.RigidBody;
import com.example.physicsenginev_0_1.RigidBodies.RigidCircle;
import com.example.physicsenginev_0_1.RigidBodies.RigidRectangle;

import java.util.List;

public interface Collisions {
    Boolean collisionCheck(RigidCircle c1, RigidCircle c2, double k);
    void checkCollision(RigidCircle c1, RigidRectangle r1, double k);
    void objectCollide(List<RigidBody> list);
}
