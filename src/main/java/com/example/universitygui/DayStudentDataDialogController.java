package com.example.universitygui;

import People.AdministrativeEmployee;
import People.DayStudent;
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
import myException.AttendenceOverOneException;

import java.io.IOException;

import static com.example.universitygui.HelloApplication.mainList;
import static stageMethods.WindowCloser.closeWindow;

public class DayStudentDataDialogController {

    @FXML
    private TextField ageField;

    @FXML
    private TextField attendanceField;

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
        float attendance = 0.0f;


        String name = nameField.getText();
        String surname = surnameField.getText();
        String pesel = peselField.getText();
        String sex = sexField.getText();

//      Jesli wprowadzone dane sa niepoprawne, zmieniamy kolor czcionki na czerwony oraz ustawiamy isCorrect = false

//        Sprawdzamy poprawnosc wieku
        try{
            age = Integer.parseInt(ageField.getText());

        }
        catch (Exception e) {
            ageField.setStyle("-fx-text-fill: red");
            isCorrect = false;
            }

//        Sprawdzamy poprawnosc indeksu
        try {
            index = Integer.parseInt(indexField.getText());

        } catch (Exception e){
            indexField.setStyle("-fx-text-fill: red");
            isCorrect = false;
            }

//        Sprawdzamy poprawnosc semestru
        try {
            semester = Integer.parseInt(semesterField.getText());

        } catch (Exception e){

            semesterField.setStyle("-fx-text-fill: red");
            isCorrect = false;
        }

//        Sprawdzamy poprawnosc frekwencji
        try {
            attendance = Float.parseFloat(attendanceField.getText());

//            Moj wlasny wyjatek, jesli frekwencja jest wieksza niz 1, to ustawiamy ja na 1
// _____________________________________________________________________________________________________________________
            try{
                if (attendance>1){
                    throw new AttendenceOverOneException("frekwencja nie moze byc wieksza niz 1!");
                }
            } catch (AttendenceOverOneException e){
                attendance = 1;
            }
// _____________________________________________________________________________________________________________________

        } catch (Exception e) {
            attendanceField.setStyle("-fx-text-fill: red");
            isCorrect = false;
        }


//        Jesli input uzytkownika byl prawidlowy, to dodajemy studenta z pusta lista i wywolujemy funkcje odpowiedzialna
//        za dodawanie kursow
        if (isCorrect){
            DayStudent st = new DayStudent(name, surname, pesel, age, sex, mainList.size(), index, semester, attendance);

//            Przesylamy informacje o obecnym studencie do Kontrolera odpowiedzialnego za dodawanie kursow
            FXMLLoader loader = new FXMLLoader(getClass().getResource("StudentAddCoursesDataDialog.fxml"));
            Parent root = loader.load();
            StudentAddCoursesDataDialogController controller2 = loader.getController();
            controller2.setSt(st);

//            Pokazujemy okno odpowiedzialne za dodawanie kursow
            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

            mainList.add(st);
        }
        }
    }



