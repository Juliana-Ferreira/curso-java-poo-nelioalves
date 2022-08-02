import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int senha, tentativa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma nova senha: ");
		senha = sc.nextInt();
		
		System.out.println("Para acessar, digite a senha: ");
		tentativa = sc.nextInt();
		
		while (tentativa != senha) {
			System.out.println("Senha inválida, acesso negado.");
			tentativa = sc.nextInt();
		}
		System.out.println("Acesso permitido.");
		sc.close();
		
	}
}
