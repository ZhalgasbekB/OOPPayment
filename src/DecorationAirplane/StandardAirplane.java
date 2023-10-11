package DecorationAirplane;

public class StandardAirplane implements  Airplane{
    private String airplaneId;
    private String model;
    private int maxRange;
    private int maxSpeed;
    private int passengerCapacity;
    private double cargoCapacity;
    private double currentFuelLevel;
    private String engineType;
    private String currentStatus;

    public StandardAirplane (String airplaneId, String model, int maxRange, int maxSpeed, int passengerCapacity,
                             double cargoCapacity, double currentFuelLevel, String engineType, String currentStatus){
        this.airplaneId = airplaneId;
        this.model = model;
        this.maxRange = maxRange;
        this.maxSpeed = maxSpeed;
        this.passengerCapacity = passengerCapacity;
        this.cargoCapacity = cargoCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.engineType = engineType;
        this.currentStatus = currentStatus;
    }

    @Override
    public String getAirplaneId() {
        return airplaneId;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getMaxRange() {
        return maxRange;
    }

    @Override
    public int getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    @Override
    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public String getCurrentStatus() {
        return currentStatus;
    }

    @Override
    public String getDescription() {
        return "IS AIRPLANE ";
    }

    @Override
    public String toString() {
        return "StandardAirplane{" +
                "airplaneId='" + airplaneId + '\'' +
                ", model='" + model + '\'' +
                ", maxRange=" + maxRange +
                ", maxSpeed=" + maxSpeed +
                ", passengerCapacity=" + passengerCapacity +
                ", cargoCapacity=" + cargoCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", engineType='" + engineType + '\'' +
                ", currentStatus='" + currentStatus + '\'' +
                ", MILITARY ='" + getDescription() + '\'' +
                '}';
    }
}
