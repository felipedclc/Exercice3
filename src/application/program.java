package application;

import java.util.Locale;
import java.util.Scanner;

import entities.student;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		student student = new student();
		
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.print(student);
		
		if(student.soma() > 60) {
		System.out.print("\nPASS");
		}
		else {
			System.out.printf("\nFAILED" + "\n" + "MISSING %.2f", student.missing());
		}
		
		sc.close();

	}

}
