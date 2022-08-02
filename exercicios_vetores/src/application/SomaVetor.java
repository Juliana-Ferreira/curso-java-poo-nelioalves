package application;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		double sum = 0;
		String val = "Valores = ";
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos n�meros voc� vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um n�mero: ");
			vect[i] = sc.nextDouble();
			sum += vect[i];
			val += String.format("%.1f", vect[i]) + " ";
		}
		
		double avg = sum/n;
		System.out.println(val);
		System.out.printf("Soma = %.2f%n", sum);
		System.out.printf("M�dia = %.2f%n", avg);

		sc.close();
	}
}
