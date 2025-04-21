package cse.g5.Afm;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class feedbackmonitorController {

    @FXML
    private Button analyzefeedbackbutton;

    @FXML
    private TextArea feedbacklogtextarea;

    @FXML
    private Button generatetrendsummaryoffeedbackbutton;

    @FXML
    void onactionmousebuttonclickswitchscenetofueltips(ActionEvent event) {
        switchScene(event, "fueltips.fxml");
    }

    @FXML
    void onactionmousebuttonclickswitchscenetohandleinqueries(ActionEvent event) {
        switchScene(event, "HandleInquires.fxml");
    }

    @FXML
    void onactionmousebuttonclickswitchscenetoloyaltyprogram(ActionEvent event) {
        switchScene(event, "Loyaltyprogram.fxml");
    }

    @FXML
    void onactionmousebuttonclickswitchscenetomonitorfeedback(ActionEvent event) {
        switchScene(event, "feedbackmonitor.fxml");
    }

    @FXML
    void onactionmousebuttonclickswitchscenetoprocessrefund(ActionEvent event) {
        switchScene(event, "processrefund.fxml");
    }

    @FXML
    void onactionmousebuttonclickswitchscenetoresolvecomplaints(ActionEvent event) {
        switchScene(event, "resolvedeliverycomplaint.fxml");
    }

    @FXML
    void onactionmousebuttonclickswitchscenetosatisfactionreport(ActionEvent event) {
        switchScene(event, "customersatisfactionreport.fxml");
    }

    @FXML
    void onactionmousebuttonclickswitchscenetoupdateaccountinfo(ActionEvent event) {
        switchScene(event, "updatecustomerinfo.fxml");
    }

    private void switchScene(ActionEvent event, String fxmlFile) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/cse/g5/Afm/" + fxmlFile));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
