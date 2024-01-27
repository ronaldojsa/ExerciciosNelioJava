package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Shape> list = new ArrayList();
		
		System.out.println("Exercício");
		System.out.println("---------");
		System.out.println();
		
		System.out.print("Enter the number of shapes: ");
		double n = sc.nextDouble();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle our Circle (r/c)?");
			char type = sc.next().charAt(0);
			
			System.out.print("Color (BLACK, RED, YELLOW): ");
			Color color = Color.valueOf(sc.next());
			
			if (type =='r') {
				
				System.out.print("Width: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double heigth = sc.nextDouble();
				list.add(new Rectangle(color, width, heigth));
			}
			
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
				
			}
			
			System.out.println();
			System.out.println("Shape areas:");
			for (Shape rel : list) {
				System.out.println(String.format("%.2f",rel.area()));
				
			}
				
		}
		
	
	}

}
