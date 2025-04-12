class SalaDeAula {
	
	static int quantidadeAlunos = 0;
	
	public static void adicionaAluno() {		
		quantidadeAlunos ++;
	}
	
	public static void exibeTotalDeAlunos() {
		
		System.out.println("O total de alunos é: " + quantidadeAlunos);
	}
	
}

class TestaSalaDeAula {
	
	public static void main(String[] args) {
		
		// Criando instâncias da classe SalaDeAula
		 SalaDeAula sala1 = new SalaDeAula();
		 SalaDeAula sala2 = new SalaDeAula();
		 SalaDeAula sala3 = new SalaDeAula();
		 
		 // Adicionando alunos
		 SalaDeAula.adicionaAluno();
		 SalaDeAula.adicionaAluno();
		 SalaDeAula.adicionaAluno();
		 
		 // Exibindo o número total de alunos
		 SalaDeAula.exibeTotalDeAlunos();
		
	}

}
