package stageMethods;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class WindowCloser {
    public static void closeWindow(Button btn){
        Stage stage = (Stage) btn.getParent().getScene().getWindow();
        stage.close();
    }
}
