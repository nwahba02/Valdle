package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class gamePageController implements Initializable {
	Singleton difficulty = Singleton.getInstance();
	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	private Label guesses;
	
	@Override
	public void initialize(URL url, ResourceBundle resourcebundle) {
		guesses.setText(difficulty.getDifficulty());
	}		
}