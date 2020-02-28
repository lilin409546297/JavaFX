package com.cetc.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class LoginController{

    @FXML
    private Text loginView;

    @FXML
    private void loginHandler(ActionEvent activeEvent) {
        loginView.setFill(Color.RED);
        loginView.setText("login button pressed");
    }

}