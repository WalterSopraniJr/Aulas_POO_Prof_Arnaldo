package empresa.dados;

//classe para testar o static

public class TestStatic {
	
	public void exibirValor(int a) {
		System.out.println("O valor do inteiro �: " + a);
	}
	
	public static void main(String[] args) {
		TestStatic ts = new TestStatic();
		
		ts.exibirValor(10);
		
	}

}
