import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		int X, Y;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da primeira coordenada: ");
		X = sc.nextInt();
		System.out.println("Digite o valor da segunda coordenada: ");
		Y = sc.nextInt();
		
		while(X!=0 && Y!=0) {
			
			if(X>0 && Y>0) System.out.println("Primeiro quadrante.");
			else if(X<0 && Y>0) System.out.println("Segundo quadrante.");
			else if(X<0 && Y<0) System.out.println("Terceiro quadrante.");
			else System.out.println("Quarto quadrante.");
			
			System.out.println("Digite um novo valor para a primeira coordenada: ");
			X = sc.nextInt();
			System.out.println("Digite um novo valor para a segunda coordenada: ");
			Y = sc.nextInt();
		}
		sc.close();
	}
}
