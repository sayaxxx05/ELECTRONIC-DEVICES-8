module org.example.electronic_devices {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.electronic_devices to javafx.fxml;
    exports org.example.electronic_devices;
}