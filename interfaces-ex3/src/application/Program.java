package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		List<Employee> employees = new ArrayList<>();
		String path = "C:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String employeeCSV = br.readLine();
			
			while (employeeCSV != null) {
				String[] aux = employeeCSV.split(",");
				employees.add(new Employee(aux[0], Double.parseDouble(aux[1])));
				employeeCSV = br.readLine();
			}
			
			Collections.sort(employees);
			
			for (Employee employee : employees) {
				System.out.println(employee.getName() + "," + employee.getSalary());
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
