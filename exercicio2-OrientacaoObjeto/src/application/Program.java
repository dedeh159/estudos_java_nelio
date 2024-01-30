package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.println("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println(employee);
		System.out.printf("Wich percentage to increase salary? ");
		double percentage = sc.nextInt();
		employee.increaseSalary(percentage);
		
		System.out.println("Updated data" + employee);
		
		sc.close();

	}

}
