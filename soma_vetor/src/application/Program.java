package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {


		//Locale.setDefault(Locale.US);
		//Scanner sc = new Scanner(System.in);
		
		// *** se trocar a ordem do locale e do scanner o programa não funciona ao entrar com o número double.

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("PROGRAMA SOMA - VETOR");
		System.out.println("=====================");
		
		
		
		System.out.println();
		double soma = 0;
		
		
		System.out.print("Digite quantos números vai digitar: ");
		int quant = sc.nextInt();

	    double[] vetor = new double[quant];

		
			for (int i=0; i<quant; i++) {
				System.out.print ("Entre com o número " + (i+1) + ": ");
	
		        vetor[i] = sc.nextDouble();
			
				soma = soma + vetor[i];
					}
		
		System.out.println();
		System.out.print("Os valores digitados são: ");
		
		for (int i=0; i<quant; i++) {
			System.out.printf("%.1f   ", vetor[i]);
						
		}
		
		System.out.println();
		System.out.println();
		System.out.printf ("SOMA =  %.2f\n", soma);
		System.out.printf ("MÉDIA = %.2f\n", soma/quant);
				
		
		sc.close();
		
	}

}
