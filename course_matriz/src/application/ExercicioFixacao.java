package application;

import java.util.Scanner;

public class ExercicioFixacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of lines: ");
		int m = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int n = sc.nextInt();
		
		int[][] matriz = new int[m][n];
		
		System.out.println("Enter the array values:");
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Choose a number from the typed array: ");
		int value = sc.nextInt();
		
		for(int i=0; i<matriz.length; i++) {
			for(int j=0; j<matriz[i].length; j++) {
				if(matriz[i][j] == value) {
					System.out.println("Position [" + i + "][" + j + "]: ");
					if((j-1) >= 0) 
						System.out.println("Left: " + matriz[i][(j-1)]);
					if((j+1) < matriz[i].length)
						System.out.println("Right: " + matriz[i][(j+1)]);
					if((i-1) >= 0)
						System.out.println("Up: " + matriz[(i-1)][j]);
					if((i+1) < matriz.length)
						System.out.println("Down: " + matriz[(i+1)][j]);
				}
			}
		}

		sc.close();
	}
}
