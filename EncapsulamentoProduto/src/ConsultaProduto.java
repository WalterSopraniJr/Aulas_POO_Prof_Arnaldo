import empresa.Dados.*;

public class ConsultaProduto {
	public static void main(String[] args) {
		
		Produto camiseta = new Produto("Camiseta", 50.00, 15);
		System.out.println(camiseta.ChamaProduto());
	}

}
