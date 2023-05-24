package com.example.physicsenginev_0_1.RigidBodies;

public class RigidBody {
    private double accel[] = new double[2];
    private double velocity[] = new double[2];
    private double position[] = new double[2];
    private double momentum[] = new double[2];
    private double mass;
    private double drag;

    private double color;

    public double getColor() {
        return color;
    }

    public void setColor(double color) {
        this.color = color;
    }

    public double[] getAccel() {
        return accel;
    }

    public void setAccel(double[] accel) {
        this.accel = accel;
    }

    public double[] getVelocity() {
        return velocity;
    }

    public void setVelocity(double[] velocity) {
        this.velocity = velocity;
    }

    public double[] getPosition() {
        return position;
    }

    public void setPosition(double[] position) {
        this.position = position;
    }

    public double[] getMomentum() {
        return momentum;
    }

    public void setMomentum(double[] momentum) {
        this.momentum = momentum;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDrag() {
        return drag;
    }

    public void setDrag(double drag) {
        this.drag = drag;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    private double weight;
    //private color;
}
