package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
	
		System.out.println("PROGRAMA PARA DETECTAR MAIOR POSIÇAO");
		System.out.println("====================================");
		System.out.println();
		
		System.out.print("Quantos números você vai digitar? ");
		
		int quant_num = 0;

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		quant_num = sc.nextInt();
		
		double vetor[] = new double[quant_num];
		double maiorValor = 0;
		int MaiorPosVetor = 0;
		//double num = 0.0;
		for(int i=0; i < quant_num; i++) {
			
			System.out.print("Entre com o número " + (i+1) + "  ");
			
			double num = sc.nextDouble();
			vetor[i]=num;
			if (vetor[i] > maiorValor){
				maiorValor = vetor[i];
				MaiorPosVetor=(i+1);
			}
		}
		
		System.out.printf("O maior valor digitado é: %.2f%n", maiorValor);
		System.out.println("A posição do maior valor digitado é: " + MaiorPosVetor);		
		
		sc.close();

	}

}
