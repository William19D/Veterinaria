package programacionIII.veterinaria.aplication;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import programacionIII.veterinaria.model.PatitasPeludas;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("/view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 650,400 );
        stage.setTitle("Veterinaria Patitas Peludas");
        stage.getIcons().add(new javafx.scene.image.Image(getClass().getResourceAsStream("/logo.png")));
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);

    }

    public static void main(String[] args) {
        launch();
    }
}