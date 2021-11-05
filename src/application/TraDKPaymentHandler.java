package application;

import java.net.URL;
import java.util.ResourceBundle;

import helper.AlertHelper;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.stage.Window;

public class TraDKPaymentHandler implements Initializable {

    @FXML
    private TextField cardNumber;

    @FXML
    private DatePicker expirationDate;

    @FXML
    private TextField holderName;

    @FXML
    private TextField issuingBank;

    @FXML
    private TextField securityCode;

    @FXML
    private Button submit;

    @FXML
    void onPaymentSubmit(ActionEvent event) {
    	Window owner = submit.getScene().getWindow();
    	AlertHelper.showAlert(Alert.AlertType.INFORMATION, owner, "Notice", "Pay order success!");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

}
