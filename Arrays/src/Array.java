
public class Array {
	
	public static void main(String[] args) {
		int[] meuArray; //Declaração de array
		
		meuArray = new int[3];
		meuArray[0] = 5;
		meuArray[1] = 8;
		meuArray[2] = 2;
		
		meuArray = new int[] {5, 8, 2};
		
		System.out.println(meuArray[0]);
		System.out.println(meuArray[1]);
		System.out.println(meuArray[2]);
		
		//Alterando elementos do array
		meuArray[0] = 10;
		
		System.out.println("Valor alterado: " + meuArray[0]);
		
		// percorrendo Array
		for (int i = 0; i < meuArray.length; i++) {
			
			System.out.println(meuArray[i]);
		}
	
	}

}
