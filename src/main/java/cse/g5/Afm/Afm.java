package cse.g5.Afm;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Afm extends Application {

    public static void main(String[] args) {
        launch(args); // This will ignore any external setup and only start this application
    }

    @Override
    public void start(Stage primaryStage) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("/cse/g5/Afm/feedbackmonitor.fxml"));
            primaryStage.setScene(new Scene(root));
            primaryStage.setTitle("AFM Feedback Monitor");
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace(); // Log error if feedbackmonitor.fxml is missing or incorrect
        }
    }
}
