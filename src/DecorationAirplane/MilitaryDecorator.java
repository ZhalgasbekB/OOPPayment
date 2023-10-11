package DecorationAirplane;

public class MilitaryDecorator extends  CountryOfOperationDecorator{

    public MilitaryDecorator(Airplane decoratedAirplane) {
        super(decoratedAirplane);
    }
    public boolean getIsMilitary(){
        return true;
    }

    @Override
    public String getDescription() {
        return decoratedAirplane.getDescription() + " WARNING! AVIATION";
    }

    @Override
    public String toString() {
        return super.toString() + getIsMilitary();
    }
}
