package empresa.dados;

public class Funcionario {
	private String nome;
	double salario;
	
	public Funcionario(String nomeInit, double salarioInit) {
		nome = nomeInit;
		salario = salarioInit;
		//System.out.println("Nome: " + nome);
		//System.out.println("Salário: " + salario);
	}
	public String obterInfo() {
		return "Nome: " + nome + ", Salário: " + salario;
	}
	
	public void aumentarSalario(double aumento) {
		salario += aumento;
	}
	
	public void alterarQualquerSalario(Funcionario func, double novoSalario) {
		func.salario = novoSalario;
	}
}