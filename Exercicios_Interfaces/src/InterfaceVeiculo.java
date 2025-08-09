
interface Veiculo{
	void iniciar();
	
	void parar();
	
	default void buzinar() {
		System.out.println("Buzinando");
	}
}

class Carro implements Veiculo{
	public void iniciar() {
		System.out.println("Carro ligado.");
	}

	public void parar() {
		System.out.println("Freio acionado.");
	}
}

class Caminhao implements Veiculo{
	public void iniciar() {
		System.out.println("Caminhão ligado.");
	}

	public void parar() {
		System.out.println("Freio acionado.");
	}
}

public class InterfaceVeiculo {
	public static void main(String[] args) {
		
		Carro celta = new Carro();
		celta.iniciar();
		celta.buzinar();
		celta.parar();
		
		Caminhao scania = new Caminhao();
		scania.iniciar();
		scania.buzinar();
		scania.parar();
	}

	
}
