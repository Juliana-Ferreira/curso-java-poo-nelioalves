import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int A, B;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextInt();
		System.out.println("Digite o valor de B: ");
		B = sc.nextInt();
		
		if(A%B == 0 || B%A == 0) {
			System.out.println("Os valores são múltiplos.");
		}
		else {
			System.out.println("Os valores não são múltiplos.");
		}
		sc.close();

	}
}
