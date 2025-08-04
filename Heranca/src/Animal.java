
public class Animal { //Super Classe
	public String nome;
	public void fazerSom() {
		System.out.println("O animal faz um som");
	}
	

}

class Cachorro extends Animal { //subclasse
	public void fazerSom() {
		super.fazerSom();
		System.out.println("O cachorro late");		
	}
}


