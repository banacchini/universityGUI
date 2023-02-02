package editStrategy;

import People.Person;
import com.example.universitygui.AdmEmployeeEditDialogController;
import com.example.universitygui.DayStudentEditDialogController;
import com.example.universitygui.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;

public class DayStudentEdit implements PersonEdit, Serializable {
    private static final long serialVersionUID = 1L;

    @Override
    public void edit(Person person) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("DayStudentEditDialog.fxml"));
        Parent root = loader.load();
        DayStudentEditDialogController controller = loader.getController();
        controller.setStudent(person);

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Edytuj dane studenta dziennego");
        stage.show();
    }
}
