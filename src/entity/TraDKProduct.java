package entity;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Spinner;

public class TraDKProduct {
	public String title;
	public Button price;
	public Spinner count;
	public CheckBox delete;
	
	
	public TraDKProduct(String title, float price, int count) {
		super();
		this.title = title;
		this.price = new Button();
		this.count = new Spinner();
		this.count.setEditable(true);
		//this.count.getValueFactory().setValue(count);
		this.delete = new CheckBox();
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Button getPrice() {
		return price;
	}
	public void setPrice(Button price) {
		this.price = price;
	}
	public Spinner getCount() {
		return count;
	}
	public void setCount(Spinner count) {
		this.count = count;
	}
	public CheckBox getDelete() {
		return delete;
	}
	public void setDelete(CheckBox delete) {
		this.delete = delete;
	}
	
}
