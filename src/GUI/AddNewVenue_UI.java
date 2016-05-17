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
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * Created by Lasse Jensen on 17-05-2016.
 */
public class AddNewVenue_UI {

    private Scene scene;
    private GridPane gridPane = new GridPane();

    private Label name = new Label("Name: ");
    private Label location = new Label("Location: ");
    private Label date = new Label("Date: ");

    private TextField tfName = new TextField();
    private TextField tfLocation = new TextField();

    private Button btnAdd = new Button("Add");
    private Button btnCancel = new Button("Cancel");

    private HBox btnCancelContainer = new HBox();

    private DatePicker venueDatePicker = new DatePicker();

    public AddNewVenue_UI() {
        name.setPrefWidth(80);
        location.setPrefWidth(80);
        date.setPrefWidth(80);

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

        scene = new Scene(gridPane);
    }

    public void showAndWait() {
        Stage addVenueStage = new Stage();

        addVenueStage.setScene(scene);
        addVenueStage.initModality(Modality.APPLICATION_MODAL);
        addVenueStage.showAndWait();
    }
}
