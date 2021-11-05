package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import helper.CustomPath;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class TraDKHomeHandler implements Initializable {
	@FXML
	TextField searchTexField;
	
	@FXML
	SplitMenuButton searchMenuButton;
	
	@FXML
	Label mediaNumberLabel;
	
	@FXML
	GridPane mediaGridPane;
	
	@FXML
	Label pageLabel;
	
	@FXML
	Button previousButton;
	
	@FXML
	Button nextButton;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		System.out.println("1234");
		// TODO Auto-generated method stub
		try {
			CustomPath customPath = new CustomPath();
			URL url = customPath.getURLfromRelativePath("view/TraDK_ProductView.fxml");
			ArrayList<GridPane> medias = new ArrayList<GridPane>();
			for(int i=0;i<12;i++) {
				medias.add(FXMLLoader.load(url));
				System.out.println(medias.size());
			}
			for(int y=0;y<3;y++){
				for(int x=0;x<4;x++) {
					mediaGridPane.add(medias.get(y*4+x), x, y);
				}
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
