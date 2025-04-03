
public class Carro {

	String marca;
	String modelo;
	int ano;
	
	Carro(String marcaInit, String modeloInit, int anoInit){
		marca = marcaInit;
		modelo = modeloInit;
		ano = anoInit;
	}
	
	Carro(String marcaInit, String modeloInit){
		marca = marcaInit;
		modelo = modeloInit;
	}
	
	Carro(){
	}
	
	public static void main(String[] args) {
		
		//Carro celta = new Carro("Volkswagem", "Celta", 2009);
		//Carro celta = new Carro();
		Carro celta = new Carro("Volkswagem", "Celta");
		
		System.out.println("O modelo do carro é: " + celta.modelo);
		System.out.println("A marca do carro é: " + celta.marca);
		System.out.println("O ano é: " + celta.ano);
	}
	
}