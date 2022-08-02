package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Pessoa;

public class Alturas {

	public static void main(String[] args) {
		double sumHeight = 0.0;
		int sumMinor = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas ser�o digitadas? ");
		int n = sc.nextInt();
		
		Pessoa[] pessoa = new Pessoa[n];
		for(int i=0; i<pessoa.length; i++) {
			System.out.println("Dados da " + (i+1) + "� pessoa:");
			
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			
			pessoa[i] = new Pessoa(name, age, height);
			sumHeight += pessoa[i].getHeight();
			
			if(pessoa[i].getAge() < 16) sumMinor += 1;
		}
		
		double avg = sumHeight/n;
		double percent = ((double)sumMinor/n)*100.0;
		
		System.out.printf("Altura m�dia: %.2f%n", avg);
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.1f", percent) + "%");
		
		for(int i=0; i<pessoa.length; i++) {
			if(pessoa[i].getAge() < 16) System.out.println(pessoa[i].getName());
		}

		sc.close();
	}
}
