package pl.widzin;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static final String PATH_TO_MAIN = "/fxml/Main.fxml";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource(PATH_TO_MAIN));
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("Hello world");
        primaryStage.show();
    }
}
