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
        bookingTab.setClosable(false);
        contactPersonTab = new Tab("Contact Person");
        contactPersonTab.setClosable(false);

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
        artistName.setPrefWidth(100);
        TableColumn firstName = new TableColumn("First Name");
        firstName.setPrefWidth(100);
        TableColumn lastName = new TableColumn("Last Name");
        lastName.setPrefWidth(100);
        TableColumn address = new TableColumn("Address");
        address.setPrefWidth(100);
        TableColumn cpr = new TableColumn("Cpr");
        cpr.setPrefWidth(50);
        TableColumn phoneNumber = new TableColumn("Phone Number");
        phoneNumber.setPrefWidth(120);
        TableColumn email = new TableColumn("E-Mail");
        email.setPrefWidth(120);

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
        firstName.setPrefWidth(100);
        TableColumn lastName = new TableColumn("Last Name");
        lastName.setPrefWidth(100);
        TableColumn address = new TableColumn("Address");
        address.setPrefWidth(100);
        TableColumn phoneNumber = new TableColumn("Phone Number");
        phoneNumber.setPrefWidth(120);
        TableColumn email = new TableColumn("E-Mail");
        email.setPrefWidth(120);

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
        date.setPrefWidth(100);
        TableColumn artist = new TableColumn("Artist");
        artist.setPrefWidth(100);
        TableColumn contactPerson = new TableColumn("Contact Person");
        contactPerson.setPrefWidth(150);
        TableColumn venue = new TableColumn("Venue");
        venue.setPrefWidth(100);
        TableColumn price = new TableColumn("Price");
        price.setPrefWidth(100);
        TableColumn comment = new TableColumn("Comment");
        comment.setPrefWidth(150);

        // Set bookingTable columns to TabeColumns
        bookingTable.getColumns().addAll(date, artist, contactPerson, venue, price, comment);

        // Set artsit column to update from field artist in Booking
        artist.setCellValueFactory(new PropertyValueFactory<>("artsit"));

        // Set the observable list for table
        bookingTable.setItems(bookingList);


        return bookingTable;
    }


}
