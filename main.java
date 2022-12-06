package a11_109502517;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.image.Image;
import javafx.stage.Stage;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.BorderPane;

public class main extends Application{
	@Override
	public void start(Stage primaryStage) throws Exception{
		Parent root=FXMLLoader.load(getClass().getResource("pic.fxml"));
		primaryStage.setTitle("GAME");
		Scene window = new Scene (root,400,300);
		window.getRoot().requestFocus();
		primaryStage.setScene(window);
		primaryStage.show();
	}
	public static void main(String[] args) {
		launch(args); 
	}
}
