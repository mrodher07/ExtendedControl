module com.example.extendedcontrol {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.extendedcontrol to javafx.fxml;
    exports com.example.extendedcontrol;
}