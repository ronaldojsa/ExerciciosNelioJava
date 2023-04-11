package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Alunos;

public class Program {

	public static void main(String[] args) {
	
		System.out.println("Programa para ler nomes e notas dos alunos e mostrar os aprovados");
		System.out.println("=================================================================");
		System.out.println();
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		String nome = null;
		double nota1 = 0;
		double nota2 = 0;
		
		System.out.print("Entre com a quantidade de alunos a serem digitados: ");
		int n = sc.nextInt();
		Alunos alunos[] = new Alunos[n];
		System.out.println();

		
		for (int i=0; i<n; i++) {
			sc.nextLine();
			System.out.print("Entre com o nome do " + (i+1) + "o" + " aluno: ");
			nome = sc.nextLine();
			System.out.print("Entre com a primeira nota: ");
			nota1 = sc.nextDouble();
			System.out.print("Entre com a segunda nota: ");
			nota2 = sc.nextDouble();
			System.out.println();
			alunos[i] = new Alunos (nome, nota1, nota2);	
			
		}
		
		double media = 0;
		
		System.out.println("Alunos aprovados:");
		System.out.println();
		for (int i=0; i<n; i++) {
			
			media = ((alunos[i].getNota1() + alunos[i].getNota2())/2);
			if (media >=6.0) {
		
			//System.out.println(alunos[i].getNome() + " - média: " + media);
				
				System.out.println(alunos[i]);
			

			}
				

				
			
		}
		
		
		sc.close();
		

	}

}
