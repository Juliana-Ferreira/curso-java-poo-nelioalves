import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int valor;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		valor = sc.nextInt();
		
		if(valor % 2 == 0) {
			System.out.println("O valor digitado � par.");
		}
		else {
			System.out.println("O valor digitado � �mpar.");
		}

		sc.close();

	}
}
