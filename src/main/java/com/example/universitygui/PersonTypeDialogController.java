package com.example.universitygui;

import addingStrategy.*;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

public class PersonTypeDialogController implements Initializable {

    @FXML
    private Button okBtn;

    @FXML
    private ChoiceBox<String> typeChoice;

    private boolean okClicked = false;

    String [] types = {"Pracownik Administracyjny", "Pracownik Naukowy", "Student Dzienny", "Student Zaoczny"};

    @FXML
    void okBtnClicked(MouseEvent event) throws IOException {
        PersonAdder creator;

        if (typeChoice.getValue() != null){

//            Sprawdzamy jaki typ osoby zostal wybrany oraz przypisujemy odpowiednia klase odpowiedzialna za dodawanie
            if (typeChoice.getValue().equals("Pracownik Administracyjny")){
                creator = new AdministrativeEmployeeAdder();
            }

            else if (typeChoice.getValue().equals("Pracownik Naukowy")){
                creator = new ResearchEmployeeAdder();
            }

            else if(typeChoice.getValue().equals("Student Dzienny")){
                creator = new DayStudentAdder();
            }

            else{
//                Student Zaoczny
                creator = new WeekendStudentAdder();
            }

            creator.add();

            closeWindow();
        }

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        typeChoice.getItems().addAll(types);
    }

    void closeWindow(){
        Stage stage = (Stage) okBtn.getScene().getWindow();
        stage.close();
    }
}
