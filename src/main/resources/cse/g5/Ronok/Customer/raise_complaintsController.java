import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PleaseProvideControllerClassName {

    @FXML
    private TextArea complaints;

    @FXML
    private TextField customer_id;

    @FXML
    private TextField order_no;

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
    void order_confirmation(ActionEvent event) {

    }

    @FXML
    void place_order(ActionEvent event) {

    }

    @FXML
    void raise_complaints(ActionEvent event) {

    }

    @FXML
    void submit_complaint(ActionEvent event) {

    }

    @FXML
    void track_order(ActionEvent event) {

    }

}
