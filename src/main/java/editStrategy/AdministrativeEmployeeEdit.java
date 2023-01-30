package editStrategy;

import People.Person;
import com.example.universitygui.AdmEmployeeEditDialogController;
import com.example.universitygui.HelloApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.io.Serializable;

public class AdministrativeEmployeeEdit implements PersonEdit, Serializable {

    private static final long serialVersionUID = 1L;
//    Przekazujemy edytorowi osobe i otwieramy jego okienko
    @Override
    public void edit(Person p) throws IOException {
        FXMLLoader loader = new FXMLLoader(HelloApplication.class.getResource("AdmEmployeeEditDialog.fxml"));
        Parent root = loader.load();
        AdmEmployeeEditDialogController controller = loader.getController();
        controller.setPerson(p);

        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }
}
