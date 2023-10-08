package data;

import data.interfaces.DB;

import java.sql.*;

public class PostgresDBAirPlane implements DB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/database";
        String user_name = "postgres";
        String password = "0000";
        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(url, user_name, password);

            return con;
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public Connection createConnection() throws SQLException, ClassNotFoundException {
        String url = "jdbc:postgresql://localhost:5432/database";
        String user = "postgres";
        String password = "0000";

        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            Statement st = con.createStatement();
            DatabaseMetaData dbm = con.getMetaData();
            ResultSet tables = dbm.getTables(null, null, "airplanes", null);

            if (!tables.next()) {
                String sql = "CREATE TABLE airplanes (airplane_id serial PRIMARY KEY, model VARCHAR(255) ,maxRange INT ,maxSpeed INT, passengerCapacity INT, cargoCapacity INT , currentFuelLevel INT, engineType VARCHAR (255), currentStatus VARCHAR(255) , military VARCHAR(255)); ";
                st.execute(sql);
                System.out.println("Table  created successfully");

            } else {
                System.out.println("Table  exists.");
            }
            return con;
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return null;
    }
}
