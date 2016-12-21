package Model;

public class ContactPerson extends Person
{
    public ContactPerson(String firstName, String lastName, String address, int phoneNumber, String email)
    {
        super(firstName, lastName, address, phoneNumber, email);
    }

    public String toString() {
        return email;
    }
}
