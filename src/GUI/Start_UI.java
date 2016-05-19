package GUI;

import Model.Database;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Created by Stormwind on 09/05/2016.
 */
public class Start_UI extends Application
{
    Database dataBase;

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {

        dataBase = Database.getInstance();

        SidePane_UI side = new SidePane_UI();
        Bottom_UI bottom = new Bottom_UI();
        Home_UI home = new Home_UI();
        Top_UI top = new Top_UI();
        Tab_UI tab = new Tab_UI();

        Scene scene = new Scene(home.homePane(side.sidePane(), bottom.bottomLine(), top.logo(), tab.tabPane_UI()));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Artifacts Agency");
        primaryStage.show();
    }

}
