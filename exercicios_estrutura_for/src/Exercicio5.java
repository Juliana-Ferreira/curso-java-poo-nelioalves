import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int N, fat = 1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor:");
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			fat = fat * i;
		}
		
		System.out.println("Fatorial: " + fat);
		sc.close();

	}
}
