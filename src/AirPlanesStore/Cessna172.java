package AirPlanesStore;

import AirPlanesStore.airplane_class.AirPlane;

public class Cessna172 extends AirPlane {
    public Cessna172(String model, int maxRange, int maxSpeed, int passengerCapacity, int cargoCapacity, int currentFuelLevel, String engineType, String currentStatus) {
        super(model, maxRange, maxSpeed, passengerCapacity, cargoCapacity, currentFuelLevel, engineType, currentStatus);
    }

    @Override
    public String militaryAviation() {
        return super.militaryAviation();
    }
}
