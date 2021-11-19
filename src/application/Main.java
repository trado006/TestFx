package application;

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
			//Parent root = FXMLLoader.load(getClass().getResource("/views/TraDK_PaymentForm.fxml"));
			Parent root = FXMLLoader.load(getClass().getResource("/views/TraDK_CartScreen.fxml"));
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