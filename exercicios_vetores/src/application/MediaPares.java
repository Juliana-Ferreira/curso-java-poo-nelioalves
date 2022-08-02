package application;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		double sumPar = 0, contPar = 0;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		for(int i=0; i<vect.length; i++) {
			
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			if(vect[i]%2 == 0) {
				contPar += 1;
				sumPar += vect[i];
			}
		}
		
		double mediaPar = sumPar/contPar;
		
		System.out.println();
		if(contPar == 0) System.out.println("Nenhum número par.");
		else System.out.printf("Média dos pares: %.1f%n", mediaPar);

		sc.close();
	}
}
