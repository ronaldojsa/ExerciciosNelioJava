package aplication;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PROGRAMA PARA LER ALTURA E GÊNERO");
		System.out.println("=================================");
		System.out.println();
		
		System.out.print("Entre com a quantidade de pessoas a serem digitadas: ");
		int n = sc.nextInt();
		double[] altura = new double[n];
		char genero[] = new char[n];
		double menorAltura = 100, maiorAltura = 0, alturaMediaFem = 0.0, soma = 0.0;
		
		
		int quantHomens = 0;
		
		for (int i=0; i<n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Gênero da " + (i+1) + "a pessoa: ");
			genero[i] = sc.next().charAt(0);
			
			if (altura[i]<menorAltura) {
				menorAltura = altura[i];
			}
			if (altura[i] > maiorAltura) {
				maiorAltura=altura[i];
				
			}
			
			
			
			if (genero[i] == 'M'){
				quantHomens++;	
			}
			if (genero[i] =='F') {
				soma = soma + altura[i];
				
			}
				
		}
			alturaMediaFem = soma / (n-quantHomens);
			
			System.out.println("A menor altura é: " + menorAltura);
			System.out.println("A maior altura é: " + maiorAltura);
			System.out.printf("A média das alturas das mulheres é: %.2f\n", alturaMediaFem);
			System.out.println("O número de homens é: " + quantHomens);
			
			
		sc.close();
		
		
	}

}
