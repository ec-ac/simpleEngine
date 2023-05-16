package com.example.physicsenginev_0_1;

public class Body {
    //a single body must have a size, shape, area

    //it must have a mass, and current vector describing magnitude and direction
        //the vector should be printed onscreen from the origin of the object

    //information on the object itself should be:
    //current instant position
    //previous instant position (1 frame ago)
        //instant velocity (rate of change between previous and current positions)
        //instant acceleration (rate of change between previous and current velocity)
    //current net force being applied on object
        //will be more complicated once implementing collisions, however, for basic implementations:
            //mass of object * current acceleration, there is no friction

    //the floor and any walls or world objects will be rigid affectors and will have infinite mass for convenience

    //universal vector would be gravity @9.81m/s^2

    //an object and its properties should be handled from any physics class, any task that would print the object on
    //screen should simply take the properties from its physics and then print it.

 /*   final double g = 9.81;
    double prevPosition;
    double position;
    double mass;

    Body body = new Body();

    public double Velocity () {
        double velocity = body.position - body.prevPosition;
        return velocity;
    }

    public double Acceleration(double prevVelocity, double velocity) {
        double acceleration = velocity - prevVelocity;//wrong lol
        return acceleration;
    }

    public double NetForce (double acceleration, double mass) {
        double force = acceleration * mass;
        return force;
    }
*/

    //you need 3 data-points of position for acceleration
    //you cannot assume velocity from 1 datapoint of position, you need 2
    //you need two data-points of velocity for instant acceleration, you'd need 3 data-points of position in total


    //affector?

    /*public double Affector(double extrernalForce) {
        return null;
    }*/


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
        //because this is primitive, we will only use 3 forces at a time for any y and 2 for any x net force

}
