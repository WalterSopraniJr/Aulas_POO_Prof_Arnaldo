
class ExemploDepreciado{

	@Deprecated
	public void metodoObsoleto() {
		
	}
}



public class AnnotationSuppressWarning {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	
		ExemploDepreciado depreciado = new ExemploDepreciado();
		
		depreciado.metodoObsoleto();
	}
	
}
