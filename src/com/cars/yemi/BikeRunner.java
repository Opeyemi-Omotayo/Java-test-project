package com.cars.yemi;

public class BikeRunner {
    static void main() {
        Bike honda = new Bike();
        Bike toyota = new Bike();

        honda.start();
        toyota.start();

        honda.id = 1;
        honda.setSpeed(100);
        honda.setSpeed(160);
        System.out.println(honda.getSpeed());
        System.out.println(Byte.SIZE);
        System.out.println(Byte.MAX_VALUE);




        toyota.id = 2;
        toyota.setSpeed(10);
        System.out.println(toyota.getSpeed());

    }
}
