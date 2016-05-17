package Model;

/**
 * Created by Zonde on 13-05-2016.
 */

public class Database
{
    private Database instance;

    private Database()
    {
        connectToDatabase();
    }

    public Database getInstance()
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
