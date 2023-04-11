package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		System.out.println("Programa para mostrar média de números pares");
		System.out.println("============================================");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número de dígitos que terá o vetor: ");
		int n = sc.nextInt();
		int vetor[] = new int[n];
		double somaPares = 0 ;
		int numero = 0;
		
		for (int i=0; i<n; i++) {
			
			System.out.print("Digite o " + (i+1) + "o dígito ");
			
			vetor[i] = sc.nextInt();
			
			if ((vetor[i] % 2) == 0) {
				
			somaPares = somaPares+vetor[i];	
			numero = numero + 1;
			}

		}
		
		
		if (somaPares != 0) {
			System.out.printf("A média dos pares é: %.1f%n", somaPares/numero);
			}
		else {
			System.out.println("NÃO HOUVE NÚMEROS PARES DIGITADOS");
			
		}
		
		
		
		
		sc.close();

	}
		}		
