import AirPlanesStore.AirbusA300F;
import AirPlanesStore.Boeing747;
import AirPlanesStore.Cessna172;
import AirPlanesStore.F22Raptor;
import AirPlanesStore.airplane_class.AirPlane;
import Applications.Application;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

public class Singleton {
    private Scanner sc;

    public Singleton (){
        sc = new Scanner(System.in);
    }
    public void add() throws SQLException, ClassNotFoundException {
        Random random = new Random(System.nanoTime());
        AirplanesStore airPlanesStore = new AirplanesStore();
        for (int i = 0; i < 10; i++) {
            int n = 1 + random.nextInt(5);
            switch (n) {
                case 1:
                    airPlanesStore.add(new AirbusA300F("Airbus A300F", 7600, 858, airPlanesStore.getRandomPassengerPlaceOfAirPlane(), airPlanesStore.getRandomCargoCapacityOfAirPlane(), airPlanesStore.getRandomCurrentFuelOfLitersPlaceOfAirPlane(), "Jet", "On Ground"));
                    break;
                case 2:
                    airPlanesStore.add(new Boeing747("Boeing 747", 13000, 920, airPlanesStore.getRandomPassengerPlaceOfAirPlane(), airPlanesStore.getRandomCargoCapacityOfAirPlane(), airPlanesStore.getRandomCurrentFuelOfLitersPlaceOfAirPlane(), "Jet", "On Ground"));
                    break;
                case 3:
                    airPlanesStore.add(new Cessna172("Cessna 172", 1220, 302, airPlanesStore.getRandomPassengerPlaceOfAirPlane(), airPlanesStore.getRandomCargoCapacityOfAirPlane(), airPlanesStore.getRandomCurrentFuelOfLitersPlaceOfAirPlane(),"Propeller", "On Ground"));
                    break;
                case 4:
                    airPlanesStore.add(new F22Raptor("F-22 Raptor", 2092, 2410,3, 1 , airPlanesStore.getRandomCurrentFuelOfLitersPlaceOfAirPlane(),"Jet", "On Ground"));
                    break;
                case 5:
                    airPlanesStore.add(new AirbusA300F("Airbus A300F", 13000, 920, 2, 1, airPlanesStore.getRandomCurrentFuelOfLitersPlaceOfAirPlane(), "Jet", "On Ground"));
                    break;
            }
        }

        for (AirPlane airPlane : airPlanesStore.getAirPlanes()) {
            Application.addForAirplane(airPlane);
        }
        DataBase dataBase = DataBase.getInstance();
        dataBase.databaseConnection();
    }

}
//                case 2:
//                    airPlanesStore.add( );
//                    break;
//                case 3:
//                    airPlanesStore.add( );
//                    break;
//                case 4:
//                    airPlanesStore.add( );
//                    break;