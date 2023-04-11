package aplication;

import java.util.Scanner;

import entities.Pessoas;

public class Program {

	public static void main(String[] args) {

		System.out.println("Programa para ler nomes e mostrar na tela a mais velha");
		System.out.println("=======================================================");
		System.out.println();
		
		double idadeMaior = 0;
		String pessoaMaisVelha = null;
		int n = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Entre com o número de pessoas que vai digitar: ");

		n = sc.nextInt();
		System.out.println();
	
		Pessoas[] vetor = new Pessoas[n];
		
		for(int i=0; i<n; i++) {
			
			System.out.print("Digite os dados da " + (i+1) + "a pessoa:");
			System.out.println();
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			Double idade = sc.nextDouble();
			vetor[i] = new Pessoas (nome, idade);
						
			if (idadeMaior<vetor[i].getIdade()){
				idadeMaior = vetor[i].getIdade();
				pessoaMaisVelha = vetor[i].getName();
			}
			
			
		}
		
		System.out.println("A pessoa mais velha é o " + pessoaMaisVelha + " com idade de " + idadeMaior + " anos");

				
		sc.close();
		

	}

}
