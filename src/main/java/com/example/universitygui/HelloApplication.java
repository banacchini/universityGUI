package com.example.universitygui;

import People.Course;
import People.DayStudent;
import People.Person;
import People.WeekendStudent;
import fileHandlingMethods.Serialization;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
//        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        FXMLLoader fxmlLoader =  new FXMLLoader(HelloApplication.class.getResource("menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
//        ArrayList<Person> mainList = Serialization.readFile();
//
//        System.out.println(mainList.get(0).toString());
//        Serialization.saveFile(mainList);
//

        launch();
    }
}