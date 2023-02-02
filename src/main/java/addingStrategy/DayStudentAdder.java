package addingStrategy;

import com.example.universitygui.PersonTypeDialogController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class DayStudentAdder implements PersonAdder{
    @Override
    public void add() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(PersonTypeDialogController.class.getResource("DayStudentDataDialog.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Dodaj studenta dziennego");
        stage.show();
    }
}
