import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		double salario, imposto;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salário:");
		salario = sc.nextDouble();
		
		if(salario <= 2000.00) imposto = 0;
		else if(salario>2000.00 && salario<=3000.00) imposto = (salario-2000)*0.08;
		else if(salario>3000.00 && salario<=4500.00) imposto = 1000*0.08+(salario-3000)*0.18;
		else imposto = 1000*0.08+1500*0.18+(salario-4500)*0.28;
		
		if(imposto == 0) System.out.println("Isento");
		else System.out.printf("Imposto: R$%.2f", imposto);
		sc.close();
	}
}
