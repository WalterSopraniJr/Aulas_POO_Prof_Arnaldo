
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
	public static void main(String[] args) {
		
		InformaRegras regras = new InformaRegras();
		
		//Uso do método obsoleto (deprecated)
		regras.mostrarRegrasParaAposentadoria();
		
		//Uso do novo método
		regras.mostrarNovasRegrasParaAposentadoria();
	}

}
