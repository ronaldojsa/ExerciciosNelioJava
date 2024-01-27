package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EXERCÍCIO - HERANÇA E POLIMORFISMO");
		System.out.println("==================================");
		System.out.println();
		
		System.out.print("Enter the number of employees:");
		int n = sc.nextInt();
		System.out.println();
		
		List<Employee> list = new ArrayList();
		
		for (int i=1; i<=n; i++) {
			
			System.out.println("Employee #" + i + " data:");
					
			System.out.print("Outsorded (y/n)?");
			char ch = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Hours: ");
			Double hours = sc.nextDouble();
			System.out.print("Value per hour: ");
			double valuePerHours = sc.nextDouble();
			
			if (ch == 'y'){
				System.out.print("Additional charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutsourcedEmployee(name, hours, valuePerHours, additionalCharge);
				list.add(emp);		
			}
			else {
				
				Employee emp = new Employee(name, hours, valuePerHours);
				list.add(emp);
				
			}
			
			}
			
			System.out.println();
			System.out.println("PAYMENTS:");
			System.out.println("---------");
			
			System.out.println();
			
			for (Employee emp : list) {
				System.out.println(emp.getName() + "- $ " + String.format("%.2f",  emp.payment()));
				
		}	
		
		sc.close();
	}

}
