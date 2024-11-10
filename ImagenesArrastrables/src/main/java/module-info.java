module com.example.imagenesarrastrables {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.imagenesarrastrables to javafx.fxml;
    opens com.example.imagenesarrastrables.controller to javafx.fxml;
    exports com.example.imagenesarrastrables;
}