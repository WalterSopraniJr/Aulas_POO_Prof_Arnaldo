package empresa.dados;

//classe para testar o static

public class TestStatic {
	
	public static void exibirValor(int a) {
		System.out.println("O valor do inteiro �: " + a);
	}
	
	public static void exibirValor(String str) {
		System.out.println("A string �: " + str);
	}
	
	public static void main(String[] args) {
		exibirValor("oi");
		exibirValor(10);
		
	}

}
