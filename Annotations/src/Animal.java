public class Animal { //Super Classe
	public void fazerSom() {
		System.out.println("O animal faz um som");
	}
}

class Cachorro extends Animal { //subclasse
	
	@Override
	public void fazerSom() {
		super.fazerSom();
		System.out.println("O cachorro late");	
	}
}
