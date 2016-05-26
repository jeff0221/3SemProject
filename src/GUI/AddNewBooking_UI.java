package GUI;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.stage.Modality;
import javafx.stage.Stage;

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


    ComboBox artistComboBox;
    ComboBox venueComboBox;
    DatePicker datePicker = new DatePicker();
    Label titleLabel;
    TextField priceTextField = new TextField();
    TextArea textArea = new TextArea();
    Button bookButton = new Button("Confirm Booking");
    Button cancelButton = new Button("Cancel");




    public AddNewBooking_UI()
    {
        titleLabel = new Label("Add new artist");
        titleLabel.setFont(new Font("Verdana", 20));
        titleLabel.setLayoutX(125);
        titleLabel.setLayoutY(25);

        artistComboBox = new ComboBox();
        artistComboBox.setPromptText("Select Artist");
        artistComboBox.setPrefSize(150, 10);

        venueComboBox = new ComboBox();
        venueComboBox.setPromptText("Select Venue");
        venueComboBox.setPrefSize(150, 10);

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

        textArea.setLayoutX(50);
        textArea.setLayoutY(240);
        textArea.setMaxWidth(300);
        textArea.setPromptText("Other information for this booking goes here..");

        bookButton.setLayoutX(30);
        bookButton.setLayoutY(450);

        cancelButton.setLayoutX(310);
        cancelButton.setLayoutY(450);
        cancelButton.setOnAction(event -> close());


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

    public void close()
    {
        addBookingStage.close();
    }

}
