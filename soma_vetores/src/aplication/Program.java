package aplication;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		
		System.out.println("PROGRAMA PARA SOMAR 2 VETORES");
		System.out.println("=============================");
		System.out.println();
		
		System.out.print("Entre com a quantidade de valores de cada vetor: ");
		
		Scanner sc = new Scanner(System.in);
		int quant = sc.nextInt();
		
		Double vetorA[] = new Double[quant];
		double vetorB[] = new double[quant];
		//double soma;
		
		System.out.println();
		
		System.out.print("Digite os " + quant + " valores do vetor A");
		System.out.println();
		
		for(int i=0; i < quant; i++) {
		System.out.print("Valor " + (i+1) + ": ");
		vetorA[i] = sc.nextDouble();
		
		}
		
		System.out.print("Digite os " + quant + " valores do vetor B:");
		System.out.println();		
		for(int i=0; i < quant; i++) {
		System.out.print("Valor " + (i+1) + ": ");
		vetorB[i] = sc.nextDouble();				
		
		}
	
		System.out.print("A soma dos vetores são os seguintes:");
		System.out.println();
		for(int i=0; i < quant; i++) {
			System.out.println(vetorA[i] + vetorB[i]);
			
			
		}
		
		sc.close();
		

	}

}
