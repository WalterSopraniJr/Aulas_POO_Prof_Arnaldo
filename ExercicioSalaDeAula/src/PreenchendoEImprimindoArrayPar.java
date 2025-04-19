
public class PreenchendoEImprimindoArrayPar {
	
	public static void main(String[] args) {
		int tamanho = 6;
		int[] inteiros = new int[tamanho];
		
		inteiros[0] = 0;
		inteiros[1] = 2;
		inteiros[2] = 4;
		inteiros[3] = 6;
		inteiros[4] = 8;
		inteiros[5] = 10;
		
		for(int i : inteiros) {
			
			System.out.print(i + " ");
			
		}
	}

}
