import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

public class PleaseProvideControllerClassName {

    @FXML
    private TextField customer_id;

    @FXML
    private TreeTableColumn<?, ?> customer_id_table;

    @FXML
    private DatePicker order_date;

    @FXML
    private TextField order_no;

    @FXML
    private TextField payment_amount;

    @FXML
    void check_payment(ActionEvent event) {

    }

    @FXML
    void generate_bills(ActionEvent event) {

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
    void report_monthly(ActionEvent event) {

    }

    @FXML
    void send_invoices(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

    @FXML
    void update_records(ActionEvent event) {

    }

}
