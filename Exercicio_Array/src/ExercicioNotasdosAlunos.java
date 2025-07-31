
public class ExercicioNotasdosAlunos {
	public static void main(String[] args) {
		
		double[] notasAluno;
		
		notasAluno = new double[] {10, 5, 6, 8, 9};
		
		System.out.println("Notas aluno 1");

		
		for(double elementos: notasAluno) {
			System.out.print(elementos);
		}
				
		notasAluno = new double[5];
		notasAluno[0] = 4;
		notasAluno[1] = 3;
		notasAluno[2] = 5;
		notasAluno[3] = 6;
		notasAluno[4] = 2;
		
		System.out.println("\nNotas aluno 2");
		
		for(int i=0; i < notasAluno.length; i++) {
			System.out.print(notasAluno[i]);
		}
	}

}
