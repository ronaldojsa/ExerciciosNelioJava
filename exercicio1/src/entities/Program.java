package entities;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rect = new Rectangle();
		
 
		System.out.println("Cálculo de área, perímetro e diagonal");
		System.out.println("=====================================");
		System.out.println();
		System.out.print("Entre com a largura: ");
		rect.width = sc.nextDouble();
		System.out.print("Entre com a altura: ");
		rect.height = sc.nextDouble();
		
		System.out.printf("Área: %.2f%n", rect.area());
		System.out.printf("Perímetro: %.2f%n", rect.perimeter());
		System.out.printf("Diagonal: %.2f%n", rect.diagonal());
			
		
		
sc.close();

	}

}
