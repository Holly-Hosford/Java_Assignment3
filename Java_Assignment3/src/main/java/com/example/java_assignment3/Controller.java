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
    protected void onSubmitButtonClick() {
        CheckRequirements test = new CheckRequirements(passwordText, emailText);
        boolean check1 = test.passwordLength();
        boolean check2 = test.oneLetter();
        boolean check3 = test.oneDigit();
        boolean check4 = test.oneSymbol();
        boolean check5 = test.emailCorrect();
    }
}
