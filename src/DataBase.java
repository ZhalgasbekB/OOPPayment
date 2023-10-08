import Applications.Application;
import Applications.MyApplication2;
import controrllers.AirPlaneController;
import controrllers.CarController;
import data.PostgresDBAirPlane;
import data.PostgresDBCar;
import data.interfaces.DB;
import repositories.AirplaneRepository;
import repositories.CarRepositories;
import repositories.interfaces.IAirPlaneRepository;
import repositories.interfaces.ICarRepository;

import java.sql.SQLException;

public class DataBase {
    private static DataBase instance;

    private  DataBase (){

    }
    public static DataBase getInstance(){
        if  (instance == null){
            instance = new DataBase();
        }
        return instance;
    }
    public  void databaseConnection( ) throws SQLException, ClassNotFoundException {
        DB db = new PostgresDBAirPlane();
        db.createConnection();
        IAirPlaneRepository repository =  new AirplaneRepository(db);
        AirPlaneController airPlaneController =  new AirPlaneController(repository);
        Application application = new Application(airPlaneController);
        application.start();
    }
}
