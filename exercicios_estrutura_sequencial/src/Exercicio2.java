import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		double A, area, raio, pi;
		pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor do raio do c�rculo: ");
		raio = sc.nextDouble();
		
		A = Math.pow(raio, 2);
		area = pi*A;
		
		System.out.printf("A �rea do c�rculo �: %.4f", area);
		sc.close();
		
	}

}
