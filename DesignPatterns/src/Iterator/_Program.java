package Iterator;

public class _Program {

	/*
	 * En diseño de software, el patrón de diseño Iterador, 
	 * define una interfaz que declara los métodos necesarios 
	 * para acceder secuencialmente a un grupo de objetos 
	 * de una colección
	 */
	public static void main(String[] args) {
		
		GradeGenerator gGen = new GradeGenerator(0, 10);
		gGen.setIterator(IteratorType.SECUENTIAL);
		
		for(double value : gGen) {
			System.out.println(value);
		}
		
		RadianGenerator rGen = new RadianGenerator(0, Math.PI / 9);
		rGen.setIterator(IteratorType.SECUENTIAL);
		
		for(double value : rGen) {
			System.out.println(value);
		}
		
	}

}
