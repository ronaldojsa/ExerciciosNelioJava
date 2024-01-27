package aplication;

import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Product p = new Product("TV", 1000.0);
		
		Product p1 = new Product("MO", 500.00);
		
		OrderItem oi1 = new OrderItem(1, 1000.00, p);
		
		OrderItem oi2 = new OrderItem(2, 400.00, p1);
		
		
		System.out.println(oi1.getQuantity());
		
		System.out.println(oi1.getProduct());
		
		System.out.println(oi1.getPrice());
		
		System.out.println(p);
		
		System.out.println(p1);

		System.out.println(oi2.getPrice());
	}

	
	
}
