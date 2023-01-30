package com.example.universitygui;

import People.Course;
import People.Student;
import fileHandlingMethods.Serialization;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import static com.example.universitygui.HelloApplication.mainList;
import static stageMethods.WindowCloser.closeWindow;

public class StudentAddCoursesDataDialogController {
    private Student st;

    @FXML
    private Button addBtn;

    @FXML
    private TextField ectsField;

    @FXML
    private TextField gradeField;

    @FXML
    private TextField nameField;

    @FXML
    private Button okBtn;

    @FXML
    private TextField teacherField;

    public void setSt(Student st){
        this.st = st;
    }

    @FXML
    void addBtnClicked(MouseEvent event) {
        boolean isCorrect = true;

//      Pola ktore moga stanowic problem przy zamianie typow
        int ects = 0;
        float grade = 0.0f;
//
        String name = nameField.getText();
        String teacher = teacherField.getText();

        try{
            ects = Integer.parseInt(ectsField.getText());
            ectsField.setStyle("-fx-text-fill: green");
        } catch (Exception e){
            isCorrect = false;
            ectsField.setStyle("-fx-text-fill: red");
        }

        try{
            grade = Float.parseFloat(gradeField.getText());
            gradeField.setStyle("-fx-text-fill: green");
        } catch (Exception e){
            isCorrect = false;
            gradeField.setStyle("-fx-text-fill: red");
        }

        if (isCorrect){
            st.addCourse(new Course(name, teacher, ects, grade));

            nameField.setText("");
            ectsField.setText("");
            teacherField.setText("");
            gradeField.setText("");

        }
    }

    @FXML
    void okBtnClicked(MouseEvent event) {
        closeWindow(okBtn);

    }



}
