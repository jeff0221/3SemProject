package GUI;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;


public class AdminPane_UI
{
    Button delete, edit;
    Text text;
    GridPane gridPane;

    public AdminPane_UI()
    {

    }

    public Pane adminPane()
    {
        delete = new Button("Delete");
        delete.setPrefSize(150, 20);
//        delete.setOnAction(e -> );

        edit = new Button("Edit");
        edit.setPrefSize(150, 20);
//        edit.setOnAction(e -> );

        text = new Text("Admin");
        text.setStyle("-fx-font-size: 200%");

        gridPane = new GridPane();
        gridPane.setVgap(10);
        gridPane.setPadding(new Insets(0, 30, 30, 30));

        gridPane.add(text, 0, 3, 2, 1);
        gridPane.add(edit, 0, 6, 2, 1);
        gridPane.add(delete, 0, 9, 2, 1);

        return gridPane;
    }
}
