package com.example.universitygui;


import javafx.fxml.FXML;

import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    @FXML
    private TextField LoginField;
    @FXML
    private PasswordField PasswordField;
    @FXML
    private Label LoginMessageLabel;
    @FXML
    protected void checkLoginAndPassword(){
        String loginText = LoginField.getText();
        String passwordText = PasswordField.getText();
        LoginMessageLabel.setText("hahah wlasnie dales nam swoje haslo: " + passwordText);

    }

}