package addingStrategy;

import com.example.universitygui.PersonTypeDialogController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AdministrativeEmployeeAdder implements PersonAdder{
    @Override
    public void add() throws IOException {
        Stage stage = new Stage();
        Parent root = FXMLLoader.load(PersonTypeDialogController.class.getResource("AdmEmployeeDataDialog.fxml"));
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Dodaj pracownika administracyjnego");
        stage.show();
    }
}
