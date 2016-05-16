package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Stormwind on 13/05/2016.
 */
public class SidePane_UI
{
    Button newArtist, newVenue, newContactPerson, history, newBooking;
    Text text;
    GridPane gridPane;

    Stage primaryStage;

    public SidePane_UI(Stage primaryStage) {
        this.primaryStage = primaryStage;
    }

    public Pane sidePane()
    {
        newArtist = new Button("New Artist");
        newArtist.setPrefSize(150, 20);

        newVenue = new Button("New Venue");
        newVenue.setPrefSize(150, 20);
        newVenue.setOnAction(e -> addVenue());

        newContactPerson = new Button("New Contact Person");
        newContactPerson.setPrefSize(150, 20);
        newContactPerson.setOnAction(e -> addContactPerson());

        history = new Button("History");
        history.setPrefSize(150, 20);

        newBooking = new Button("New Booking");
        newBooking.setStyle("-fx-border-color: darkred");
        newBooking.setPrefSize(150, 40);

        text = new Text("Menu");
        text.setStyle("-fx-font-size: 200%");


        gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(0, 30, 30, 30));

        gridPane.add(text, 0, 3, 2, 1);
        gridPane.add(newArtist, 0, 6, 2, 1);
        gridPane.add(newVenue, 0, 9, 2, 1);
        gridPane.add(newContactPerson, 0, 12, 2, 1);
        gridPane.add(history, 0, 15, 2, 1);
        gridPane.add(newBooking, 0, 33, 2, 1);

        return gridPane;
    }

    public void addContactPerson() {
        Stage addContactPersonStage = new Stage();
        GridPane gridPane = new GridPane();

        Label firstName = new Label("First name: ");
        Label lastName = new Label("Last name: ");
        Label phoneNumber = new Label("Phone number: ");
        Label emailAddress = new Label("Email address: ");

        TextField tfFirstName = new TextField();
        TextField tfLastName = new TextField();
        TextField tfPhoneNumber = new TextField();
        TextField tfEmailAddress = new TextField();

        Button btnAdd = new Button("Add");
        Button btnCancel = new Button("Cancel");

        HBox btnCancelContainer = new HBox();

        gridPane.add(firstName, 0, 0);
        gridPane.add(lastName, 0, 1);
        gridPane.add(phoneNumber, 0, 2);
        gridPane.add(emailAddress, 0, 3);

        gridPane.add(tfFirstName, 1, 0);
        gridPane.add(tfLastName, 1, 1);
        gridPane.add(tfPhoneNumber, 1, 2);
        gridPane.add(tfEmailAddress, 1, 3);

        btnCancelContainer.getChildren().addAll(btnCancel);
        btnCancelContainer.setAlignment(Pos.BASELINE_RIGHT);

        gridPane.add(btnAdd, 0, 4);
        gridPane.add(btnCancelContainer, 1, 4);

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        gridPane.setPadding(new Insets(20, 20, 20, 20));

        Scene scene = new Scene(gridPane);

        addContactPersonStage.setScene(scene);
        addContactPersonStage.initModality(Modality.APPLICATION_MODAL);
        addContactPersonStage.showAndWait();
    }

    public void addVenue() {
        Stage addVenueStage = new Stage();
        GridPane gridPane = new GridPane();

        Label name = new Label("Name: ");
        Label location = new Label("Location: ");
        Label date = new Label("Date: ");

        name.setPrefWidth(80);
        location.setPrefWidth(80);
        date.setPrefWidth(80);

        TextField tfName = new TextField();
        TextField tfLocation = new TextField();

        Button btnAdd = new Button("Add");
        Button btnCancel = new Button("Cancel");

        HBox btnCancelContainer = new HBox();

        DatePicker venueDatePicker = new DatePicker();

        gridPane.add(name, 0, 0);
        gridPane.add(location, 0, 1);
        gridPane.add(date, 0, 2);

        gridPane.add(tfName, 1, 0);
        gridPane.add(tfLocation, 1, 1);
        gridPane.add(venueDatePicker, 1, 2);

        btnCancelContainer.getChildren().addAll(btnCancel);
        btnCancelContainer.setAlignment(Pos.BASELINE_RIGHT);

        gridPane.add(btnAdd, 0, 4);
        gridPane.add(btnCancelContainer, 1, 4);

        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(20, 20, 20, 20));

        Scene scene = new Scene(gridPane);

        addVenueStage.setScene(scene);
        addVenueStage.initModality(Modality.APPLICATION_MODAL);
        addVenueStage.showAndWait();
    }
}
