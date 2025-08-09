
interface Produto{
	String getNome();
	int getQuantidade();
	void adicionaQuantidade(int quantidade);
	void removerQuantidade(int quantidade);
}

class ProdutoImpl implements Produto{
	
	private String nome;
	private int quantidade;
	
	public ProdutoImpl(String nome, int quantidade) {
		this.nome = nome;
		this.quantidade = quantidade;
	}
	
	@Override
	public String getNome() {
		return nome;
	}
	
	@Override
	public int getQuantidade() {
		return quantidade;
	}
	
	@Override
	public void adicionaQuantidade(int quantidade) {
		this.quantidade += quantidade;
	}
	
	@Override
	public void removerQuantidade(int quantidade) {
		if(this.quantidade >= quantidade) {
			this.quantidade -= quantidade;
		}else {
			System.out.println("Quantidade insuficiente em estoque");
		}
	}
	
}

public class InterfaceControleEstoque {
	public static void main(String[] args) {
		Produto produto = new ProdutoImpl("Refrigerante lata", 100);
		System.out.println("Produto: " + produto.getNome());
		System.out.println("Quantidade em estoque: " + produto.getQuantidade());
		
		produto.adicionaQuantidade(10);
		System.out.println("Nova quantidade após adição: " + produto.getQuantidade());
		
		produto.removerQuantidade(15);
		System.out.println("Nova quantidade após remoção: " + produto.getQuantidade());
		
	}

}
