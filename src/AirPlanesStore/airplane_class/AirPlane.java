package AirPlanesStore.airplane_class;

import AirPlanesStore.intefaces.IAirPlane;

public class AirPlane implements IAirPlane {

    private int airplane_id;
    private String model;

    private int maxRange;

    private int maxSpeed;
    private int passengerCapacity;
    private int cargoCapacity;
    private int currentFuelLevel;
    private String engineType;

    private String currentStatus;

    private String military;

    public AirPlane(){}
    public AirPlane(String model, int maxRange, int maxSpeed, int passengerCapacity, int cargoCapacity, int currentFuelLevel, String engineType, String currentStatus ) {
        this.model = model;
        this.maxRange = maxRange;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.engineType = engineType;
        this.currentStatus = currentStatus;
        this.military =  militaryAviation();
    }

    public String getMilitary() {
        return military;
    }

    public void setMilitary(String military) {
        this.military = military;
    }

    public int getAirplane_id() {
        return airplane_id;
    }

    public void setAirplane_id(int airplane_id) {
        this.airplane_id = airplane_id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(int currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String currentStatus) {
        this.currentStatus = currentStatus;
    }

    @Override
    public String militaryAviation() {
        return "It is not A military Aviations";
    }

    @Override
    public String toString() {
        return "AirPlane{" +
                "airplane_id='" + airplane_id + '\'' +
                ", model='" + model + '\'' +
                ", maxRange=" + maxRange +
                ", maxSpeed=" + maxSpeed +
                ", passengerCapacity=" + passengerCapacity +
                ", cargoCapacity=" + cargoCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", engineType='" + engineType + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", Military='" + militaryAviation() + '\'' +
                '}';
    }
}
//    public AirPlane(int airplane_id, String model, int maxRange, int maxSpeed, int passengerCapacity, int cargoCapacity, int currentFuelLevel, String engineType, String currentStatus) {
//        this.airplane_id = airplane_id;
//        this.model = model;
//        this.maxRange = maxRange;
//        this.maxSpeed = maxSpeed;
//        this.passengerCapacity = passengerCapacity;
//        this.cargoCapacity = cargoCapacity;
//        this.currentFuelLevel = currentFuelLevel;
//        this.engineType = engineType;
//        this.currentStatus = currentStatus;
//        this.military = militaryAviation();
//    }

