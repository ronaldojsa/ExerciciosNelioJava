package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Quartos;

public class Program {

	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//String name;
		//String email;
		
		
		System.out.println ("PROGRAMA PARA CONTROLE DE QUARTOS DE PENSIONATO");
		System.out.println ("===============================================");
		System.out.println();

		Quartos[] quartos = new Quartos[10];
		System.out.print("How many rooms will rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i=0; i<n; i++) {
			
		System.out.println("Rent #" + (i+1) + ":");
		System.out.print("Name: ");
		String name = sc.nextLine();

		System.out.print("E-mail: ");
		String email = sc.nextLine();
		System.out.print ("Room: ");
		int roomNumber = sc.nextInt();
		sc.nextLine();
		quartos[roomNumber] = new Quartos(name, email, roomNumber);
			
		System.out.println();
		}
		
		System.out.println("Busy rooms: ");
		for (int i=0; i<10; i++) {
			
			if (quartos[i] != null) {
			System.out.println(quartos[i]);		
			
		}		
		
		}	
			
	sc.close();	
	}
	

/*public static boolean ocupado(boolean x) {
		for (int i=0; i<10; i++) {
			//if (quartos[i].getNumQuarto != null);
			x = true;
			}
		return x;		*/


}	
	


