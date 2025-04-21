import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PleaseProvideControllerClassName {

    @FXML
    private TableView<?> bill_table;

    @FXML
    private TextField customer_id;

    @FXML
    private TextField order_number;

    @FXML
    void check_payment(ActionEvent event) {

    }

    @FXML
    void check_payment_on_click(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Ronok/billind_admin/check_payments.fxml"));
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
    void generate_bills(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Ronok/billind_admin/generate_bills.fxml"));
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
    void report_monthly(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Ronok/billind_admin/report_monthly.fxml"));
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
    void send_invoices(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Ronok/billind_admin/send_Invoices.fxml"));
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
    void submit_button(ActionEvent event) {

    }

    @FXML
    void update_records(ActionEvent actionEvent) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Ronok/billind_admin/update_records.fxml"));
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

}
