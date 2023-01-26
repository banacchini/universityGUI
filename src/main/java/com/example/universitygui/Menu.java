package com.example.universitygui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class Menu {

    @FXML
    private Button addButton;

    @FXML
    private Label ageLabel;

    @FXML
    private Button deleteButton;

    @FXML
    private Button editButton;

    @FXML
    private TableColumn<?, ?> firstNameColumn;

    @FXML
    private Label firstNameLabel;

    @FXML
    private Button infoButton;

    @FXML
    private TableColumn<?, ?> lastNameColumn;

    @FXML
    private Label lastNameLabel;

    @FXML
    private TableColumn<?, ?> nrColumn;

    @FXML
    private TableView<?> personTable;

    @FXML
    private Label peselLabel;

    @FXML
    private TableColumn<?, ?> roleColumn;

    @FXML
    private Label roleLabel;

    @FXML
    private Label sexLabel;

}
