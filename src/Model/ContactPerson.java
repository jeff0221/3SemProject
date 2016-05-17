package Model;

/**
 * Created by Zonde on 13-05-2016.
 */
public class ContactPerson extends Person
{
    private String email;

    public ContactPerson(String firstName, String lastName, String address, int phoneNumber, String email)
    {
        super(firstName, lastName, address, phoneNumber);
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }
}
