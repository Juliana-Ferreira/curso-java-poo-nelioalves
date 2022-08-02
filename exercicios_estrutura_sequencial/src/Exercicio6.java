import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		double A, B, C, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		double pi = 3.14159;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de A: ");
		A = sc.nextDouble();
		System.out.println("Digite o valor de B: ");
		B = sc.nextDouble();
		System.out.println("Digite o valor de C: ");
		C = sc.nextDouble();
		
		areaTri = (A*C)/2;
		double elev = Math.pow(C, 2);
		areaCirc = pi*elev;
		areaTrap = ((A+B)/2)*C;
		areaQuad = B*B;
		areaRet = A*B;
		
		System.out.printf("Triângulo: %.3f %n", areaTri);
		System.out.printf("Círculo: %.3f %n", areaCirc);
		System.out.printf("Trapézio: %.3f %n", areaTrap);
		System.out.printf("Quadrado: %.3f %n", areaQuad);
		System.out.printf("Retangulo: %.3f", areaRet);
		sc.close();

	}
}
