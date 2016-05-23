package Controller;

import GUI.Warning_UI;
import Model.Artist;
import Model.Database;
import javafx.stage.Stage;

/**
 * Created by Jeffrey on 18-05-2016.
 */
public class AddNewArtist_Controller{
    public void operateInsertion(String firstName, String lastName, String address, int phoneNumber,String email, String cpr, String artistName){
        Warning_UI warning = new Warning_UI();
        if(warning.alertWindow("Are you want to save?","Are you sure you want to create a new artist with this information?")){
        Database.getInstance().insertArtist(new Artist(firstName,lastName,address,phoneNumber,email,cpr,artistName));
        }
    }

    public void closeAddition(Stage stage)
    {
        stage.close();
    }

}
