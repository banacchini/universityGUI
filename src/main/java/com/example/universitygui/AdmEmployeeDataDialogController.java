package com.example.universitygui;

import People.AdministrativeEmployee;
import fileHandlingMethods.Serialization;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import static com.example.universitygui.HelloApplication.mainList;
import static stageMethods.WindowCloser.closeWindow;

public class AdmEmployeeDataDialogController {

    @FXML
    private TextField ageField;

    @FXML
    private TextField baseWageField;

    @FXML
    private TextField nameField;

    @FXML
    private Button okBtn;

    @FXML
    private TextField overtimeField;

    @FXML
    private TextField peselField;

    @FXML
    private TextField positionField;

    @FXML
    private TextField sexField;

    @FXML
    private TextField surnameField;

    @FXML
    void okBtnClicked(MouseEvent event) {
//       zmienna, ktora reprezentuje poprawnosc inputu uzytkownika
        boolean isCorrect = true;

//        poczatkowa deklaracja zmiennych, ktore moga stanowic przy wczytywaniu danych
        int age = 0;
        int baseWage = 0;
        float overtime = 0.0f;


        String name = nameField.getText();
        String surname = surnameField.getText();
        String pesel = peselField.getText();
        String position = positionField.getText();
        String sex = sexField.getText();

        try{
            age = Integer.parseInt(ageField.getText());

        }
        catch (Exception e) {
//          Jesli wprowadzone dane sa niepoprawne, zmieniamy kolor czcionki na czerwony oraz ustawiamy isCorrect = false
            ageField.setStyle("-fx-text-fill: red");
            isCorrect = false;
        }

        try {
            baseWage = Integer.parseInt(baseWageField.getText());

        } catch (Exception e){
//          Jesli wprowadzone dane sa niepoprawne, zmieniamy kolor czcionki na czerwony oraz ustawiamy isCorrect = false
            baseWageField.setStyle("-fx-text-fill: red");
            isCorrect = false;
        }


        try {
            overtime = Float.parseFloat(overtimeField.getText());

        } catch (Exception e) {
//          Jesli wprowadzone dane sa niepoprawne, zmieniamy kolor czcionki na czerwony oraz ustawiamy isCorrect = false
            overtimeField.setStyle("-fx-text-fill: red");
            isCorrect = false;
        }

//        Jesli input uzytkownika byl prawidlowy, to dodajemy pracownika administracyjnego i zamykamy okno
        if (isCorrect){
            mainList.add(new AdministrativeEmployee(name, surname, pesel, age, sex, mainList.size(), position, baseWage, overtime));


            closeWindow(okBtn);

        }

    }



}
