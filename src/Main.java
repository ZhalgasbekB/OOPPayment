import controrllers.PersonController;
import data.PostgresDB;
import data.interfaces.DB;
import repositories.PersonRepositories;
import repositories.interfaces.IPersonRepository;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)   {
        Scanner sc  = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Welcome to  CarCity");
            System.out.println("Select option:");
            System.out.println("1. Buy a car");
            System.out.println("0. Exit");
            //            System.out.println("2. Get person by id");
            //            System.out.println("3. Create person");

            System.out.println();
            try {
                System.out.print("Enter option (1-3): ");
                int option = sc.nextInt();
                switch (option) {
                    case 1:
                        connectToApp();
                        break;
                    default:
                        return;
                }

            } catch (InputMismatchException e) {
                System.out.println("Input must be integer");
                sc.nextLine();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            System.out.println("---------------------------------------------------");

        }
    }

   public static void  connectToApp() throws SQLException, ClassNotFoundException {
        DB db = new PostgresDB();
        db.createConnection();
        IPersonRepository repository = new PersonRepositories(db);

        PersonController controller = new PersonController(repository);
        MyApplication app = new MyApplication(controller);
        app.start();}
    }
