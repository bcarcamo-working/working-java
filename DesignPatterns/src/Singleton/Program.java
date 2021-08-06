package Singleton;

public class Program {
	
	/*
	 * Sin embargo una clase que siga el patr�n Singleton 
	 * tiene la peculiaridad de que solo puede instanciar 
	 * un �nico objeto .Este tipo de clases son habituales 
	 * en temas como configurar par�metros generales de la 
	 * aplicaci�n ya que una vez instanciado el objeto
	 * los valores se mantienen y son compartidos  por 
	 * toda la aplicaci�n
	 */

	public static void main(String[] args) {
		
		System.out.println("Creating a new Counter1");
		Counter counter1 = Counter.getInstance();
		
		System.out.println("Count: " + counter1.getValue());
		
		System.out.println("Counting with Counter1");
		counter1.count();
		
		System.out.println("Count: " + counter1.getValue());
		
		System.out.println("Creating a new Counter2");
		Counter counter2 = Counter.getInstance();
		
		System.out.println("Count: " + counter2.getValue());
		
		System.out.println("Counting with Counter2");
		counter2.count();
		
		System.out.println("Count: " + counter1.getValue());
		
		System.out.println("Counting without variable");
		Counter.getInstance().count();
		
		System.out.println("Count: " + Counter.getInstance().getValue());
		
	}

}
