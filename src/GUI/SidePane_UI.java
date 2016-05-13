package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;

/**
 * Created by Stormwind on 13/05/2016.
 */
public class SidePane_UI
{
    Button newArtist, newVenue, newContactPerson, history, newBooking;
    GridPane gridPane;

    public Pane sidePane()
    {
        newArtist = new Button("New Artist");
        newArtist.setPrefSize(150, 20);

        newVenue = new Button("New Venue");
        newVenue.setPrefSize(150, 20);

        newContactPerson = new Button("New Contact Person");
        newContactPerson.setPrefSize(150, 20);

        history = new Button("History");
        history.setPrefSize(150, 20);

        newBooking = new Button("New Booking");
        newBooking.setStyle("-fx-border-color: darkred");

        newBooking.setPrefSize(150, 40);

        gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(0, 30, 30, 30));
//        gridPane.setAlignment(Pos.TOP_CENTER);

        gridPane.add(newArtist, 0, 3, 2, 1);
        gridPane.add(newVenue, 0, 6, 2, 1);
        gridPane.add(newContactPerson, 0, 9, 2, 1);
        gridPane.add(history, 0, 12, 2, 1);
        gridPane.add(newBooking, 0, 30, 2, 1);

        return gridPane;
    }
}
