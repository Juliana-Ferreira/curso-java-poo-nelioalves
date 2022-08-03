package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a quantidade de linhas e colunas da matriz: ");
		int n = sc.nextInt();
		
		int[][] mat = new int[n][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
				
				if(mat[i][j] < 0 ) count++;
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		System.out.println("Negative numbers: " + count);

		sc.close();
	}
}
