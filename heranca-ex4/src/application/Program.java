package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Contribuinte;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Contribuinte> contribuintes = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			System.out.println("Tax payer #" + (i+1) + " data:");
			System.out.print("Individual or company (i/c)? ");
			char op = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if(op == 'i') {
				System.out.print("Health expenditures: ");
				double gastosSaude = sc.nextDouble();
				
				contribuintes.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
			}
			else {
				System.out.print("Number of employees: ");
				int funcionarios = sc.nextInt();
				
				contribuintes.add(new PessoaJuridica(nome, rendaAnual, funcionarios));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		
		double sum = 0.0;
		for(Contribuinte pessoa : contribuintes) {
			System.out.println(pessoa.getNome() + ": $" + String.format("%.2f", pessoa.imposto()));
			sum += pessoa.imposto();
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES: $" + String.format("%.2f", sum));

		sc.close();
	}
}
