package com.example.physicsenginev_0_1;

public class Body {

    /**
     * i will just do this in the most "natural way" that i can think of
     * this will mostly follow a Procedural mindset which i then will attempt to adapt more efficiently
     */




    //a single body must have a size, shape, area

    //it must have a mass, and current vectors describing magnitude and direction
        //the vectors should be printed onscreen from the origin of the object

    //information on the object itself should be:
    //current instant position
        //instant velocity
        //instant acceleration
    //current net force being applied on object
            //mass of object * current acceleration, there is no friction

    //the floor and any walls or world objects will be rigid affectors and will have infinite mass for convenience

    //universal vector would be gravity @9.81m/s^2

    //an object and its properties should be handled from any physics class, any task that would print the object on
    //screen should simply take the properties from its physics and then print it.

    final double g = -9.81;
    double yPos;
    double xPos;
    final double mass = 10;
    double xVelocity;
    double yVelocity;
    double yAccel;
    double xAccel;

    Body body = new Body();

    double weight = g * mass;

    //affector? these will return current net force to be applied to the object
    public double vAffector(double exForce1) {
        double netForce = g + exForce1;
        return netForce;
    }

    public double hAffector(double exForce1) {
        double netForce = g + exForce1;
        return netForce;
    }

    public double getG() {
        return g;
    }

    public double getyPos() {
        return yPos;
    }

    //position thresholds must be implemented
    public void setyPos(double yPos) {
        this.yPos = body.getyPos() + body.getyVelocity()/60;
    }

    public double getxPos() {
        return xPos;
    }

    //position thresholds must be implemented
    public void setxPos(double xPos) {
        this.xPos = body.getxPos() + body.getyVelocity()/60;
    }

    public double getMass() {
        return mass;
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity = body.getxVelocity() + body.getyAccel()/60;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = body.getyVelocity() + body.getyAccel()/60;
    }

    public double getyAccel() {
        return yAccel;
    }

    public void setyAccel(double yAccel) {
        this.yAccel = hAffector(body.getyForce()) / mass; //fix later
    }

    public double getxAccel() {
        return xAccel;
    }

    public void setxAccel(double xAccel) {
        this.xAccel = hAffector(body.getxForce()) / mass; //fix later
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = mass * g;
    }

    //there is probably a better way of setting this such that the v and h forces will be calc'ed in a single function
    //probably some data struct that im not using




    //scratch all of this:
    //any object will start with an initial velocity and acceleration of 0, at some position in the x,y plane.
    //the properties of the object will only be the acceleration, from which we will obtain the velocity and position.
        //we will obtain these properties after 1 frame, as opposed to the 3 frames that it would've taken previously

    //velocity will be a function of prev. velocity + (1/60)acceleration
    //position will be a function of prev. position + (1/60)current velocity


    //we need vertical (y) and horizontal (x) positions, [position] will be a 2d coordinate
    //we will have a vertical and horizontal velocity
        //however, the vertical velocity will only affect position if the vertical position is >y(floor) or if
        //net vertical force > weight (mass * g)
        //net vertical force will always have a negative g vector for gravity

    //a force affector will work to change acceleration
    //change in acceleration will always be net force / mass
        //net force will always be the sum of all forces.
        //because this is primitive, we will only use 2 forces at a time for any y and 1 for any x net force


    //a


    //there will be a single method executed once every 1/60 seconds that will update all these parameters


}
