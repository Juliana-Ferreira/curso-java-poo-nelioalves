import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int num1, num2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo valor: ");
		num2 = sc.nextInt();
		System.out.println("A soma dos valores é: " + (num1+num2));
		sc.close();
		
	}

}
