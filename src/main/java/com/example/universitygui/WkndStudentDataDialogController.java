package com.example.universitygui;

import People.AdministrativeEmployee;
import People.DayStudent;
import People.WeekendStudent;
import fileHandlingMethods.Serialization;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

import static com.example.universitygui.HelloApplication.main;
import static com.example.universitygui.HelloApplication.mainList;
import static stageMethods.WindowCloser.closeWindow;

public class WkndStudentDataDialogController {

    @FXML
    private TextField ageField;

    @FXML
    private TextField tuitionField;

    @FXML
    private TextField indexField;

    @FXML
    private TextField nameField;

    @FXML
    private Button okBtn;

    @FXML
    private TextField peselField;

    @FXML
    private TextField semesterField;

    @FXML
    private TextField sexField;

    @FXML
    private TextField surnameField;

    @FXML
    void okBtnClicked(MouseEvent event) throws IOException {
//       zmienna, ktora reprezentuje poprawnosc inputu uzytkownika
        boolean isCorrect = true;

//      poczatkowa deklaracja zmiennych, ktore moga stanowic problem przy wczytywaniu danych
        int age = 0;
        int index = 0;
        int semester = 0;
        int tuition = 0;


        String name = nameField.getText();
        String surname = surnameField.getText();
        String pesel = peselField.getText();
        String sex = sexField.getText();

        try{
            age = Integer.parseInt(ageField.getText());
            ageField.setStyle("-fx-text-fill: green");

        }
        catch (Exception e) {
//         Jesli wprowadzone dane sa niepoprawne, zmieniamy kolor czcionki na czerwony oraz ustawiamy isCorrect = false
            ageField.setStyle("-fx-text-fill: red");
            isCorrect = false;
        }

        try {
            index = Integer.parseInt(indexField.getText());

        } catch (Exception e){
//          Jesli wprowadzone dane sa niepoprawne, zmieniamy kolor czcionki na czerwony oraz ustawiamy isCorrect = false
            indexField.setStyle("-fx-text-fill: red");
            isCorrect = false;
        }

        try {
            semester = Integer.parseInt(semesterField.getText());

        } catch (Exception e){
//          Jesli wprowadzone dane sa niepoprawne, zmieniamy kolor czcionki na czerwony oraz ustawiamy isCorrect = false
            semesterField.setStyle("-fx-text-fill: red");
            isCorrect = false;
        }

        try {
            tuition = Integer.parseInt(tuitionField.getText());

        } catch (Exception e) {
//          Jesli wprowadzone dane sa niepoprawne, zmieniamy kolor czcionki na czerwony oraz ustawiamy isCorrect = false
            tuitionField.setStyle("-fx-text-fill: red");
            isCorrect = false;
        }

//        Jesli input uzytkownika byl prawidlowy, to dodajemy studenta z pusta lista i wywolujemy funkcje odpowiedzialna
//        za dodawanie kursow
        if (isCorrect){
            WeekendStudent st = new WeekendStudent(name, surname, pesel, age, sex, mainList.size(), index, semester, tuition);

//            Przesyłamy informacje o obecnym studencie do Kontrolera odpowiedzialnego za dodawanie kursow
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentAddCoursesDataDialog.fxml"));
            Parent root = loader.load();
            StudentAddCoursesDataDialogController controller2 = loader.getController();
            controller2.setSt(st);

            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

            mainList.add(st);
        }
//

    }
}


