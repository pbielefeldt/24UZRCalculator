module com.example.vierentwintiguurszeilracecalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.vierentwintiguurszeilracecalculator to javafx.fxml;
    exports com.example.vierentwintiguurszeilracecalculator;
}