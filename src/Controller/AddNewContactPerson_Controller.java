package Controller;

import GUI.Warning_UI;
import Model.ContactPerson;
import Model.Database;
import javafx.stage.Stage;

/**
 * Created by Jeffrey on 23-05-2016.
 */
public class AddNewContactPerson_Controller{

    private static AddNewContactPerson_Controller instance;

    private AddNewContactPerson_Controller(){}

    public static AddNewContactPerson_Controller getInstance(){
        if(instance == null){
            instance = new AddNewContactPerson_Controller();
            return instance;
        }else{
            return instance;
        }
    }

    public void operateInsertion(String firstName, String lastName, String address, String phoneNumberString,String email){
        Warning_UI warning = new Warning_UI();
        int phoneNumber = Integer.parseInt(phoneNumberString);

        if(warning.alertWindow("Are you sure you want to save?","Are you sure you want to create a new contact with this information?")){
            Database.getInstance().insertContactPerson(new ContactPerson(firstName, lastName, address, phoneNumber, email));
        }
    }

    public void closeInsertion(Stage stage)
    {
        stage.close();
    }
}
