package Model;

/**
 * Created by Zonde on 13-05-2016.
 */

public class Artist extends Person
{
    private String cpr;

    public Artist(String firstName, String lastName, String address, int phoneNumber, String cpr)
    {
        super(firstName, lastName, address, phoneNumber);
        this.cpr = cpr;
    }

    public String getCpr()
    {
        return cpr;
    }

    public void setCpr(String cpr)
    {
        this.cpr = cpr;
    }
}
