
public class Veiculo {
	public void Acelerar(){
		System.out.println("Veículo acelerando!");
	}

}

class Carro extends Veiculo{
	public void Acelerar() {
		super.Acelerar();
		System.out.println("Carro acelerando!");
	}
}