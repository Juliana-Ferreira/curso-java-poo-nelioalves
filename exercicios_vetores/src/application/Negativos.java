package application;

import java.util.Scanner;

public class Negativos {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("Números negativos:");
		for(int j=0; j<vect.length; j++) {
			if(vect[j] < 0) {
				System.out.println(vect[j]);
			}
		}
		
		sc.close();
	}
}
