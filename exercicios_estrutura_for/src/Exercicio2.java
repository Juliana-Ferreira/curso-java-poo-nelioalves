import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int N, X, in = 0, out = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de números a ser digitado:");
		N = sc.nextInt();
		
		for (int i=0; i<N; i++) {
			
			X = sc.nextInt();
			if(X>=10 && X<=20) in += 1;
			else out += 1;
			
		}
		
		System.out.println(in + " in\n" + out + " out");
		sc.close();

	}
}
