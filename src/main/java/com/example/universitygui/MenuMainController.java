package com.example.universitygui;

import People.Person;
import fileHandlingMethods.Serialization;
import javafx.collections.FXCollections;
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

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import static com.example.universitygui.HelloApplication.mainList;
import static filteringMethods.filteringMethods.*;


public class MenuMainController implements Initializable {


    @FXML
    public ListView<Person> displayedList;

    @FXML
    void btnShowAllClicked(MouseEvent event) {
        show(mainList);
    }

    @FXML
    void btnShowEmployees(MouseEvent event) {
        show(getEmployeesList(mainList));
    }

    @FXML
    void btnShowStudentsClicked(MouseEvent event) {
        show(getStudentsList(mainList));
    }

//
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
        Person p = displayedList.getSelectionModel().getSelectedItem();
        mainList.remove(p);
        show(mainList);

    }

    @FXML
    void editBtnClicked(MouseEvent event) throws IOException {
        Person p = displayedList.getSelectionModel().getSelectedItem();
        if (p != null) {
            p.edit();
        }
    }
//

//    Menu functions
    @FXML
    void saveMenuItemClicked(ActionEvent event) {
        Serialization.saveFile(mainList);
    }

    @FXML
    void showScholarshipMenuItemClicked(ActionEvent event) {
        show(getScholarshipList(mainList));
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if (mainList != null) {
            displayedList.getItems().setAll(mainList);
        }
        else {
            displayedList.getItems().setAll(new ArrayList<Person>());
        }
    }

    private void show(ArrayList<Person> list){
        displayedList.getItems().setAll(list);
    }

//

}
