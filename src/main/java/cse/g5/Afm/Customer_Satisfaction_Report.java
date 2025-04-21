package cse.g5.Afm;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class Customer_Satisfaction_Report {

    @FXML
    private DatePicker selectmonthdatepicker;

    @FXML
    private TextArea reportoutputtextarea;

    @FXML
    private Button sharereporttomanagementbutton;

    // Generate Report Button
    @FXML
    private void onactionmousebuttonclickgeneratereport(ActionEvent event) {
        if (selectmonthdatepicker.getValue() != null) {
            String month = selectmonthdatepicker.getValue().getMonth().toString();
            reportoutputtextarea.setText("Customer Satisfaction Report for " + month + "\n\n- Data Summary Here -");
        } else {
            reportoutputtextarea.setText("Please select a month to generate the report.");
        }
    }

    // Share Report to Management Button
    @FXML
    private void onactionmousebuttonclicksharereporttomanagement(ActionEvent event) {
        String report = reportoutputtextarea.getText();
        if (report.isBlank()) {
            reportoutputtextarea.setText("Please generate the report before sharing.");
        } else {
            reportoutputtextarea.setText(report + "\n\n✅ Report successfully shared with management.");
        }
    }

    // Scene switching helper
    private void switchScene(ActionEvent event, String fxmlPath) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Parent root = loader.load();
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML private void onactionmousebuttonclickswitchscenetohandleinqueries(ActionEvent event) {
        switchScene(event, "/cse/g5/Afm/OOP_scenes_u5/Handle Inquries u5.fxml");
    }

    @FXML private void onactionmousebuttonclickswitchscenetoprocessrefund(ActionEvent event) {
        switchScene(event, "/cse/g5/Afm/OOP_scenes_u5/process refund u5.fxml");
    }

    @FXML private void onactionmousebuttonclickswitchscenetoloyaltyprogram(ActionEvent event) {
        switchScene(event, "/cse/g5/Afm/OOP_scenes_u5/Loyalty program u5.fxml");
    }

    @FXML private void onactionmousebuttonclickswitchscenetoupdateaccountinfo(ActionEvent event) {
        switchScene(event, "/cse/g5/Afm/OOP_scenes_u5/updatecustomerinfo u5.fxml");
    }

    @FXML private void onactionmousebuttonclickswitchscenetomonitorfeedback(ActionEvent event) {
        switchScene(event, "/cse/g5/Afm/OOP_scenes_u5/feedback monitor.fxml");
    }

    @FXML private void onactionmousebuttonclickswitchscenetoresolvecomplaints(ActionEvent event) {
        switchScene(event, "/cse/g5/Afm/OOP_scenes_u5/resolve delivery compalint.fxml");
    }

    @FXML private void onactionmousebuttonclickswitchscenetofueltips(ActionEvent event) {
        switchScene(event, "/cse/g5/Afm/OOP_scenes_u5/fuel tips.fxml");
    }

    @FXML private void onactionmousebuttonclickswitchscenetosatisfactionreport(ActionEvent event) {
        switchScene(event, "/cse/g5/Afm/OOP_scenes_u5/customer_satisfaction_report.fxml");
    }
}
