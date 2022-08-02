import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		int X;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro:");
		X = sc.nextInt();
		
		for(int i=1; i<=X; i++) {
			
			if(X%i == 0) {
				System.out.println(i);
			}
		}
		sc.close();

	}
}
