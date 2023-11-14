package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class Main extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("mainPage.FXML"));
			Image topIcon = new Image("valorant.png");
			Scene mainScreenScene = new Scene(root);
			stage.getIcons().add(topIcon);
			stage.setTitle("Valdle");
			stage.setScene(mainScreenScene);
			stage.show();
			stage.setResizable(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {
		Application.launch(args);
	}
}