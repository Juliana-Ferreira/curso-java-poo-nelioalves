import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		valor = sc.nextInt();
		
		if(valor < 0) {
			System.out.println("O valor digitado � negativo.");
		}
		else {
			System.out.println("O valor digitado � positivo.");
		}

		sc.close();
	}
}
