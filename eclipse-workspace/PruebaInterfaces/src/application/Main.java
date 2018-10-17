
package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.effect.GaussianBlur;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	private AnchorPane mypane;
	//modifica el metodo start de la clase principal
	@Override
	public void start(Stage stage) throws IOException {
		
		//primero cargamos la vista fxml en el FXMLLoader
		FXMLLoader loader = new FXMLLoader(getClass().getResource(
				"loquesea.fxml"));
		
		//ahora cargamos la vista sobre mypane en el FXMLLoader
		mypane=(AnchorPane) loader.load();
		
		//añade la escena al stage y la titula
		stage.setTitle("Ondesta la ardilla?");
		stage.setScene(new Scene(mypane));
		stage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
