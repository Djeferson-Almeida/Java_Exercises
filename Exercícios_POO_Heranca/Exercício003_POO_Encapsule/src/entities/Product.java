package entities;

public class Product {

	private String name;
	private int quantity;
	private double price;
	
	
	public Product() {}
	
	public Product(String name, int quantity, double price) {
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		
	}
	
	public String getName(String name) {
		return name;	
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice(double price) {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
