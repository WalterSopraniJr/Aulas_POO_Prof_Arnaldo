import java.util.ArrayList;
import java.util.List;

interface PedidoRestaurante{
	void adicionarItem(String item, double preco);
	
	void calcularTotal();
}

class Pedido implements PedidoRestaurante{
	
	private class ItemPedido{
		String nome;
		double preco;
		
		ItemPedido(String nome, double preco){
			this.nome = nome;
			this.preco = preco;
		}
	}
	
	private List<ItemPedido> item = new ArrayList<>();
	private double valorTotal = 0;
	
	@Override
	public void adicionarItem(String item, double preco) {
		this.item.add(new ItemPedido(item, preco));
		this.valorTotal += preco;
	}
	
	public void calcularTotal() {
		System.out.println("O pedido foi: ");
		for(ItemPedido i: item) {
			System.out.printf("- %s (R$ %.2f)%n", i.nome, i.preco);
		}
		
		System.out.printf("Valor total: R$ %.2f%n", valorTotal);
	}
}
public class ChamaPedidoRestaurante {
	public static void main(String[] args) {
		
		Pedido cliente = new Pedido();
		cliente.adicionarItem("Hamburguer ", 30);
		cliente.adicionarItem("Batata Frita ", 12);
		cliente.adicionarItem("Refrigerante", 8);
		
		cliente.calcularTotal();
		
	}
}
