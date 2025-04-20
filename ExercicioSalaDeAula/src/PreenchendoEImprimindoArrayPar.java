
public class PreenchendoEImprimindoArrayPar {
	
	public static void main(String[] args) {
		int tamanho = 6;
		int[] inteiros = new int[tamanho];
		
		for (int i = 0; i < tamanho; i++) {
			 inteiros[i] = 2 * (i + 1);
		}

		
		for(int i : inteiros) {
			
			System.out.print(i + " ");
			
		}
	}

}
