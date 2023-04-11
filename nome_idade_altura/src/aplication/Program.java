package aplication;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAMA PARA LER NOME, IDADE E ALTURA E IMPRIMIR");
		System.out.println("=================================================");
		System.out.println();
			
		double somaAltura = 0;
		int menos16 = 0;
		int num=0;
		System.out.print("Quantas pessoas serão digitadas? ");
		num = sc.nextInt();
		System.out.println();

		Pessoa[] pessoa = new Pessoa[num];
		
		for (int i = 0; i<num; i++) {
			sc.nextLine();
			System.out.print("Nome da " + (i+1) + "a "+ "pessoa: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			pessoa[i] = new Pessoa(nome, idade, altura);
			somaAltura += altura;
			if (idade < 16) {
				menos16 = menos16+1;			
				
			}
			
			
		}

		
			System.out.println();
			
			System.out.printf("Altura média: " + "%.2f%n", somaAltura/num);
			
			// System.out.println("Altura média: " + somaAltura/num);
			double num1 = num;
			double percentual = (menos16/num1)*100;		
			
			System.out.println("Pessoas com menos de 16 anos: " + percentual + "%");
			
		
		
			for (int i = 0; i<num; i++) {
				
						
				if (pessoa[i].getIdade() < 16) {
					System.out.println(pessoa[i].getName());			
					
				}
		
			}
		
		sc.close();

	}
	}
