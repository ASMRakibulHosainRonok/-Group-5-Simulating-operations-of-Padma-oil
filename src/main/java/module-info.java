module cse.g5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    exports cse.g5;
    exports cse.g5.Afm;

    opens cse.g5 to javafx.fxml;
    opens cse.g5.Afm to javafx.fxml, javafx.graphics;
    opens cse.g5.Shemanto.oop_scenes to javafx.fxml;
}
