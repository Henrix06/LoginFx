package loginWindow;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class ErrorScreen {
    public Button retryBtn;
    public Button registerBtn;

    public void RegisterWindow(ActionEvent actionEvent)throws Exception {
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("RegisterWindow.fxml")));
        stage.setScene(scene);
        stage.show();
    }

    public void GoBack(ActionEvent actionEvent) throws Exception {
        Node node = (Node) actionEvent.getSource();
        Stage stage = (Stage) node.getScene().getWindow();
        stage.close();
        Scene scene = new Scene(FXMLLoader.load(getClass().getResource("LoginWindow.fxml")));
        stage.setScene(scene);
        stage.show();
    }
}
