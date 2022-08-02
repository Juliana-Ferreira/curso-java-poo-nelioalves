package application;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		double sum = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
		}
		
		double media = sum/n;
		
		System.out.println();
		System.out.printf("Média do vetor: %.3f%n", media);
		System.out.println("Elementos abaixo da média:");
		for(double i : vect) {
			if(i < media) System.out.println(i);
		}

		sc.close();
	}
}
