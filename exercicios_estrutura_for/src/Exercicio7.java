import java.util.Scanner;

public class Exercicio7 {

	public static void main(String[] args) {
		int N;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor:");
		N = sc.nextInt();
		
		for(int i=1; i<=N; i++) {
			
			int linha = i;
			int quad = i*i;
			int cubo = i*i*i;
			
			System.out.println(linha + " " + quad + " " + cubo);
		}
		sc.close();

	}
}
