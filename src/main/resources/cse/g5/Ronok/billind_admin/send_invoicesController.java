import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.TreeTableColumn;

public class PleaseProvideControllerClassName {

    @FXML
    private TreeTableColumn<?, ?> bill_table;

    @FXML
    private TextField customer_id;

    @FXML
    private TextField order_no;

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
    void print_bill(ActionEvent event) {

    }

    @FXML
    void refresh(ActionEvent actionEvent) {
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
    void update_records(ActionEvent event) {

    }

}
