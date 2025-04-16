
public class main {
	
	public static void main(String[] args) {
		
		int tamanho = 5;
		double[] notas = new double[tamanho];
		
		notas[0] = 10;
		notas[1] = 6;
		notas[2] = 5;
		notas[3] = 4;
		notas[4] = 7;
		
		System.out.println("Nota dos alunos: ");
		
		for(int i = 0; i < notas.length; i++){
			System.out.print(notas[i] + " - ");
			
		}
	}

}
