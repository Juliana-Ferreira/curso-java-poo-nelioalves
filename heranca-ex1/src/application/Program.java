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
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			
			System.out.print("Outsourced (y/n)? ");
			char op = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.print("Value per hour: ");
			double value = sc.nextDouble();
			
			if(op == 'y') {
				System.out.print("Additional charge: ");
				double additional = sc.nextDouble();
				
				list.add(new OutsourcedEmployee(name, hours, value, additional));
			}
			else {
				list.add(new Employee(name, hours, value));
			}
		}
		
		System.out.println();
		System.out.println("PAYMENTS:");
		
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f", emp.payment()));
		}

		sc.close();
	}
}
