module com.example.universitygui {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.universitygui to javafx.fxml;
    exports com.example.universitygui;
}