package com.example.universitygui;

import People.*;
import fileHandlingMethods.Serialization;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    public static ObservableList<Person> mainList;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(HelloApplication.class.getResource("menu-main.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();


    }

    public static void main(String[] args) {
        mainList = FXCollections.observableArrayList();
        mainList.add(new AdministrativeEmployee("Dominik", "Czech", "03141231", 19, "m", mainList.size()+1, "asd", 12, 15.3f));

        launch();
    }
}