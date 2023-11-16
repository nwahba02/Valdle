package application;

import java.awt.Button;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;



public class mainPageController {
	private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    public void switchToPlayScreen(ActionEvent event) throws IOException {
            root = FXMLLoader.load(getClass().getResource("difficultyPage.FXML"));
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
    }
}
