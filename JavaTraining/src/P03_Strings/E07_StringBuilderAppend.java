package P03_Strings;

import java.util.Scanner;

public class E07_StringBuilderAppend {

	public static void main(String[] args) {
		
		try(Scanner scan = new Scanner(System.in)) {
			
			StringBuilder fullName = new StringBuilder(100);
			
			System.out.print("1er Nombre: ");
			fullName.append(scan.nextLine());
			
			System.out.print("2do Nombre: ");
			fullName.append(" " + scan.nextLine());
			
			System.out.print("1er Apellido: ");
			fullName.append(" " + scan.nextLine());
			
			System.out.print("2do Apellido: ");
			fullName.append(" " + scan.nextLine());
			
			System.out.println("Tu nombre es " + fullName.toString());
			
		}
		
	}
	
}
