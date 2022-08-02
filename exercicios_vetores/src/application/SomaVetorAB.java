package application;

import java.util.Scanner;

public class SomaVetorAB {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();
		
		double[] vectA = new double[n];
		System.out.println("Digite os valores do vetor A:");
		for(int i=0; i<vectA.length; i++) {
			vectA[i] = sc.nextDouble();
		}
		
		double[] vectB = new double[n];
		System.out.println("Digite os valores do vetor B:");
		for(int i=0; i<vectB.length; i++) {
			vectB[i] = sc.nextDouble();
		}
		
		double[] result = new double[n];
		System.out.println("Vetor resultante: ");
		for(int i=0; i<result.length; i++) {
			result[i] = vectA[i] + vectB[i];
			System.out.printf("%.1f%n", result[i]);
		}

		sc.close();
	}
}
