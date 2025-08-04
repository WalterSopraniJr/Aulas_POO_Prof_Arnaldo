
public class Animal { //Super Classe
	public void fazerSom(int i, String s) {
		System.out.println("O animal faz um som");
	}
	

}

class Cachorro extends Animal { //subclasse
	public void fazerSom(int i, String s) {
		System.out.println("O cachorro late");		
	}
}


