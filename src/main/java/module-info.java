module com.example.veterinaria_patitas_peludas {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    exports programacionIII.veterinaria.aplication;
    opens programacionIII.veterinaria.aplication to javafx.fxml;
    exports programacionIII.veterinaria.controller;
    opens programacionIII.veterinaria.controller to javafx.fxml;
}