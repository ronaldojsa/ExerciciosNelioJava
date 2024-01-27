package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {


	public static void main(String[] args) throws ParseException{
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>(); 	
				
		System.out.println();
		System.out.println("EXERCÍCIO POLIMORFISMO");
		System.out.println("======================");
		System.out.println();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
	
		
		for (int i=1; i<=n; i++) {
			System.out.println("Product #" + i + " data:");	
			System.out.print("Common, used or imported (c/u/i): ");
			
			char type = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if (type == 'c') {
				list.add(new Product(name, price));
			}
			
			else if (type == 'u') {
				System.out.print("Manufacture date (DD/MM/YYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			}
			else {
				
				System.out.print("Customs fee: $ ");
				Double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));				
				
			}
			
			System.out.println();
			System.out.println("PRICE TAGS:");

			for (Product products : list) {
				System.out.println(products.priceTag());
						
			
			}
				
		}
			
		
		
		sc.close();
	}

}
