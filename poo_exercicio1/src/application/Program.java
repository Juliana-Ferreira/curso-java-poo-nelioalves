package application;

import java.util.Scanner;
import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a largura do ret�ngulo: ");
		rectangle.width = sc.nextDouble();
		System.out.print("Digite a altura do ret�ngulo: ");
		rectangle.height = sc.nextDouble();
		
		System.out.println(rectangle);
		sc.close();
	}
}
