package aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employees;

public class Program {

	public static void main(String[] args) {
		
		
		System.out.println("PROGRAMA PARA EXERCITAR - LISTAS");
		System.out.println("================================");
		System.out.println();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employees> list = new ArrayList();
		
		
		System.out.print("How many employees will be registered: ");
		int numberEmployees = sc.nextInt();
		
		System.out.println();
		
		for (int i=0; i<numberEmployees;i++) {
			
			System.out.println("Employee # " + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (hasId(list,id)) {
				System.out.print("Id already taken. Try again:");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();	
			
			list.add(new Employees(id, name, salary));
		}
		
		
			// updating salary
		
		System.out.println();
		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		
		Employees emp = list.stream().filter(x-> x.getId()==id).findFirst().orElse(null);
		
		if (emp == null ) {
			System.out.println("This id does not exist !!!");
		}
			
			else {
				System.out.print("Enter the percentage: ");
				double percentage = sc.nextDouble();
				emp.increaseSalary(percentage);
			
		}
		
		/*
		// outra opção para procurar id
		
		Integer pos = procura(list, id);
		if (pos == null) {
			
		}
		
		else {
			
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			list.get(pos).increaseSalary(percentage);
		}                                                         */

		// Printing
		
		System.out.println();
		System.out.println("List of employees:");
		System.out.println();
		for(Employees obj : list) {
			System.out.println(obj);
			
		}
		
				
		sc.close();	
		

		}
	
		public static boolean hasId(List<Employees>list, int id) {
			Employees emp = list.stream().filter (x-> x.getId() == id).findFirst().orElse(null);
			return emp != null;
		
		}
	
		/*
		public static Integer procura(List<Employees> lista, int id) {
			for (int i=0; i< lista.size(); i++) {
				if (lista.get(i).getId() == id){
					return i;
				}

			}
			return null;
			
		}
	
		*/
			
	}

