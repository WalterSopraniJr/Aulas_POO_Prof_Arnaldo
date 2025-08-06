
class FinalVariables{
	final int numeroMaximo = 100;
	final String mensagem = "Bem vindo ao mundo dos Javeiros!";
	
	public void imprimirValoresFinais() {
		System.out.println(numeroMaximo);
		System.out.println(mensagem);
	}
	
}

public class ExercicioFinal {
	public static void main(String[] args) {
		
		FinalVariables test = new FinalVariables();
		
		test.imprimirValoresFinais();
	}

}
