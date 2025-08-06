
class MetodoFinal {
	
	//Definição de constante para o uso do final
	final int CODIGO_FIXO = 10;
	
	//Método final
	final void meuMetodo() {
		System.out.println("Este é o método final.");
	}

}

public class ExemploFinal{
	public static void main(String[] args) {
		MetodoFinal testeFinal = new MetodoFinal();
		System.out.println("Valor da constante: " + testeFinal.CODIGO_FIXO);
		testeFinal.meuMetodo();
	}
}