import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int A, B, C, D, dif;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		A = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		B = sc.nextInt();
		System.out.println("Digite o terceiro valor: ");
		C = sc.nextInt();
		System.out.println("Digite o quarto valor: ");
		D = sc.nextInt();
		
		dif = (A*B - C*D);
		
		System.out.println("Diferença: " + dif);
		sc.close();
		
	}
}
