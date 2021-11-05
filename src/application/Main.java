package application;
	
import java.net.URL;

import helper.CustomPath;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {

	@Override
	public void start(Stage primaryStage) {
		// TODO Auto-generated method stub
		try {
			CustomPath customPath = new CustomPath();
			//URL url = customPath.getURLfromRelativePath("view/TraDK_HomeScreen.fxml");
			//URL url = customPath.getURLfromRelativePath("view/TraDK_CartScreen.fxml");
			URL url = customPath.getURLfromRelativePath("view/TraDK_PaymentForm.fxml");
			
			Parent root = FXMLLoader.load(url);
			//BorderPane root = new BorderPane();
	        primaryStage.setTitle("Registration Form FXML Application");
	        primaryStage.setScene(new Scene(root, 800, 600));
	        primaryStage.show();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
        launch(args);
    }

}