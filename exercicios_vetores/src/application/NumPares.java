package application;

import java.util.Scanner;

public class NumPares {

	public static void main(String[] args) {
		int contPar = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println();
		System.out.println("Números pares:");
		for(int i=0; i<vect.length; i++) {
			if(vect[i]%2 == 0) {
				System.out.println(vect[i]);
				contPar += 1;
			}
		}
		
		System.out.println();
		System.out.println("Quantidade de pares: " + contPar);

		sc.close();
	}
}
