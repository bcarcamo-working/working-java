package Composite;

import java.util.Arrays;

public class _Program {
	
	/*
	 * 
	 * Composite es un patr�n de dise�o estructural 
	 * que permite componer objetos en una estructura 
	 * en forma de �rbol y trabajar con ella como 
	 * si fuera un objeto �nico. ... 
	 * La gran caracter�stica del Composite es la 
	 * capacidad para ejecutar m�todos de forma 
	 * recursiva por toda la estructura de �rbol 
	 * y recapitular los resultados.
	 * 
	 */

	public static void main(String[] args) {
		
		IToDoList list = new ProjectComposite("Menu", 
				Arrays.asList(new IToDoList[] {
				new ProjectComposite("Menu1", Arrays.asList(new IToDoList[] {
					new ToDoLeaf("SubMenu1.1"),
					new ToDoLeaf("SubMenu1.2"),
					new ToDoLeaf("SubMenu1.3"),
					new ToDoLeaf("SubMenu1.4")
				})),
				new ProjectComposite("Menu2", Arrays.asList(new IToDoList[] {
					new ToDoLeaf("SubMenu2.1"),
					new ToDoLeaf("SubMenu2.2"),
					new ToDoLeaf("SubMenu2.3"),
					new ToDoLeaf("SubMenu2.4")
				})),
				new ProjectComposite("Menu3", Arrays.asList(new IToDoList[] {
					new ToDoLeaf("SubMenu3.1"),
					new ToDoLeaf("SubMenu3.2"),
					new ToDoLeaf("SubMenu3.3"),
					new ToDoLeaf("SubMenu3.4")
				}))
		})); 
		
		System.out.println(list.getHTML());
		
	}
	
}
