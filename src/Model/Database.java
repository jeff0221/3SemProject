package Model;

import com.mysql.jdbc.exceptions.jdbc4.MySQLSyntaxErrorException;

import java.sql.*;

/**
 * Created by Zonde on 13-05-2016.
 */

public class Database
{
    private static Database instance;
    private Connection con;
    private PreparedStatement statement;
    private ResultSet resultSet;

    private final String DB_PASSWORD = "Insert MySQL password here";

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

            con = DriverManager.getConnection(url, "root", DB_PASSWORD);

            System.out.println("URL: " + url);

            System.out.println("Connection: " + con);

            checkDB();

        } catch (Exception e) {

            e.printStackTrace();
        }

    }

    private void checkDB() {
        try {
            statement = con.prepareStatement("USE Artifacts_Agency");
            statement.executeUpdate();

            System.out.println("Database Artifacts_Agency exists using it");
        } catch (MySQLSyntaxErrorException e) {
            System.out.println("Database does not exist creating database Artifacts_Agency");
            createDB();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            statement = con.prepareStatement("USE Artifacts_Agency");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            statement = con.prepareStatement("SELECT * FROM Artist");
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Table Artist does not exist creating");
            createTableArtist();
        }

        try {
            statement = con.prepareStatement("SELECT * FROM ContactPerson");
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Table Artist does not exist creating");
            createTableContactPerson();
        }

        try {
            statement = con.prepareStatement("SELECT * FROM Venue");
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Table Venue does not exist creating");
            createTableVenue();
        }

        try {
            statement = con.prepareStatement("SELECT * FROM Booking");
            resultSet = statement.executeQuery();
        } catch (SQLException e) {
            System.out.println("Table Booking does not exist creating");
            createTableBooking();
        }
    }

    private void createDB() {
        try {
            statement = con.prepareStatement("CREATE DATABASE Artifacts_Agency");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTableArtist() {
        try {
            statement = con.prepareStatement("CREATE TABLE Artifacts_Agency.Artist(cpr char(10) NOT NULL Primary Key, artistName VARCHAR(25), firstname VARCHAR(25) NOT NULL, lastname VARCHAR(30) NOT NULL, address VARCHAR(50), telephone INT)");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTableContactPerson() {
        try {
            statement = con.prepareStatement("CREATE TABLE Artifacts_Agency.ContactPerson(email VARCHAR(50) NOT NULL Primary Key, firstname VARCHAR(25) NOT NULL, lastname VARCHAR(30) NOT NULL, address VARCHAR(50), telephone INT NOT NULL)");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTableVenue() {
        try {
            statement = con.prepareStatement("CREATE TABLE Artifacts_Agency.Venue(cvr INT NOT NULL Primary Key, name VARCHAR(50) NOT NULL, address VARCHAR(50), telephone INT NOT NULL)");
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void createTableBooking() {
        try {
            statement = con.prepareStatement("CREATE TABLE Artifacts_Agency.Booking(cpr CHAR(10) NOT NULL, cvr INT NOT NULL, email VARCHAR(50) NOT NULL, date DATE NOT NULL, price INT NOT NULL, comment TEXT, PRIMARY KEY(cpr, cvr, email), FOREIGN KEY(cpr) REFERENCES Artist(cpr), FOREIGN KEY(cvr) REFERENCES Venue(cvr), FOREIGN KEY(email) REFERENCES ContactPerson(email))");
            statement.executeUpdate();
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
