package com.cetc.browser;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WebApplication extends Application {

    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Browser");
        Scene scene = new Scene(new Browser(), 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
