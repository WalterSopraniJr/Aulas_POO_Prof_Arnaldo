
public class Animal { //Super Classe
	//public String nome;
	//public void fazerSom() {
	//	System.out.println("O animal faz um som");
	String nome;
		
	Animal(String nome) {
		this.nome = nome;	
	}
	

}

class Cachorro extends Animal { //subclasse
	//public void fazerSom() {
	//	super.fazerSom();
	//	System.out.println("O cachorro late");	
	String raca;
	
	Cachorro(String nome, String raca){
		super(nome); //chama o construtor da superclasse Animal
		this.raca = raca;	
	}
}


