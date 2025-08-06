
class InformaRegras{
	
	@Deprecated
	public void mostrarRegrasParaAposentadoria() {
		System.out.println("Regras para aposentadoria");
	}
	
	public void mostrarNovasRegrasParaAposentadoria() {
		System.out.println("NOVAS Regras para aposentadoria");
	}
}

public class UsoDeprecated {
	
	@SuppressWarnings("deprecation") // � utilizado para suprimir avisos espec�ficos do compilador
	public static void main(String[] args) {
		
		InformaRegras regras = new InformaRegras();
		
		//Uso do m�todo obsoleto (deprecated)
		regras.mostrarRegrasParaAposentadoria();
		
		//Uso do novo m�todo
		regras.mostrarNovasRegrasParaAposentadoria();
	}

}
