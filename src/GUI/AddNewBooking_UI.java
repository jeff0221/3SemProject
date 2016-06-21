package GUI;

import Controller.AddNewBooking_Controller;
import Model.Artist;
import Model.Venue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by peterzohdy on 24/05/2016.
 */
public class AddNewBooking_UI
{
    private Scene scene;
    private Stage addBookingStage;
    private Pane pane = new Pane();
    HBox hBox = new HBox();
    HBox hBox2 = new HBox();


    ComboBox<Model.Artist> artistComboBox;
    ComboBox<Model.ContactPerson> contactPersonComboBox; //TODO: implement
    ComboBox<Model.Venue> venueComboBox;
    DatePicker datePicker = new DatePicker();
    Label titleLabel;
    TextField priceTextField = new TextField();
    TextField bookingCommentTextField;
    TextArea textArea = new TextArea();
    Button bookButton = new Button("Confirm Booking");
    Button cancelButton = new Button("Cancel");


    public AddNewBooking_UI()
    {
        titleLabel = new Label("Add New Booking");
        titleLabel.setFont(new Font("Verdana", 20));
        titleLabel.setLayoutX(125);
        titleLabel.setLayoutY(25);

        artistComboBox = new ComboBox();
        artistComboBox.setPromptText("Select Artist");
        artistComboBox.setPrefSize(150, 10);
        ArrayList<Artist> artistList = new ArrayList<Artist>(); //creates arrayList ready to be made into observable list
        ObservableList obsArtistList = FXCollections.observableArrayList(artistList); //changes into observable list because observable list can't be instantiated on its own
        Model.Database.getInstance().getArtists(obsArtistList);
        artistComboBox.setItems(obsArtistList);

        venueComboBox = new ComboBox();
        venueComboBox.setPromptText("Select Venue");
        venueComboBox.setPrefSize(150, 10);
        ArrayList<Venue> venueList = new ArrayList<Venue>(); //creates arrayList ready to be made into observable list
        ObservableList obsVenueList = FXCollections.observableArrayList(venueList); //changes into observable list because observable list can't be instantiated on its own
        Model.Database.getInstance().getVenues(obsVenueList);
        venueComboBox.setItems(obsVenueList);

        hBox.setSpacing(40);
        hBox.setPadding(new Insets(80, 0, 0, 30));

        hBox2.setLayoutY(80);
        hBox2.setSpacing(40);
        hBox2.setPadding(new Insets(80, 0, 0, 30));

        datePicker.setMaxWidth(150);
        datePicker.setPromptText("Select Date");
        priceTextField.setMaxWidth(150);
        priceTextField.setPromptText("Artist salary in DKK");

        hBox.getChildren().addAll(artistComboBox, venueComboBox);
        hBox2.getChildren().addAll(datePicker, priceTextField);

        //fasjhfdaskljdfhaslkdjfhasdklfjahsdkfjads


        textArea.setLayoutX(50);
        textArea.setLayoutY(240);
        textArea.setMaxWidth(300);
        textArea.setPromptText("Other information for this booking goes here..");

        bookButton.setLayoutX(30);
        bookButton.setLayoutY(450);
        bookButton.setOnAction(event -> {AddNewBooking_Controller.getInstance().
                operateInsertion(priceTextField.getText(),datePicker,artistComboBox.getSelectionModel().getSelectedItem(),
                        contactPersonComboBox.getSelectionModel().getSelectedItem(),venueComboBox.getSelectionModel().getSelectedItem(),
                        bookingCommentTextField.getText());
        AddNewBooking_Controller.getInstance().closeInsertion(addBookingStage);});

        cancelButton.setLayoutX(310);
        cancelButton.setLayoutY(450);
        cancelButton.setOnAction(event -> AddNewBooking_Controller.getInstance().closeInsertion(addBookingStage));


        pane.getChildren().addAll(titleLabel, hBox, hBox2, textArea, bookButton, cancelButton);


        scene = new Scene(pane, 400, 500);

    }

    public void showAndWait()
    {
        addBookingStage = new Stage();
        addBookingStage.setScene(scene);
        addBookingStage.initModality(Modality.APPLICATION_MODAL);
        addBookingStage.showAndWait();
    }



}
