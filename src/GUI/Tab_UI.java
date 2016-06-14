package GUI;

import Model.Artist;
import Model.Booking;


import Model.ContactPerson;
import Model.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * Created by Stormwind on 13/05/2016.
 */
public class Tab_UI
{
    TabPane tabPane;
    Tab artistTab, venueTab, bookingTab, contactPersonTab;

    ObservableList<Booking> bookingList = FXCollections.observableArrayList();
    ObservableList<Artist> artistList = FXCollections.observableArrayList();
    ObservableList<ContactPerson> contactPersonList = FXCollections.observableArrayList();

    public TabPane tabPane_UI()
    {
        tabPane = new TabPane();
        tabPane.setPadding(new Insets(30));
        tabPane.setTabMinWidth(150);
        artistTab = new Tab("Artist");
        artistTab.setClosable(false);
        venueTab = new Tab("Venue");
        venueTab.setClosable(false);
        bookingTab = new Tab("Bookings");
        bookingTab.setClosable(true);
        contactPersonTab = new Tab("Contact Person");
        contactPersonTab.setClosable(true);

        // Load tables from Database
        Database.getInstance().getArtists(artistList);
        Database.getInstance().getBookings(bookingList);
        Database.getInstance().getContactPersons(contactPersonList);
        //System.out.println(artistList.get(0).getArtistName());
        //System.out.println(artistList.get(0).getFirstName());
        //System.out.println(artistList.get(0).getEmail());

        // Set the content of Tabs to TableViews
        artistTab.setContent(getTableArtists());
        bookingTab.setContent(getTableBookings());
        contactPersonTab.setContent(getTableContactPersons());

        // Add the tab to tabPane
        tabPane.getTabs().addAll(artistTab, bookingTab, venueTab, contactPersonTab);

        return tabPane;
    }

    public TableView<Artist> getTableArtists() {
        // Create TableView for artistTable
        TableView<Artist> artistTable = new TableView<>();

        // Create TableColumn objects for artistTable
        TableColumn artistName = new TableColumn("Artist Name");
        TableColumn firstName = new TableColumn("First Name");
        TableColumn lastName = new TableColumn("Last Name");
        TableColumn address = new TableColumn("Address");
        TableColumn cpr = new TableColumn("Cpr");
        TableColumn phoneNumber = new TableColumn("PhoneNumber");
        TableColumn email = new TableColumn("eMail");

        // Set artistTable columns to TableColumns
        artistTable.getColumns().addAll(artistName, firstName, lastName, address, cpr, phoneNumber, email);

        // Set artistName column to update from field in Artist
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        cpr.setCellValueFactory(new PropertyValueFactory<>("cpr"));
        artistName.setCellValueFactory(new PropertyValueFactory<>("artistName"));
        phoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));

        // Set the observable list for table
        artistTable.setItems(artistList);

        return artistTable;
    }

    public TableView<ContactPerson> getTableContactPersons() {
        // Create TableView object contactPersonsTable
        TableView<ContactPerson> contactPersonTable = new TableView<>();

        // Create TableColumn objects for contactPersonTable
        TableColumn firstName = new TableColumn("First Name");
        TableColumn lastName = new TableColumn("Last Name");
        TableColumn address = new TableColumn("Address");
        TableColumn phoneNumber = new TableColumn("Phone Number");
        TableColumn email = new TableColumn("Email");

        // Set contactPersonTable columns to TableColumns
        contactPersonTable.getColumns().addAll(firstName, lastName, address, phoneNumber, email);

        // Set columns to update from appropriate fields
        firstName.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastName.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));
        phoneNumber.setCellValueFactory(new PropertyValueFactory<>("phoneNumber"));
        email.setCellValueFactory(new PropertyValueFactory<>("email"));

        // Set the observable list for table
        contactPersonTable.setItems(contactPersonList);

        return contactPersonTable;
    }

    public TableView<Booking> getTableBookings() {
        // Create TableView object bookingTable
        TableView<Booking> bookingTable = new TableView<>();

        // Create TableColumn objects for bookingTable
        TableColumn date = new TableColumn("Date");
        TableColumn artist = new TableColumn("Artist");
        TableColumn contactPerson = new TableColumn("Contact Person");
        TableColumn venue = new TableColumn("Venue");
        TableColumn price = new TableColumn("Price");
        TableColumn comment = new TableColumn("Comment");

        // Set bookingTable columns to TabeColumns
        bookingTable.getColumns().addAll(date, artist, contactPerson, venue, price, comment);

        // Set artsit column to update from field artist in Booking
        artist.setCellValueFactory(new PropertyValueFactory<>("artsit"));

        // Set the observable list for table
        bookingTable.setItems(bookingList);


        return bookingTable;
    }


}
