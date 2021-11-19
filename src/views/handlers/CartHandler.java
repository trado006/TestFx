package views.handlers;

import java.net.URL;
import java.util.ResourceBundle;

import entity.TraDKProduct;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;

public class CartHandler implements Initializable{
	@FXML
    private TableColumn<TraDKProduct, Spinner> countCol;

    @FXML
    private TableColumn<TraDKProduct, CheckBox> deleteCol;

    @FXML
    private ImageView image;

    @FXML
    private TableColumn<TraDKProduct, Float> priceCol;

    @FXML
    private TableView<TraDKProduct> table;

    @FXML
    private TableColumn<TraDKProduct, String> titleCol;

    @FXML
    private TextArea total;

    @FXML
    private Button updateButton;


    @FXML
    void placeOrder(ActionEvent event) {

    }

    @FXML
    void updateCart(ActionEvent event) {

    }
    
    ObservableList<TraDKProduct> list;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		initTable();
	}
	
	public void initTable() {
//		titleCol = new TableColumn<TraDKProduct, String>("Title");
//		priceCol = new TableColumn<TraDKProduct, Float>("Price");
//		countCol = new TableColumn<TraDKProduct, Integer>("Count");
//		deleteCol = new TableColumn<TraDKProduct, Boolean>("Delete");
		
		titleCol.setCellValueFactory(new PropertyValueFactory<TraDKProduct, String>("title"));
		priceCol.setCellValueFactory(new PropertyValueFactory<TraDKProduct, Float>("price"));
		countCol.setCellValueFactory(new PropertyValueFactory<TraDKProduct, Spinner>("count"));
		deleteCol.setCellValueFactory(new PropertyValueFactory<TraDKProduct, CheckBox>("delete"));
		// Show table data
		//table.getColumns().addAll(titleCol, priceCol, countCol, deleteCol);
	    list = getUserList();
	    table.setItems(list);
	    
	}
	
	private ObservableList<TraDKProduct> getUserList() {
	      list = FXCollections.observableArrayList(
	    		  new TraDKProduct("title 1", (float)12800, 12),
	    		  new TraDKProduct("title 1", (float)12800, 12),
	    		  new TraDKProduct("title 1", (float)12800, 12),
	    		  new TraDKProduct("title 1", (float)12800, 12),
	    		  new TraDKProduct("title 1", (float)12800, 12),
	    		  new TraDKProduct("title 1", (float)12800, 12),
	    		  new TraDKProduct("title 1", (float)12800, 12)
	    		  );
	      return list;
	  }

}
