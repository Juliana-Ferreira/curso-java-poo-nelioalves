import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int code;
		double HrTrab, ValHr, salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o c�digo do funcion�rio: ");
		code = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		HrTrab = sc.nextInt();
		System.out.println("Digite o valor por hora trabalhada: ");
		ValHr = sc.nextDouble();
		
		salario = HrTrab*ValHr;
		
		System.out.println("C�digo do funcion�rio: " + code);
		System.out.printf("Sal�rio do funcion�rio: R$%.2f", salario);
		sc.close();

	}
}
