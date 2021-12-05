package com.example.java_assignment3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;


public class Controller {
   @FXML
    public TextField emailText;
    @FXML
    public PasswordField passwordText;
    @FXML
    public Label success;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
