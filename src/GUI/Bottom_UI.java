package GUI;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 * Created by Stormwind on 13/05/2016.
 */
public class Bottom_UI
{
    Button exit;
    VBox vBox;

    public VBox bottomLine()
    {
        exit = new Button("Exit");
        exit.setPrefSize(100, 20);

        vBox = new VBox();
        vBox.setAlignment(Pos.CENTER_RIGHT);
        vBox.setSpacing(10);
        vBox.getChildren().add(exit);

        return vBox;
    }
}
