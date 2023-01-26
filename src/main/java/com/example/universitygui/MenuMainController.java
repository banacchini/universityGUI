package com.example.universitygui;

import People.Person;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class MenuMainController implements Initializable {

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnEdit;

    @FXML
    private Button btnShowAll;

    @FXML
    private Button btnShowEmployees;

    @FXML
    private Button btnShowStudents;

    @FXML
    private ListView<Person> displayedList;

    @FXML
    private Menu plikMenu;

    @FXML
    private MenuItem saveMenuItem;

    @FXML
    private MenuItem showScholarshipMenuItem;

    @FXML
    void btnShowAllClicked(MouseEvent event) {

    }

    @FXML
    void btnShowEmployees(MouseEvent event) {

    }

    @FXML
    void btnShowStudentsClicked(MouseEvent event) {

    }

// Functions of buttons responsible for adding, deleting or editing the list
    @FXML
    void addBtnClicked(MouseEvent event) {
        try{

            Stage stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("personTypeDialog.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Podaj typ osoby");
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();

        } catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    void deleteBtnClicked(MouseEvent event) {

    }

    @FXML
    void editBtnClicked(MouseEvent event) {

    }
//

//    Menu functions
    @FXML
    void saveMenuItemClicked(ActionEvent event) {

    }

    @FXML
    void showScholarshipMenuItemClicked(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        displayedList.getItems().setAll(HelloApplication.mainList);
    }
//

}
