package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);

		File sourceFile = new File("C:\\temp\\Exercicio\\file.csv");
		boolean out = new File(sourceFile.getParent() + "\\out").mkdir();
		String targetPath = "C:\\temp\\Exercicio\\out\\summary.csv";
		
		List<Product> products = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile.getPath()))) {
			String line = reader.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				double price = Double.parseDouble(fields[1]);
				int quantity = Integer.parseInt(fields[2]);

				products.add(new Product(name, price, quantity));			
				line = reader.readLine();
			}

			try (BufferedWriter writer = new BufferedWriter(new FileWriter(targetPath))) {
				for(Product product : products) {
					writer.write(product.getName() + "," + String.format("%.2f", product.total()));
					writer.newLine();
				}
				
			} catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}
