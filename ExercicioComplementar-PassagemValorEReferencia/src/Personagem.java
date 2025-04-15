
public class Personagem {
	
	public String nome;
	public int nivelDePoder;
	
	public Personagem(String nome, int nivelDePoder) {
		this.nome = nome;
		this.nivelDePoder = nivelDePoder;		
	}
	
	public String getInformacao() {
		return "Seu personagem se chama: " + nome + ", e possui um poder de: " + nivelDePoder;		
	}
	
	public void tentarAumentarNivelDePoder(int nivelDePoder) {
		this.nivelDePoder += nivelDePoder;
		System.out.println("Nivel de poder modificadasso: " + this.nivelDePoder);
		System.out.println("\n");
	}
	
	public void aumentaNivelDePoder() {
		this.nivelDePoder += 10;
	}
	
	public void	mudarNome(String nome) {
		this.nome = nome;
		System.out.println("Seu novo nome é: " + nome);
		System.out.println("\n");
	}

}
