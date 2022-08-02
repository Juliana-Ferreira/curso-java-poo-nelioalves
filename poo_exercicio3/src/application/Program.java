package application;

import java.util.Scanner;
import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Nome do aluno: ");
		aluno.name = sc.nextLine();
		System.out.println("Entre com as notas de cada trimestre: ");
		for(int i=0; i<3; i++) {
			aluno.notas[i] = sc.nextDouble();
		}
		
		System.out.println(aluno);
		sc.close();
	}
}
