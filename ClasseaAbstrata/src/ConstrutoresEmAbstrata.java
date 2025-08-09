
abstract class Carros{
	int codigo = 10;
	
	Carros(int cod){
		codigo = cod;
	}
	
	abstract void acelerar();
	
	void frear() {
		System.out.println("O carro esté freando...");
	}
}

class Caminhoes extends Carros{
	Caminhoes (int codigo){
		super(codigo);
	}
	
	void acelerar() {
		System.out.println("O caminhao esta acelerando lentamente...");
	}
}

public class ConstrutoresEmAbstrata {
	public static void main (String[] args) {
		
		Caminhoes caminhao = new Caminhoes(1000); 
		System.out.println("Codigo " + caminhao.codigo);
	}
}
