
interface ExemploInterfaceEspecial{
	
	//Método Abstrato
	void metodoAbstrato();
	
	//Método Default
	default void metodoDefault() {
		System.out.println("Este é um método default na interface.");
	}
	
	//Método Static
	static void metodoStatic() {
		System.out.println("Este é um método Static na interface");
	}
}

 class InterfacesEspeciais implements ExemploInterfaceEspecial{

	public void metodoAbstrato() {
		System.out.println("Implementação do método abstrato.");
	}
	
	public static void main(String[] args) {
		InterfacesEspeciais teste = new InterfacesEspeciais();
		
		teste.metodoAbstrato();
		teste.metodoDefault();
		ExemploInterfaceEspecial.metodoStatic();
	}
	
}
