package Vehicles;

import Strategy.DriveStrategy;

public class Vehicle {

    boolean isTwoWheeler(){
        return true;
    }
    DriveStrategy driveStrategy;
    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }
    public void drive(){
        driveStrategy.drive();
    }
}
