
public class Animal { //Super Classe
	public void fazerSom() {
		System.out.println("O animal faz um som");
	}
	

}

class Cachorro extends Animal { //subclasse
	public void fazerSom() {
		System.out.println("O cachorro late");		
	}
}


