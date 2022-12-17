module com.example.courswork {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.courswork to javafx.fxml;
    exports com.example.courswork;
}