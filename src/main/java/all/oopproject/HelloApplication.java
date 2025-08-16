package all.oopproject;

import all.oopproject.poros.Driver;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Locate the FXML file safely
        URL fxmlLocation = getClass().getResource("/all/oopproject/loginView.fxml");
        if (fxmlLocation == null) {
            throw new IOException("FXML file not found: /all/oopproject/loginView.fxml");
        }

        FXMLLoader fxmlLoader = new FXMLLoader(fxmlLocation);

        // Load scene (you can set fixed width/height if desired)
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        // Set up the stage
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}