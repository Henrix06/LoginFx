package loginWindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.EventObject;

public class Controller {

    @FXML
    public Button btnLogin;
    public PasswordField psdField;
    public TextField usrField;
    public Button regButton;


    public void Login(ActionEvent actionEvent) throws IOException {
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("ErrorScreen.fxml")));
        stage.setScene(scene);
        stage.show();
    }

    public void Register(ActionEvent actionEvent) {
    }
}
