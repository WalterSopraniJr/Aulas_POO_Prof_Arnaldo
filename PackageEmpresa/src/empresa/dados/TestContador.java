package empresa.dados;

//Classe adicional para explicar sobre MEMBROS EST�TICOS

public class TestContador {

		
		public static void main(String[] args) {
			Contador c1 = new Contador();
			
			Contador c2 = new Contador();
			
			Contador c3 = new Contador();
			
			System.out.println("Numero de objetos criados: " + Contador.contagem);
		}
	}
