package entity;

public class TraDKProduct {
	public String title;
	public float price;
	public int count;
	public boolean delete;
	
	
	public TraDKProduct(String title, float price, int count) {
		super();
		this.title = title;
		this.price = price;
		this.count = count;
		this.delete = false;
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public boolean isDelete() {
		return delete;
	}
	public void setDelete(boolean delete) {
		this.delete = delete;
	}
	
}
