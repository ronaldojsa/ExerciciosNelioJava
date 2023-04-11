package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println ("PROGRAMA PARA TREINAR MATRIZES");
		System.out.println ("==============================");
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o tamanho da matriz N:");
		int n = sc.nextInt();
				
		
		int matriz[][] = new int [n][n];
		int contador = 0;
		
		for (int i=0;i<n; i++) {
			for (int j=0; j<n; j++) {
				
				System.out.print("Entre com um número da matriz: " + i + "/" + j + ": ");
				matriz [i][j] = sc.nextInt();	
				
				if (matriz[i][j] < 0) {
					contador++;
					
				}
				
			}
			
		}
		
		System.out.println();
		System.out.println("Os números da matriz são os seguintes: ");
		System.out.println();
				
		
		for (int i=0;i<n; i++) {
			System.out.println();
			for (int j=0; j<n; j++) {
				
				System.out.print(matriz[i][j] + "  ");		
				
			}
			
		}
		
		
		
		System.out.println();
		System.out.println("Quantidade de números negativos: " + contador);

		
		
		
		
		System.out.println();
		System.out.println("Os números da diagonal da matriz são os seguintes: ");
		for (int i=0;i<n; i++) {				
				System.out.print(matriz[i][i] + "  ");		
		}
		
		
		
		
		
		
	}

}
