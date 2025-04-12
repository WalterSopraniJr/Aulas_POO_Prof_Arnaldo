class SalaDeAula {
	
	static int quantidadeAlunos = 0;
	
	public static void adicionaAluno() {		
		quantidadeAlunos ++;
	}
	
	public static void exibeTotalDeAlunos() {
		
		System.out.println("O total de alunos é: " + quantidadeAlunos);
	}
	
}


