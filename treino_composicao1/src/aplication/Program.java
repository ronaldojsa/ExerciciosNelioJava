package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.OrderItem;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
	
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		Product p = new Product("TV", 1000.00);
		Product p1 = new Product("MO",500.00);
		
		System.out.println(p);
		
		OrderItem oi1 = new OrderItem(1, 1000.00, p);
		
		System.out.println(oi1.getQuantity());
		System.out.println(oi1.getProduct().getName());
		

		
		System.out.println(oi1);
		
		Client cliente = new Client("Maria", "Maria@gmail.com", sdf.parse("20/10/1995"));
		System.out.println(cliente);
		
		
		sc.close();
		
	}

	

	
}
