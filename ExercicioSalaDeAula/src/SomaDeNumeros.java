
public class SomaDeNumeros {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[1000];
		int soma = 0;
		
		for(int i = 0; i < 1000; i++) {
			numeros[i] = i + 1;			
			System.out.print(numeros[i] + " ");
			
			soma += numeros[i];
		}
		
		System.out.println("\nO valor da soma é: " + soma);

	}

}
