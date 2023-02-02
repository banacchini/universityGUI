package com.example.universitygui;

import People.*;

import fileHandlingMethods.Serialization;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    public static ArrayList<Person> mainList;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader =  new FXMLLoader(HelloApplication.class.getResource("login-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Uniwersytet Login");
        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();


    }

    public static void main(String[] args) {
        mainList = Serialization.readFile();
//        mainList = new ArrayList<Person>();
        System.out.println();
        launch();
    }
}