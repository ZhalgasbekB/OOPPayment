package DecorationAirplane;

public interface Airplane {
    String getAirplaneId();
    String getModel();
    int getMaxRange();
    int getMaxSpeed();
    int getPassengerCapacity();
    double getCargoCapacity();
    double getCurrentFuelLevel();
    String getEngineType();
    String getCurrentStatus();
    String getDescription();
    String toString();
}
