import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int tipo, alcool = 0, gasolina = 0, diesel = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tipo de combustível abastecido: \n1.Álcool \n2.Gasolina \n3.Diesel \n4.Sair");
		tipo = sc.nextInt();
		
		while(tipo != 4) {
			if(tipo == 1) alcool += 1;
			else if(tipo == 2) gasolina += 1;
			else if(tipo == 3) diesel += 1;
			
			tipo = sc.nextInt();
		}
		
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}
}
