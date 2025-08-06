interface SerVivo{
	void respirar();
}

interface ReinoAnimal extends SerVivo {
	void fazerSom(); //Método Abstrato
}


class Cachorro implements ReinoAnimal{

	public void respirar() {
		System.out.println("O cachorro respira."); //Definição do método
	}
	
	public void fazerSom() {
		System.out.println("O cachorro late."); //Definição do método
	}
}

class Gato implements ReinoAnimal{

	public void respirar() {
		System.out.println("O gato respira."); //Definição do método
	}
	
	public void fazerSom() {
		System.out.println("O gato mia."); //Definição do método
	}
}

public class Animal{
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom();
		cachorro.respirar();
		
		Gato gato = new Gato();
		gato.fazerSom();
		gato.respirar();
	}
}
