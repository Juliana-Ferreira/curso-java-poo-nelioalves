package application;

import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Employee employee = new Employee();
		double percentage;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(percentage = sc.nextDouble());
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		sc.close();
	}
}
