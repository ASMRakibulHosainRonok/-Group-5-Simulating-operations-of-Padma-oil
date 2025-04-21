import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;

public class PleaseProvideControllerClassName {

    @FXML
    private DatePicker date;

    @FXML
    private TableView<?> oil_detail_table;

    @FXML
    void approval_notification(ActionEvent event) {

    }

    @FXML
    void check_prices(ActionEvent event) {

    }

    @FXML
    void delivery_updates(ActionEvent event) {

    }

    @FXML
    void logout(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("src/main/resources/cse/g5/login.fxml"));
            Parent root = fxmlLoader.load();
            Node scene = (Node) actionEvent.getSource();
            Stage stage = (Stage) scene.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Dashboard");
            stage.show();
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    @FXML
    void oil_name(ActionEvent event) {

    }

    @FXML
    void oil_quantity(ActionEvent event) {

    }

    @FXML
    void order_confirmation(ActionEvent event) {

    }

    @FXML
    void place_order(ActionEvent event) {

    }

    @FXML
    void raise_complaints(ActionEvent event) {

    }

    @FXML
    void track_order(ActionEvent event) {

    }

}
