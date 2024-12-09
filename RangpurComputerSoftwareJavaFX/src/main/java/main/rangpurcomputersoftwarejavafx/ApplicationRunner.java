package main.rangpurcomputersoftwarejavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class ApplicationRunner extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("MainForm.fxml"));

        Scene scene = new Scene(root);

        stage.setTitle("Rangpur Computer Center");
        stage.setResizable(true);
        stage.initStyle(StageStyle.TRANSPARENT);

        stage.setFullScreen(true);
        //stage.setMaxWidth(900);
        //stage.setMaxHeight(700);

        stage.setMinWidth(800);
        stage.setMinHeight(600);

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}