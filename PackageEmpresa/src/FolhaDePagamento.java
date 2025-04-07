import empresa.dados.*;

public class FolhaDePagamento {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Arnaldo", 5000.00);
		System.out.println(funcionario.obterInfo());
		
		double d = 3000.00;
		funcionario.aumentarSalario(d);
		System.out.println(funcionario.obterInfo());
	}

}
