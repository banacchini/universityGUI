package com.example.universitygui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;

import static fileHandlingMethods.LoginInfo.getLoginInfo;
import static stageMethods.WindowCloser.closeWindow;

public class LoginController {

    @FXML
    private TextField LoginField;

    @FXML
    private Label LoginMessageLabel;

    @FXML
    private PasswordField PasswordField;

    @FXML
    private Button okBtn;

    @FXML
    void checkLoginAndPassword(ActionEvent event) throws IOException {
        boolean isLogged = false;

        String login = LoginField.getText().trim();
        String password = PasswordField.getText().trim();
        HashMap<String, String> loginData = getLoginInfo();

//        Sprawdzamy czy podane haslo pasuje do podanego loginu
        if (password.equals(loginData.get(login))){
            isLogged = true;
        }

//        Jesli haslo i login sa poprawne to pokazujemy glowna czesc aplikacji i zamykamy okno logowania
        if (isLogged) {
            showMainMenu();
            closeWindow(okBtn);
        }
        else{
            LoginMessageLabel.setText("Podano bledny login lub haslo!");
            }
    }

    public void showMainMenu() throws IOException {
        Stage stage= new Stage();
        FXMLLoader fxmlLoader =  new FXMLLoader(HelloApplication.class.getResource("menu-main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Uniwersytet");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }
}
