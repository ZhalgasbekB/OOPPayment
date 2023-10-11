import DecorationAirplane.*;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Airplane basicAirplane = new StandardAirplane("A123", "Boeing 747", 13000, 920, 660, 36100, 150000, "Jet", "On Ground");

        Airplane decoratedAirplane = new CountryOfOperationDecorator(basicAirplane );



        Airplane decoratedAirplane2 = new MilitaryDecorator(decoratedAirplane);

        System.out.println(decoratedAirplane2);

//        Singleton singleton = new Singleton();
//        singleton.add();
    }
}

