
abstract class Carro{
	abstract void acelerar();
	
	void frear() {
		System.out.println("O carro est� freando");
	}
}

class CarroF1 extends Carro{
	void acelerar() {
		System.out.println("O carro de Formula 1 est� acelerando muito rapidamente");
	}
}

class Caminhao extends Carro{
	void acelerar() {
		System.out.println("O caminhao est� acelerando lentamente");
	}
}

public class ClasseAbstrata {
	public static void main(String[] args) {
		CarroF1 carroF1 = new CarroF1();
		Caminhao caminhao = new Caminhao();
		
		carroF1.acelerar();
		carroF1.frear();
		
		caminhao.acelerar();
		caminhao.frear();
	}

}
