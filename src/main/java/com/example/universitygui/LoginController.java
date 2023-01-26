package com.example.universitygui;


import fileHandlingMethods.LoginInfo;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class LoginController implements Initializable{
    HashMap<String,String> loginData;
    @FXML
    private TextField LoginField;
    @FXML
    private PasswordField PasswordField;
    @FXML
    private Label LoginMessageLabel;
    @FXML
    protected void checkLoginAndPassword(){
        boolean loggedIn = false;

        String loginText = LoginField.getText();
        String passwordText = PasswordField.getText();

        try{
            if(!loginData.containsKey(loginText)){
                throw new LoginNotFoundException("Nie znaleziono loginu!");
            }
            else{
                if (passwordText.equals(loginData.get(loginText))) {
                    loggedIn = true;
                } else {
                    LoginMessageLabel.setText("Podano zle haslo!");
                }
            }
        } catch (LoginNotFoundException e){
            LoginMessageLabel.setText("Podaj poprawny login!");
        }

        if(loggedIn){
            LoginMessageLabel.setText("Zalogowano");
        }



    }
    public static class LoginNotFoundException extends Exception{
        public LoginNotFoundException(String errorMessage){super(errorMessage);}
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        new LoginInfo().getLoginData();

    }
}