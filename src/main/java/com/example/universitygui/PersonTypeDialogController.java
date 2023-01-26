package com.example.universitygui;

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

    String [] types = {"Administrative Employee", "Research Employee", "Day Student", "Weekend Student"};

    @FXML
    void okBtnClicked(MouseEvent event) throws IOException {
        if (typeChoice.getValue() != null){
            Stage stage = new Stage();
            Parent root;

            if (typeChoice.getValue().equals("Administrative Employee")){
//              Wybieramy scene odpowiedzialna za dodawanie Pracownika Administracyjnego
                root = FXMLLoader.load(getClass().getResource("AdmEmployeeDataDialog.fxml"));
            }
            else if (typeChoice.getValue().equals("Research Employee")){
                System.out.println("RE");
//                Wybieramy scene odpowiedzialna za dodawanie Pracownika Naukowego
                root = FXMLLoader.load(getClass().getResource("ResEmployeeDataDialog.fxml"));
            }
            else if(typeChoice.getValue().equals("Day Student")){
                System.out.println("DS");
//                Wybieramy scene odpowiedzialna za dodawanie Studenta Dziennego
                root = FXMLLoader.load(getClass().getResource("DayStudentDataDialog.fxml"));
            }
            else{
                System.out.println("Weekend Student");
//                Wybieramy scene odpowiedzialna za dodawanie Studenta Zaocznego
                root = FXMLLoader.load(getClass().getResource("WkndStudentDataDialog.fxml"));
            }
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.setResizable(false);
            stage.show();
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
