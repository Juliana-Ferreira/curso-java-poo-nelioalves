import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int X;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor inteiro entre 1 e 1000:");
		X = sc.nextInt();
		
		for (int i=1; i<=X; i++) {
			if(i%2 == 1) System.out.println(i);
		}
		sc.close();

	}
}
