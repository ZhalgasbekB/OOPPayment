package AirPlanesStore;

import AirPlanesStore.airplane_class.AirPlane;

public class Boeing747 extends AirPlane {
    public Boeing747(String model, int maxRange, int maxSpeed, int passengerCapacity, int cargoCapacity, int currentFuelLevel, String engineType, String currentStatus) {
        super(model, maxRange, maxSpeed, passengerCapacity, cargoCapacity, currentFuelLevel, engineType, currentStatus);
    }

    @Override
    public String militaryAviation() {
        return super.militaryAviation();
    }

}
