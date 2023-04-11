package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("ENTER NUMBER OF PRODUCT: ");
		int n = sc.nextInt();
		
		Product[] vect = new Product[n];

		double soma = 0;
		
		for (int i=0; i<n; i++) {   // poderia ser i<vec.length
			
			System.out.print("Enter with the product number  ");
			System.out.print(i+1);
			System.out.print(": ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Enter with the price of product:  ");			
			double price = sc.nextDouble();
			
			vect[i] = new Product (name,price);
			
			soma = (soma + vect[i].getPrice());
		}
		
		System.out.printf ("AVERAGE : %.2f%n", soma/n);
			
		sc.close();

	}

}
