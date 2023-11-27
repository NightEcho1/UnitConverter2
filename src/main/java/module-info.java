module com.example.unitconverter {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.unitconverter to javafx.fxml;
    exports com.example.unitconverter;
}