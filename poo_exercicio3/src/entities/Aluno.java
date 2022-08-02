package entities;

public class Aluno {

	double soma = 0;
	public String name;
	public double notas[] = new double[3];
	
	public double finalGrade() {
		for(int i=0; i<notas.length; i++) {
			soma += notas[i];
		}
		return soma;
	}
	
	public String checkFinalGrade() {
		if(soma >= 60.00) {
			return "PASS";
		}
		else {
			return "FAILED" + "\nMissing " + String.format("%.2f", 60.00 - soma) + " points";
		}
	}
	
	public String toString() {
		return "Final grade: " + String.format("%.2f", finalGrade()) + "\n" + checkFinalGrade();
	}
}
