package Model;

import java.util.Date;

/**
 * Created by Zonde on 13-05-2016.
 */
public class Booking
{
    private int price;
    private Date date;
    private Artist artist;
    private ContactPerson contactPerson;
    private Venue venue;
    private String comment;

    public int getPrice()
    {
        return price;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public Artist getArtist()
    {
        return artist;
    }

    public void setArtist(Artist artist)
    {
        this.artist = artist;
    }

    public ContactPerson getContactPerson()
    {
        return contactPerson;
    }

    public void setContactPerson(ContactPerson contactPerson)
    {
        this.contactPerson = contactPerson;
    }

    public Venue getVenue()
    {
        return venue;
    }

    public void setVenue(Venue venue)
    {
        this.venue = venue;
    }

    public String getComment()
    {
        return comment;
    }

    public void setComment(String comment)
    {
        this.comment = comment;
    }
}
