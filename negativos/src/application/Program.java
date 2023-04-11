package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("EXERCÍCIO QUE MOSTRA NÚMEROS NEGATIVOS LIDOS");
		System.out.println("============================================");
		
		System.out.println();
		


		System.out.print("Entre com a quantidade de números que vai digitar: ");

		int n = sc.nextInt();
		System.out.println();
		int[] vect = new int[n];
		
		for (int i=0; i<n; i++) {
			System.out.print("Entre com o número " + (i+1) + ": ");
			int num = sc.nextInt();
			vect[i]= num;	
			
		}
		
		System.out.println();
		System.out.println("NÚMEROS NEGATIVOS:");
		System.out.println("-----------------");
		System.out.println();
				
		for (int i=0; i<n; i++) {
			
			if (vect[i]<0) {
				
				System.out.printf("%d\n", vect[i]);
				
			}
			
		}
		
		
		
	
		
		
		sc.close();
		
	
	}

}
