module cse.g5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse.g5 to javafx.fxml;
    exports cse.g5;
}