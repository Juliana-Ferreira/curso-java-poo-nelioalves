import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int code;
		double HrTrab, ValHr, salario;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o código do funcionário: ");
		code = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas: ");
		HrTrab = sc.nextInt();
		System.out.println("Digite o valor por hora trabalhada: ");
		ValHr = sc.nextDouble();
		
		salario = HrTrab*ValHr;
		
		System.out.println("Código do funcionário: " + code);
		System.out.printf("Salário do funcionário: R$%.2f", salario);
		sc.close();

	}
}
