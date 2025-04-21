package cse.g5.Shemanto.oop_scenes;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Useraccess {

    @javafx.fxml.FXML
    private CheckBox removeusercheckbox;

    @javafx.fxml.FXML
    private Button savechangestouserbutton;

    @javafx.fxml.FXML
    private TextField enterusernametextfield;

    @javafx.fxml.FXML
    private ComboBox userrolecombobox;

    @javafx.fxml.FXML
    private CheckBox addusertocheckbox;

    @javafx.fxml.FXML
    private CheckBox modifyusercheckbox;

    @javafx.fxml.FXML
    public void SystemUpdateonaction(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/cse/g5/Shemanto/oop_scenes/7/3_useraccess.fxml"));
            Parent root = fxmlLoader.load();
            Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Dashboard");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
