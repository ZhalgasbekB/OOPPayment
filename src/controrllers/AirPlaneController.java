package controrllers;

import AirPlanesStore.airplane_class.AirPlane;

import repositories.interfaces.IAirPlaneRepository;


public class AirPlaneController {
    private final IAirPlaneRepository iAirPlaneRepository;

    public AirPlaneController(IAirPlaneRepository iAirPlaneRepository) {
        this.iAirPlaneRepository = iAirPlaneRepository;
    }

    public String insertAirPlaneController(String model, int maxRange, int maxSpeed, int passengerCapacity, int cargoCapacity, int currentFuelLevel, String engineType, String currentStatus) {
        AirPlane airPlane = new AirPlane(model, maxRange, maxSpeed, passengerCapacity, cargoCapacity, currentFuelLevel, engineType, currentStatus);
        return iAirPlaneRepository.insertAirplane(airPlane) ? "T" : "F";
    }
}
