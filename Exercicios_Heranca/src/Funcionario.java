
public class Funcionario {
	private String nome;
	private double salario;
	
	public void addAumento(double valor){
		this.salario += valor;
	}
	
	public double ganhoAnual() {
		return salario * 12;		
	}
	
	public String setNome(String n) {
		return this.nome = n;
	}
	
	public String getNome() {
		return nome;
	}

	public double setSalario(double sal) {
		return this.salario = sal;
	}
}


class Assistente extends Funcionario {
	private int numeroMatricula;
	
	public double ganhoAnual() {
		return super.ganhoAnual() + 1000;
	}
}






