package Applications;

import AirPlanesStore.airplane_class.AirPlane;
import controrllers.AirPlaneController;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application {
    private final AirPlaneController controller;

    private final Scanner scanner;

    public static List<AirPlane> airPlanes = new ArrayList<>();

    public static void addForAirplane(AirPlane airPlane) {
        airPlanes.add(airPlane);
    }

    public Application(AirPlaneController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println();
            System.out.println("Admin Operations of AirPlanes");
            System.out.println("1. Insert a AirPlane");
            System.out.println("0. Exit");
            System.out.println();
            try {
                System.out.print("Enter option (1 or Other Numbers): ");
                int option = scanner.nextInt();
                switch (option) {
                    case 1:
                        insertAirPlanes();
                        break;
                    default:
                        return;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("---------------------------------------------------");

        }
    }

    private void insertAirPlanes() {
        for (AirPlane airPlane : airPlanes) {
            String response = controller.insertAirPlaneController(airPlane.getModel(), airPlane.getMaxRange(), airPlane.getMaxSpeed(), airPlane.getPassengerCapacity(), airPlane.getCargoCapacity(), airPlane.getCurrentFuelLevel(), airPlane.getEngineType(), airPlane.getCurrentStatus());
            System.out.println(response);
        }
    }


}
