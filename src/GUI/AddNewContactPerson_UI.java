package GUI;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Lasse Jensen on 17-05-2016.
 */
public class AddNewContactPerson_UI {

    private Scene scene;
    private GridPane gridPane = new GridPane();

    private Label firstName = new Label("First name: ");
    private Label lastName = new Label("Last name: ");
    private Label phoneNumber = new Label("Phone number: ");
    private Label emailAddress = new Label("Email address: ");

    private TextField tfFirstName = new TextField();
    private TextField tfLastName = new TextField();
    private TextField tfPhoneNumber = new TextField();
    private TextField tfEmailAddress = new TextField();

    private Button btnAdd = new Button("Add");
    private Button btnCancel = new Button("Cancel");

    private HBox btnCancelContainer = new HBox();

    public AddNewContactPerson_UI() {
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

        scene = new Scene(gridPane);
    }

    public void showAndWait() {
        Stage addContactPersonStage = new Stage();

        addContactPersonStage.setScene(scene);
        addContactPersonStage.initModality(Modality.APPLICATION_MODAL);
        addContactPersonStage.showAndWait();
    }
}
