package com.cetc.example;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login extends Application{

    public void start(Stage primaryStage) throws Exception {

        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(10);
        gridPane.setVgap(10);
//        gridPane.setPadding(new Insets(25, 25, 25, 25));

        Text welcome = new Text("Welcome");
        welcome.setFont(Font.font("Tahoma", FontWeight.BOLD, 20));
        welcome.setId("welcome");
        gridPane.add(welcome, 0, 0, 2, 1);

        Label username = new Label("UserName:");
        gridPane.add(username, 0, 1);

        Label password = new Label("Password:");
        gridPane.add(password, 0, 2);

        TextField userNameText = new TextField();
        gridPane.add(userNameText, 1, 1);

        TextField passwordText = new TextField();
        gridPane.add(passwordText, 1, 2);

        //一个按钮Node
        Button button = new Button("Login");
        //一层box,子元素按设置的10排列
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BASELINE_RIGHT);
        hBox.getChildren().add(button);
        gridPane.add(hBox, 1, 4);

        final Text text = new Text();
        gridPane.add(text, 0, 4, 2, 1);

        button.setOnAction(event -> {
            text.setFill(Color.RED);
            text.setText("login button pressed");
        });

        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        scene.getStylesheets().add(Thread.currentThread().getContextClassLoader().getResource("example/css/login.css").toExternalForm());
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
