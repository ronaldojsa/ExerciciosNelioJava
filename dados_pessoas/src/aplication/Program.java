package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAMA PARA CALCULAR A MAIOR E MENOR ALTURA E OUTROS DADOS");
		System.out.println("============================================================");
		System.out.println();
		
		
		
		System.out.print("Entre com a quantidade de pessoas: ");
		int n = sc.nextInt();
		System.out.println();
		String nome;
		Double altura = 0.0;
		char genero;
		Double maiorAltura = 0.0;
		Double menorAltura = 0.0;
		Double soma = 0.0;
		Pessoas[] pessoas = new Pessoas[n];
		int numHomens = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Entre com o nome da " + (i+1) + "a pessoa: ");
			nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Entre com a altura da " + (i+1) + "a pessoa: ");
			altura = sc.nextDouble();
			sc.nextLine();
			System.out.print("Entre com o gênero da " + (i+1) + "a pessoa: ");
			genero = sc.next().charAt(0);

			soma = soma + altura;

			if (maiorAltura < altura) {
				maiorAltura = altura;
			}
			else {
				menorAltura = altura;
			}
	
			if (genero == 'M') {
				numHomens = numHomens + 1;
				
				
			}
			
		}
			
		System.out.println("A maior altura é: " + maiorAltura);
		System.out.println("A menor altura é: " + menorAltura);
		System.out.println("A média das alturas é: " + soma/n);
		System.out.println("O número de homens é: " + numHomens);
		
		
		
		
		sc.close();
	}

}
