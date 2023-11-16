package application;

import java.awt.Button;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class difficultyPageController{
	Singleton difficulty = Singleton.getInstance();
	private Stage stage;
	private Scene scene;
	private Parent root;

	@FXML
	public void switchToMainScreen(ActionEvent event) throws IOException {
		root = FXMLLoader.load(getClass().getResource("mainPage.FXML"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void switchToGameScreenEasy(ActionEvent event) throws IOException {
		difficulty.setdifficulty("You have 5 guesses");

		root = FXMLLoader.load(getClass().getResource("gamePage.FXML"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void switchToGameScreenMed(ActionEvent event) throws IOException {
		difficulty.setdifficulty("You have 3 guesses");

		root = FXMLLoader.load(getClass().getResource("gamePage.FXML"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	@FXML
	public void switchToGameScreenHard(ActionEvent event) throws IOException {
		difficulty.setdifficulty("You have 2 guesses");

		root = FXMLLoader.load(getClass().getResource("gamePage.FXML"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
}
