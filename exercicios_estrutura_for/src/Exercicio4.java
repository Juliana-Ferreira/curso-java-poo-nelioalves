import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int N;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de pares a serem lidos:");
		N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			
			if(b == 0) {
				System.out.println("Divis�o imposs�vel");
			}
			else {
				double div = a/b;
				System.out.printf("Resultado da divis�o: %.1f%n", div);
			}
			
		}
		sc.close();

	}
}
