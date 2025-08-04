
public class Pessoa { 
	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
		
	public int getIdade() {
		return idade;
	}
	
}

class Estudante extends Pessoa{
	public int matricula;
	
	public Estudante(String nome, int idade, int matricula) {
		super(nome, idade);
		this.matricula = matricula;
	}
	public int getMatricula() {
		return matricula;
	}
}
