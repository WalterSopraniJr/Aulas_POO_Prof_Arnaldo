
public class AplicandoHeranca {
	public static void main(String[] args) {
		Assistente assistente = new Assistente();
		assistente.addAumento(500);
		assistente.setNome("Jo�o");
		assistente.setSalario(3000);
		
		System.out.println("Nome: " + assistente.getNome());
		System.out.println("Sal�rio anual: R$" + assistente.ganhoAnual());
	}

}
