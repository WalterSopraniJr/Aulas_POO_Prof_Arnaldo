
class Livro {

	public String titulo = "Desconhecido";
	private String autor = "Desconhecido";
	protected int anoPublicacao = 0;
	double preco = 0.0;
	
	public Livro() {		
		this.titulo = "Desconhecido";
		this.autor = "Desconhecido";
		this.anoPublicacao = 0;
		this.preco = 0.0;
		System.out.println("O título to livro é: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano de publicação: " + anoPublicacao);
		System.out.println("Preço: R$" + preco);
		System.out.println("\n");
	}
	
	public Livro(String tituloInit, String autorInit) {
		this.titulo = tituloInit;
		this.autor = autorInit;
		this.anoPublicacao = 0;
		this.preco = 0.0;
		
		System.out.println("O título to livro é: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano de publicação: " + anoPublicacao);
		System.out.println("Preço: R$" + preco);
		System.out.println("\n");
	}
	
	public Livro(String tituloInit, String autorInit, int anoPublicacaoInit, double precoInit) {
		titulo = tituloInit;
		autor = autorInit;
		anoPublicacao = anoPublicacaoInit;
		preco = precoInit;	
		System.out.println("O título to livro é: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Ano de publicação: " + anoPublicacao);
		System.out.println("Preço: R$" + preco);
		System.out.println("\n");
	}
	
}


