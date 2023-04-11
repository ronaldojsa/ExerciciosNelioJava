package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Product product = new Product(); *** versão com construtor ***
		
		Product p = new Product();
		
		p.name="TV";
		p.price = 900.00;
		p.quantity = 2;
		
		System.out.print(p);
				
		
		

		System.out.println("Enter product data: ");
		System.out.print("Name:");
		String name = sc.nextLine();

		System.out.print("Price: ");
		double price = sc.nextDouble();

		//System.out.print("Quantity in Stock: ");
		//int quantity = sc.nextInt();
		
		Product product = new Product(name, price);

		System.out.println();
		System.out.println("Product data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		quantity = sc.nextInt();
		product.removeProducts(quantity);

		System.out.println();
		System.out.println("Update data: " + product);

		sc.close();

	}

}