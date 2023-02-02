package addingStrategy;

import com.example.universitygui.PersonTypeDialogController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WeekendStudentAdder implements PersonAdder{
    @Override
    public void add() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(PersonTypeDialogController.class.getResource("WkndStudentDataDialog.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Dodaj studenta zaocznego");
        stage.show();
    }
}
