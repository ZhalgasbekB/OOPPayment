import AirPlanesStore.airplane_class.AirPlane;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AirplanesStore {


    private List<AirPlane> airPlanes = new ArrayList<>();

    public  List<AirPlane> getAirPlanes (){
        return airPlanes;
    }
    public void  add (AirPlane airPlane){
        airPlanes.add(airPlane);
    }
    public int getRandomPassengerPlaceOfAirPlane() {
        Random random = new Random();
        int part = 1 + random.nextInt(5);
        int passengers_place = 100 * part + random.nextInt(200);
        return passengers_place;
    }

    public int getRandomCargoCapacityOfAirPlane() {
        Random random = new Random();
        int part = 1 + random.nextInt(5);
        int passengers_place = 100 * part + random.nextInt(500);
        return passengers_place;
    }
    public int getRandomCurrentFuelOfLitersPlaceOfAirPlane() {
        Random random = new Random();
        int part = 1 + random.nextInt(5);
        int fuel = 100 * part + random.nextInt(1000);
        return fuel;
    }

}
