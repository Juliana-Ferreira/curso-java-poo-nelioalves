import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int N;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a quantidade de médias a serem lidas:");
		N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();
			
			double media = (a*2.0 + b*3.0 + c*5.0)/10.0;
			
			System.out.printf("Média: %.1f%n", media);
		}
		sc.close();
	}
}
