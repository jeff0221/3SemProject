package Model;

/**
 * Created by Zonde on 13-05-2016.
 */

public class Venue
{
    private String cvr;
    private String name;
    private String location;
    private int phoneNumber;

    public String getCvr()
    {
        return cvr;
    }

    public void setCvr(String cvr)
    {
        this.cvr = cvr;
    }

    public int getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getLocation()
    {
        return location;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }
}
