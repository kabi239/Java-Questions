package com.Questions.Lintcode;

/*
    3300 · Using the Transportation Method
    Description:
    Topic requirements:
    Define a class of vehicle with properties: 
        speed (speed), volume (size), acceleration (acceleration), time (time).
    Define some methods: 
        move: output content for the initial speed, acceleration and volume, 
        setSpeed(): can set the initial speed of the vehicle and print, 
        speedUp: speed plus acceleration times time and print, 
        speedDown: speed minus acceleration times time and print, If the speed is less than 0, the output is 0.
    Instantiate a vehicle object, initialize the values of speed and 
    size by methods and call the methods to print the output; in addition, 
    call speedUp and speedDown to change the speed.
 */
class Vehicle {
   private int velocity;
   private int volume;
   private int acceleration;
   private  int time;

    public Vehicle(int velocity,  int volume, int time, int acceleration) {
        this.velocity = velocity;
        this.volume = volume;
        this.acceleration = acceleration;
        this.time = time;
        move();
        setSpeed(velocity);
        speedUp();
        speedDown();
    }
    
    public void move() {
        System.out.println("Initial velocity: " + velocity + ", Initial volume: " + volume + ", Initial acceleration: " + acceleration);
    }
    public void setSpeed(int velocity) {
        this.velocity = velocity;
        System.out.println("The initial velocity of the setting is: " + velocity);
    }
    public void speedUp() {
        velocity += acceleration * time;
        System.out.println("The speed after the acceleration is : " + velocity);
    }
    public void speedDown() {
        velocity -= acceleration * time;
        if(velocity < 0) {
            velocity = 0;
        }
        System.out.println("The speed after the deceleration is: " + velocity);
    }

}
public class usingTheTransportationMethod {
    public static void main(String[] args) {
        Vehicle vehicle =new Vehicle(1,2,5,2);
    }
}
