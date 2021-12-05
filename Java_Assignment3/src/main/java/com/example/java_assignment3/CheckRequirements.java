package com.example.java_assignment3;

public class CheckRequirements {
  private final PasswordField passwordText;
  private final TextField emailText;
  
  public CheckRequirements(PasswordField passwordText, TextField emailText) {
        this.passwordText = passwordText;
        this.emailText = emailText;
    }
  
  protected boolean passwordLength() {
        String passcode = this.passwordText.getText();
        boolean answer = false;
        if (passcode.length() >= 7){
            answer = true;
        };
        return answer;
    }
  
  protected boolean oneLetter() {
        String passcode = this.passwordText.getText();
        boolean answer = false;
        String regrex = (".*[a-zA-Z].*");
        if (passcode.matches(regrex)) {
            answer = true;
        }
        return answer;
    }
  
  protected boolean oneDigit() {
        String passcode = this.passwordText.getText();
        boolean answer = false;
        String regrex = (".*[0-9].*");
        if (passcode.matches(regrex)) {
            answer = true;
        }
        return answer;
    }
  
  protected boolean oneSymbol() {
        String passcode = this.passwordText.getText();
        boolean answer = false;
        String regrex = (".*[*^&@!].*");
        if (passcode.matches(regrex)) {
            answer = true;
        }
        return answer;
    }
  
  protected boolean emailCorrect() {
        String email = this.emailText.getText();
        boolean answer = false;
        String regrex = ("^(.+)@(.+)$");
        if (email.matches(regrex)) {
            answer = true;
        }
        return answer;
    }
  
}
