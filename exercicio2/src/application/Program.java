package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
	
		Employee emp = new Employee();
		Locale.setDefault(Locale.US);
		
		System.out.println("Dados do funcionário: ");
		System.out.println("======================");
		
		System.out.print("Name: ");
		
		Scanner sc = new Scanner(System.in);
		emp.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		emp.grossSalary = sc.nextDouble() ;
		
		System.out.print("Tax: ");
		emp.tax = sc.nextDouble();
		
		System.out.println("Employee: "+ emp);
		
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.IncreaseSalary(percentage);
		
		System.out.println("Updated data: " + emp);
		
		
		sc.close();

	}

}