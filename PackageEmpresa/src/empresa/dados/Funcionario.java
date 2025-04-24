package empresa.dados;

public class Funcionario {
	private String nome;
	public double salario;
	
	public Funcionario(String nomeInit, double salarioInit) {
		nome = nomeInit;
		salario = salarioInit;
		//System.out.println("Nome: " + nome);
		//System.out.println("Sal�rio: " + salario);
	}
	public String obterInfo() {
		return "Nome: " + nome + ", Sal�rio: " + salario;
	}
	
	public void aumentarSalario(double aumento) {
		salario += aumento;
	}
	
	public void aumentarSalario(int porcentagem) {
		salario += salario * porcentagem / 100.00;
	}
}