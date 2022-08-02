import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int code1, np1, code2, np2;
		double valp1, valp2, result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código da peça 1: ");
		code1 = sc.nextInt();
		System.out.println("Digite o número de peças: ");
		np1 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça 1: ");
		valp1 = sc.nextDouble();
		
		System.out.println("Digite o código da peça 2: ");
		code2 = sc.nextInt();
		System.out.println("Digite o número de peças: ");
		np2 = sc.nextInt();
		System.out.println("Digite o valor unitário da peça 2: ");
		valp2 = sc.nextDouble();
		
		result = (np1*valp1 + np2*valp2);
		System.out.printf("Valor a ser pago: R$%.2f", result);
		sc.close();
		
	}
}
