
interface ReinoAnimal {
	void fazerSom(); //M�todo Abstrato
}


class Cachorro implements ReinoAnimal{

	public void fazerSom() {
		System.out.println("O cachorro late."); //Defini��o do m�todo
	}
}

class Gato implements ReinoAnimal{
	
	public void fazerSom() {
		System.out.println("O gato mia."); //Defini��o do m�todo
	}
}

public class Animal{
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.fazerSom();
		
		Gato gato = new Gato();
		gato.fazerSom();
	}
}
