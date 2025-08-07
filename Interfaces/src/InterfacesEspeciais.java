
interface ExemploInterfaceEspecial{
	
	//M�todo Abstrato
	void metodoAbstrato();
	
	//M�todo Default
	default void metodoDefault() {
		System.out.println("Este � um m�todo default na interface.");
	}
	
	//M�todo Static
	static void metodoStatic() {
		System.out.println("Este � um m�todo Static na interface");
	}
}

 class InterfacesEspeciais implements ExemploInterfaceEspecial{

	public void metodoAbstrato() {
		System.out.println("Implementa��o do m�todo abstrato.");
	}
	
	public static void main(String[] args) {
		InterfacesEspeciais teste = new InterfacesEspeciais();
		
		teste.metodoAbstrato();
		teste.metodoDefault();
		ExemploInterfaceEspecial.metodoStatic();
	}
	
}
