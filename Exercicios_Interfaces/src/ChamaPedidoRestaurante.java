import java.util.ArrayList;
import java.util.List;

interface PedidoRestaurante{
	void adicionarItem(String item, double preco);
	
	void calcularTotal();
}

class Pedido implements PedidoRestaurante{
	
	private List<String> item = new ArrayList<>();
	private double valorTotal = 0;
	
	@Override
	public void adicionarItem(String item, double preco) {
		this.item.add(item);
		this.valorTotal += preco;
	}
	
	public void calcularTotal() {
		System.out.println("O pedido foi: ");
		for(String i: item) {
			System.out.println("- " + i);
		}
		
		System.out.println("O valor total do pedido é de R$" + valorTotal);
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
