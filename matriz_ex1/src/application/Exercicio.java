package application;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		
		System.out.println("PROGRAMA PARA EXERCITAR MATRIZES");
		System.out.println("================================");
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);	
		
		// leitura da matriz
		
		System.out.print("Entre com o tamanho da matriz N x M: ");
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] vector = new int[n][m];
		
		
		
		for (int i=0; i<n; i++) {
			
			for (int j=0; j<m;j++){
				
				vector[i][j]=sc.nextInt();
							
			}		
			
		}
				
		System.out.println("Entre com um número a ser encontrado: ");
		
		int x = sc.nextInt();
		
		for (int i=0; i<n;i++) {
			for (int j=0; j<m;j++) {
				
				if (vector[i][j] == x) {
					System.out.println("A posição do número é: " + i + "," + j);	
				
				
				if (j>0) {
					System.out.println("O número à esquerda é: "+ vector[i][j-1]);
					
				}
				if (i>0) {
					System.out.println("O número acima é: "+ vector[i-1][j]);
					
				}
				if (j<n) {
					System.out.println("O número a direita é: "+ vector[i][j+1]);
					
				}
				
				if (i<m) {
					System.out.println("O número abaixo é: " + vector[i+1][j]);
					
				}
				
			}
			
		}
		
		}
				
		sc.close();
		
	}

}
