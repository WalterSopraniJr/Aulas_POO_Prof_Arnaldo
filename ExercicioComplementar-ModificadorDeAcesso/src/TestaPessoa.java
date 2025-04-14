
public class TestaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa walter = new Pessoa("Walter", 29, "Avenida", 99999999);
		
		System.out.println("Nome: " + walter.nome);
		System.out.println("Idade: " + walter.getIdade());
		System.out.println("End.: " + walter.getEndereco());
		System.out.println("Telefone: " + walter.getTelefone());
		
		System.out.println("\n");
		
		walter.setIdade(30);
		System.out.println("Idade: " + walter.getIdade());
		
		walter.setEndereco("Avenida Benedito");
		System.out.println("End.: " + walter.getEndereco());
		
		walter.setTelefone(90901995);
		System.out.println("Telefone: " + walter.getTelefone());
		
	}

}
