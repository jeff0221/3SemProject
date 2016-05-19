package Model;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Zonde on 13-05-2016.
 */

public class Database
{
    private static Database instance;
    private Connection con;

    private Database()
    {
        connectToDatabase();
    }

    public static Database getInstance()
    {
        if(instance == null)
        {
            instance = new Database();
            return instance;
        }
        else
        {
            return instance;
        }
    }
    public void connectToDatabase()
    {
        try {

            System.out.println("Starting up DataBase");

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/";

            con = DriverManager.getConnection(url, "root", "Indsæt jeres password her");

            System.out.println("URL: " + url);

            System.out.println("Connection: " + con);

        } catch (Exception e) {

            e.printStackTrace();
        }

    }
    public void insertPerson(Person person)
    {

    }
    public void deletePerson(Person person)
    {

    }
    public void updatePerson(Person person)
    {

    }
    public void insertVenue(Venue venue)
    {

    }
    public void deleteVenue(Venue venue)
    {

    }
    public void updateVenue(Venue venue)
    {

    }
    public void insertBooking(Booking booking)
    {

    }
    public void deleteBooking(Booking booking)
    {

    }
    public void updateBooking(Booking booking)
    {

    }
}
