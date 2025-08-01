
public class ImprimindoParesDoArray {
	public static void main(String[] args) {
		
		int tamanho = 6;
		
		int[] numeros = new int[tamanho];
		
		for(int i = 0; i < tamanho; i++) {
			numeros[i] = 2 * (i + 1);
		}
		
		System.out.print("Elementos do Array; ");
		for(int i = 0; i < tamanho; i++) {
			System.out.print(numeros[i] + " ");
		}
	}

}
