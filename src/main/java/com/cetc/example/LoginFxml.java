package com.cetc.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginFxml extends Application{

    public void start(Stage primaryStage) throws Exception {
        Parent load = FXMLLoader.load(Thread.currentThread().getContextClassLoader().getResource("example/fxml/login.fxml"));
        Scene scene = new Scene(load, 400, 300);
        scene.getStylesheets().add(Thread.currentThread().getContextClassLoader().getResource("example/css/login.css").toExternalForm());
        primaryStage.setTitle("Login Fxml");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
