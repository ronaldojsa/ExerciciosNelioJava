package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		

		System.out.println();
		System.out.println("====================================================");		
		System.out.println("PROGRAMA PARA LER NÚMEROS INTEIROS E MOSTRAR NA TELA");
		System.out.println("====================================================");
		System.out.println();
		System.out.println();
		
		int numero = 0;
		int quant = 0;
		System.out.print ("Quantos números vai digitar? ");
		quant = sc.nextInt();
		
		int vetor[] = new int[quant];
		
		for(int i=0; i<quant; i++) {
			
			System.out.print("Digite o número " + (i+1)+ ": ");
			
			numero = sc.nextInt();
			
			vetor[i] = numero;
		
		}
		
		System.out.println();
		System.out.print("Pares digitados: ");
		
		int quantidade = 0;	
		for(int i=0; i<quant; i++) {
			
			double resto = 0;
			
			if ((vetor[i] % 2) == 0){
				
				System.out.print(vetor[i] + "  ");
				quantidade = quantidade + 1;				
			}	
				}
		System.out.println();
		System.out.println();
		System.out.println("Quantidade de pares: " + quantidade);
		
		
	}
		}