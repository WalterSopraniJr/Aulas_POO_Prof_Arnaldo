
public class TestaPersonagem {
	
	public static void main(String[] args) {
		
		Personagem ruff = new Personagem("Ruff", 50);
		
		System.out.println(ruff.getInformacao());
		
		System.out.println("Nivel de pode atual: " + ruff.nivelDePoder);
		ruff.tentarAumentarNivelDePoder(10);
		
		ruff.mudarNome("Rei Ruff");
		
		System.out.println("Nivel de pode atual: " + ruff.nivelDePoder);
		ruff.aumentaNivelDePoder();
		System.out.println("Nivel de pode aumentado em 10: " + ruff.nivelDePoder);
		
	}

}
