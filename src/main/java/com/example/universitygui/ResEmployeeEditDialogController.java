package com.example.universitygui;

import People.Person;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

import static stageMethods.WindowCloser.closeWindow;

public class ResEmployeeEditDialogController {

    private Person person;
    @FXML
    private Button okBtn;
    @FXML
    private Label alertField;
    @FXML
    private TextField ageField;

    @FXML
    private Label ageLabel;

    @FXML
    private TextField nameField;

    @FXML
    private Label nameLabel;

    @FXML
    private TextField nopField;

    @FXML
    private Label nopLabel;

    @FXML
    private TextField peselField;

    @FXML
    private Label peselLabel;

    @FXML
    private TextField positionField;

    @FXML
    private Label positionLabel;

    @FXML
    private TextField sexField;

    @FXML
    private Label sexLabel;

    @FXML
    private TextField surnameField;

    @FXML
    private Label surnameLabel;

    @FXML
    private TextField wageField;

    @FXML
    private Label wageLabel;

    @FXML
    void ageEditBtnClicked(MouseEvent event) {
        int age;

        try{
            age = Integer.parseInt(ageField.getText());
            person.setAge(age);
            ageLabel.setText(ageField.getText());
            removeAlert();

        }
        catch (Exception e) {
            ageField.setStyle("-fx-text-fill: red");
            alert();

        }
    }

    @FXML
    void nameEditBtnClicked(MouseEvent event) {
        String name = nameField.getText();
        person.setName(name);
        nameLabel.setText(name);
        removeAlert();
    }

    @FXML
    void okBtnClicked(MouseEvent event) {
        closeWindow(okBtn);
    }

    @FXML
    void overtimeEditBtnClicked(MouseEvent event) {
        int numberOfPublications;

        try{
            numberOfPublications = Integer.parseInt(nopField.getText());
            person.setOvertime(numberOfPublications);
            nopLabel.setText(nopField.getText());
            removeAlert();

        } catch (Exception e){
            nopField.setStyle("-fx-text-fill: red");
            alert();
        }
    }

    @FXML
    void peselEditBtnClicked(MouseEvent event) {
        String pesel = peselField.getText();
        person.setPESEL(pesel);
        peselLabel.setText(pesel);
        removeAlert();
    }

    @FXML
    void positionEditBtnClicked(MouseEvent event) {
        String position = positionField.getText();
        person.setPosition(position);
        positionLabel.setText(position);
        removeAlert();
    }

    @FXML
    void sexEditBtnClicked(MouseEvent event) {
        String sex = sexField.getText();
        person.setSex(sex);
        sexLabel.setText(sex);
        removeAlert();
    }

    @FXML
    void surnameEditBtnClicked(MouseEvent event) {
        String surname = surnameField.getText();
        person.setSurname(surname);
        surnameLabel.setText(surname);
        removeAlert();
    }

    @FXML
    void wageEditBtnClicked(MouseEvent event) {
        int wage;

        try{
            wage = Integer.parseInt(wageField.getText());
            person.setBaseWage(wage);
            wageLabel.setText(wageField.getText());
            removeAlert();
        }catch (Exception e){
            alert();
            wageField.setStyle("-fx-text-fill: red");
        }
    }


    public void setPerson(Person p){

//        Przypisujemy labelom informacje o Pracowniku
        this.person = p;
        nameLabel.setText(p.getName());
        surnameLabel.setText(p.getSurname());
        peselLabel.setText(p.getPESEL());
        ageLabel.setText(String.valueOf(p.getAge()));
        sexLabel.setText(p.getSex());
        positionLabel.setText(p.getPosition());
        wageLabel.setText(String.valueOf(p.getBaseWage()));
        nopLabel.setText(String.valueOf(p.getNumberOfPublications()));
    }

    public void alert(){
        alertField.setText("Sprawdz poprawnosc danych!");
    }

    public void removeAlert(){
        alertField.setText("");
    }
}
