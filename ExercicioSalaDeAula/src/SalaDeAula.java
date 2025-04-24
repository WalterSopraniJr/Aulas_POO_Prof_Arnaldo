class SalaDeAula {
	
	static int quantidadeAlunos = 0;
	
	public static void adicionaAluno() {		
		quantidadeAlunos ++;
	}
	
	public static void exibeTotalDeAlunos() {
		
		System.out.println("O total de alunos �: " + quantidadeAlunos);
	}
	
}

class TestaSalaDeAula {
	
	public static void main(String[] args) {
		
		// Criando inst�ncias da classe SalaDeAula
		 SalaDeAula sala1 = new SalaDeAula();
		 SalaDeAula sala2 = new SalaDeAula();
		 SalaDeAula sala3 = new SalaDeAula();
		 
		 // Adicionando alunos
		 SalaDeAula.adicionaAluno();
		 SalaDeAula.adicionaAluno();
		 SalaDeAula.adicionaAluno();
		 
		 // Exibindo o n�mero total de alunos
		 SalaDeAula.exibeTotalDeAlunos();
		
	}

}
