package entities;

public class Product {
	
	public String name;
	public int quantity;
	public double price;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	
	public Product () {     //pode manter construtor padrão
		
	}
	
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	public double totalValueInStock() {
		
		return price * quantity;	
	}
	
	
	public void addProducts(int quantity) {
		this.quantity += quantity;
		
	}
	
	public void removeProducts(int quantity) {
		this.quantity -=quantity;
		
	}
	
	public String toString() {
		
	return name 
			+ ", $ "
			+ String.format("%.2f",  price)
			+ " Quantity in stock: "
			+ quantity
			+ " units, Total: $ "
			+ String.format("%.2f", totalValueInStock());
		
	
		
	}
	

}