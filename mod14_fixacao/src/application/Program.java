package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("EXERCÍCIO DE FIXAÇÃO");
		System.out.println("--------------------");
		System.out.println();
		
		Locale.setDefault(Locale.US);
		List<Pessoa> list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		double soma = 0;
		
		System.out.print("Enter the number of tax: ");
		int n = sc.nextInt();
		System.out.println();
		for (int i=1; i<=n; i++) {

			System.out.println ("Tax player #"+ i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double income = sc.nextDouble();
			
			if (type == 'i') {
				System.out.print("Health expenditures: ");
				double despesaSaude = sc.nextDouble();
				list.add(new PessoaFisica(nome, income, despesaSaude));
				
			}
			else {
				System.out.print("Number of emplyees: ");
				int numberEmployees = sc.nextInt();
				list.add(new PessoaJuridica(nome, income, numberEmployees));

			}
				
		}
		
			System.out.println();
			System.out.println("TAXES PAID:");

			for(Pessoa pessoas : list) {
				System.out.println(pessoas.getNome() + ": $ " + String.format("%.2f", pessoas.impostos()));
				soma += pessoas.impostos();
			
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", soma));
		
		sc.close();
		
	}
}
