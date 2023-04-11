package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("PROGRAMA MÉDIA ARITMÉTICA E ABAIXO DA MÉDIA");
		System.out.println("===========================================");
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite quantos elementos terá o vetor: ");
		
		int n = sc.nextInt();
		double soma = 0;
		double media = 0;
		
		Double[] vetor = new Double[n];
		
		for (int i=0; i<n; i++) {
			
			
			System.out.print("Digite o " + (i+1) + "o número: ");
			vetor[i] = sc.nextDouble();
			soma = vetor[i] + soma;
			
		}
		media = soma/n;
			System.out.println();
			System.out.printf("A média aritmética do vetor é: %.3f%n", media);
			System.out.println();
			System.out.println("Os elementos abaixo da média são:");
			
		for (int i=0; i<n; i++) {
			if (vetor[i] < media) {
				System.out.printf("%.1f%n", vetor[i]);
				
			}
			
		}
			
			
			
			
		
		sc.close();

	}

}
