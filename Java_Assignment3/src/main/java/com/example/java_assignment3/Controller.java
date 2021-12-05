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
   
    if (check1 & check2 & check3 & check4 & check5) {
            success.setText("Registration was successful");
            success.setOpacity(100);
        }
   
    else if (check1 & check2 & check3 & check4 & !check5) {
            success.setText("The password is very strong but the email is formatted badly");
            success.setOpacity(100);
        }
   
    else if (!check1 | !check2 | !check3 | !check4) {
            success.setText("The password is not strong enough");
            success.setOpacity(100);
        }
    else if (check5) {
            success.setText("The email is well-formed");
            success.setOpacity(100);
        }
}
