package entities;

public class Order {
	
	
	private Product product;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Order(Product product) {
		super();
		this.product = product;
		this.product.name = "TV";
	}
	


}
