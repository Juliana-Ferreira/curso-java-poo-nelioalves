import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		int code;
		double qtd, pagar=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do item conforme a tabela: "
				+ "\n1. Cachorro quente"
				+ "\n2. X-salada"
				+ "\n3. X-bacon"
				+ "\n4. Torrada simples"
				+ "\n5. Refrigerante \n");
		code = sc.nextInt();
		System.out.println("Digite a quantidade:");
		qtd = sc.nextInt();
		
		switch(code) {
		
		case 1:
			pagar = qtd*4.00;
			break;
		case 2:
			pagar = qtd*4.50;
			break;
		case 3:
			pagar = qtd*5.00;
			break;
		case 4:
			pagar = qtd*2.00;
			break;
		case 5:
			pagar = qtd*1.50;
			break;
			
		default:
			System.out.println("Opção não consta no menu.");
			break;	
		}
		
		System.out.printf("Total a ser pago: R$%.2f", pagar);
		sc.close();

	}
}
