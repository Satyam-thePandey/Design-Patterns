package Vehicles;

import Strategy.MoutainDriveStrategy;

public class MountainVehicle extends Vehicle{
    MountainVehicle() {
        super(new MoutainDriveStrategy());
    }
}
