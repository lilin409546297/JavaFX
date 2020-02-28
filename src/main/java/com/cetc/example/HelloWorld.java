package com.cetc.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class HelloWorld extends Application{

    public void start(Stage primaryStage) throws Exception {
        //按钮绑定事件
        Button button = new Button();
        button.setText("hello world");
        button.setOnAction(event -> System.out.println("hello world!!!"));

        StackPane stackPane = new StackPane();
        stackPane.getChildren().add(button);
        //大小
        Scene scene = new Scene(stackPane, 300, 500);

        //设置显示
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
