package DecorationAirplane;

public class CountryOfOperationDecorator implements  Airplane{
    Airplane decoratedAirplane;

    public CountryOfOperationDecorator(Airplane decoratedAirplane) {
        this.decoratedAirplane = decoratedAirplane;
    }
    @Override
    public String getAirplaneId() {
        return decoratedAirplane.getAirplaneId();
    }

    @Override
    public String getModel() {
        return decoratedAirplane.getModel();
    }

    @Override
    public int getMaxRange() {
        return decoratedAirplane.getMaxRange();
    }

    @Override
    public int getMaxSpeed() {
        return decoratedAirplane.getMaxSpeed();
    }

    @Override
    public int getPassengerCapacity() {
        return decoratedAirplane.getPassengerCapacity();
    }

    @Override
    public double getCargoCapacity() {
        return decoratedAirplane.getCargoCapacity();
    }

    @Override
    public double getCurrentFuelLevel() {
        return decoratedAirplane.getCurrentFuelLevel();
    }

    @Override
    public String getEngineType() {
        return decoratedAirplane.getEngineType();
    }

    @Override
    public String getCurrentStatus() {
        return decoratedAirplane.getCurrentStatus();
    }

    @Override
    public String getDescription() {
        return decoratedAirplane.getDescription() + "FROM USA ";
    }


    @Override
    public String toString() {
        return "CountryOfOperationDecoration{" +
                "decoratedAirplane=" + decoratedAirplane.toString() +
                ",\n COUNTRY " + getDescription()+ '\'' +
                '}';
    }
}
