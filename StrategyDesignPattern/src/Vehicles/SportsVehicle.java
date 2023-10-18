package Vehicles;

import Strategy.SportyDriveStrategy;

public class SportsVehicle extends Vehicle{
    public SportsVehicle() {
        super(new SportyDriveStrategy());
    }
}
