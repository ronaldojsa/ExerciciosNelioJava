package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print ("ENTER NUMBER OF HEIGHT: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Enter with height number ");
			System.out.print(i+1);
			System.out.print(": ");
			
			vect[i] = sc.nextDouble();
			soma = soma + vect[i];
		}
		
		System.out.printf ("AVERAGE HEIGHT: %.2f%n", soma/n);
			
		sc.close();

	}

}
