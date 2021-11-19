package views.handlers;

import java.net.URL;
import java.util.ResourceBundle;

import helper.AlertHelper;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.SpinnerValueFactory.IntegerSpinnerValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Window;

public class TraDKProductHandler implements Initializable {
	@FXML
	private Label nameLabel;
	@FXML
	private ImageView imageView;
	@FXML
	private Label priceLabel;
	@FXML
	private Label availableLabel;
	@FXML
	private Spinner<Integer> buyNumberSpinner;
	
	@FXML
	private Button addToCartButton;
	
	//other param
	private Integer buyNumber;
	
	@FXML
    protected void addToCart(ActionEvent event) {
        Window owner = addToCartButton.getScene().getWindow();
        buyNumber = buyNumberSpinner.getValue();
//        if(nameField.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
//                    "Please enter your name");
//            return;
//        }
//        if(emailField.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
//                    "Please enter your email id");
//            return;
//        }
//        if(passwordField.getText().isEmpty()) {
//            AlertHelper.showAlert(Alert.AlertType.ERROR, owner, "Form Error!", 
//                    "Please enter a password");
//            return;
//        }
//
//        AlertHelper.showAlert(Alert.AlertType.CONFIRMATION, owner, "Registration Successful!", 
//                "Welcome " + nameField.getText());
    }
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		System.out.println("product");
		SpinnerValueFactory<Integer> valueFactory = 
				new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 10);
		
		valueFactory.setValue(1);
		
		buyNumberSpinner.setValueFactory(valueFactory);
		
		//currentValue = buyNumber.getValue();
		
		//myLabel.setText(Integer.toString(currentValue));
		buyNumberSpinner.valueProperty().addListener((ChangeListener<? super Integer>) new ChangeListener<Integer>() {

			@Override
			public void changed(ObservableValue<? extends Integer> arg0, Integer arg1, Integer arg2) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}

}
