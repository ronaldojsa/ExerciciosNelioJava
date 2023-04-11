package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		
		
		System.out.println ("Entre com os dados do aluno");
		System.out.println ("===========================");
		System.out.println ("");
		
		System.out.print("Enter with name of student: ");		
		student.name = sc.nextLine();
		System.out.print("Enter with first grade: ");				
		student.grade1 = sc.nextDouble();
		System.out.print("Enter with second grade: ");		
		student.grade2 = sc.nextDouble();
		System.out.print("Enter with third grade: ");		
		student.grade3 = sc.nextDouble();
		
		
		if (student.finalGrade() >= 60.0) {
			System.out.println("PASS");
		}
		else {
			System.out.println ("FAILED");
			System.out.println ("Missing: " + student.missingPoints() + " points");
		}

	}

}
