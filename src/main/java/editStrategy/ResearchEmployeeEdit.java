package editStrategy;

import People.Person;
import People.ResearchEmployee;
import com.example.universitygui.AdmEmployeeEditDialogController;
import com.example.universitygui.HelloApplication;
import com.example.universitygui.ResEmployeeEditDialogController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;

public class ResearchEmployeeEdit implements PersonEdit, Serializable {
    private static final long serialVersionUID = 1L;
    //    Przekazujemy edytorowi osobe i otwieramy jego okienko
    @Override
    public void edit(Person p) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("ResEmployeeEditDialog.fxml"));
        Parent root = loader.load();
        ResEmployeeEditDialogController controller = loader.getController();
        controller.setPerson(p);

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.setTitle("Edytuj dane pracownika naukowego");
        stage.show();
    }
}
