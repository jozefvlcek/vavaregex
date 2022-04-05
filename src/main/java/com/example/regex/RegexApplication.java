package com.example.regex;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class RegexApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(RegexApplication.class.getResource("regex.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        scene.getRoot().setStyle("-fx-font-family: 'serif';");
        stage.setTitle("VAVA cvicenie");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}