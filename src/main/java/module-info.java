module cse.g5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens cse.g5 to javafx.fxml;
    opens cse.g5.Shemanto.oop_scenes to javafx.fxml;
    exports cse.g5;
}