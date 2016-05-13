package GUI;

import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

/**
 * Created by Stormwind on 13/05/2016.
 */
public class Tab_UI
{
    TabPane tabPane;
    Tab artistTab, venueTab, dateTab, priceTab, bookingTab, contactPersonTab;

    public TabPane tabPane_UI()
    {
        tabPane = new TabPane();
        artistTab = new Tab("Artist");
        artistTab.setClosable(false);
        venueTab = new Tab("Venue");
        venueTab.setClosable(false);
        dateTab = new Tab("Date");
        dateTab.setClosable(false);
        priceTab = new Tab("Price");
        priceTab.setClosable(false);
        bookingTab = new Tab("Bookings");
        bookingTab.setClosable(false);
        contactPersonTab = new Tab("Contact Person");
        contactPersonTab.setClosable(false);

        tabPane.getTabs().addAll(bookingTab, contactPersonTab, artistTab, venueTab, dateTab, priceTab);

//        bookingTab.setContent();
//        contactPersonTab.setContent();
//        artistTab.setContent();
//        venueTab.setContent();
//        dateTab.setContent();
//        priceTab.setContent();

        return tabPane;
    }
}
