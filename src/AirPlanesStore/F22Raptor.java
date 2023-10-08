package AirPlanesStore;

import AirPlanesStore.airplane_class.AirPlane;

public  class F22Raptor extends AirPlane {
//    private String military = militaryAviation();

    public F22Raptor(String model, int maxRange, int maxSpeed, int passengerCapacity, int cargoCapacity, int currentFuelLevel, String engineType, String currentStatus) {
        super(model, maxRange, maxSpeed, passengerCapacity, cargoCapacity, currentFuelLevel, engineType, currentStatus);
    }

    @Override
    public  String militaryAviation() {
        return "WARINIG IT IS MILITARY AVIATION";
    }

}
