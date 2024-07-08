module com.example.asmithrmanagement2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;
    requires java.sql;

    opens com.example.asmithrmanagement2 to javafx.fxml;
    exports com.example.asmithrmanagement2;
}