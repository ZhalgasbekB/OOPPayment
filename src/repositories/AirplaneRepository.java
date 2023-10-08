package repositories;

import AirPlanesStore.airplane_class.AirPlane;
import data.interfaces.DB;
import repositories.interfaces.IAirPlaneRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AirplaneRepository implements IAirPlaneRepository {
    private final DB db;

    public AirplaneRepository(DB db) {
        this.db = db;
    }

    @Override
    public boolean insertAirplane(AirPlane airPlane) {
        Connection con = null;
        try {

            con = db.createConnection();
            String sql = "INSERT INTO airplanes (model, maxRange, maxSpeed, passengerCapacity, cargoCapacity, currentFuelLevel, engineType, currentStatus, military) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement preparedStatement = con.prepareStatement(sql);

            preparedStatement.setString(1, airPlane.getModel());
            preparedStatement.setInt(2, airPlane.getMaxRange());
            preparedStatement.setInt(3, airPlane.getMaxSpeed());
            preparedStatement.setInt(4, airPlane.getPassengerCapacity());
            preparedStatement.setInt(5, airPlane.getCargoCapacity());
            preparedStatement.setInt(6, airPlane.getCurrentFuelLevel());
            preparedStatement.setString(7, airPlane.getEngineType());
            preparedStatement.setString(8, airPlane.getCurrentStatus());
            preparedStatement.setString(9, airPlane.militaryAviation());
            preparedStatement.execute();

            System.out.println("Data inserted successfully.");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
