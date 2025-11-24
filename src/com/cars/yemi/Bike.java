package com.cars.yemi;

public class Bike {
    int id;
    private int speed;

    void start() {
        System.out.println("Bike started");

    }

    public int getSpeed() {
       return this.speed;
    };

    public void setSpeed(int speed) {
        this.speed += speed;
    };
}
