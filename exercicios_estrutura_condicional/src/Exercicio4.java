import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		int hI, hF, duracao;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o horario inicial do jogo:");
		hI = sc.nextInt();
		System.out.println("Digite o horario final do jogo:");
		hF = sc.nextInt();
		
		if(hI<hF) duracao = hF - hI;
		else duracao = (24 - hI) + hF;
		
		System.out.println("O jogo durou " + duracao + " horas.");
		sc.close();
		
		}
	}
