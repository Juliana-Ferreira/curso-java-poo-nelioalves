package application;

import java.util.Scanner;

public class MaiorPosicao {

	public static void main(String[] args) {
		double maior = 0;
		int posicao = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextDouble();
			
			if(vect[i] > maior) {
				maior = vect[i];
				posicao = i;
			}
		}
		
		System.out.println("Maior valor: " + maior);
		System.out.println("Posição do maior valor: " + posicao);

		sc.close();
	}
}
