package basic;

import java.util.Scanner;

public class GuessNumberGame {

	public static void main(String[] args) {
		double rand = Math.random();
		
		Scanner console =  new Scanner(System.in);
		System.out.println("Casino Netec... Gane Plata de mentira");
		
		int min, max, intentos;
		
		do {
			System.out.print("Ingrese el n�mero m�nimo para apostar: ");
			String minStr = console.nextLine();
			if(!validNumber(minStr)) { continue; }
			min = Integer.valueOf(minStr);
			break;
		} while(true);
		
		do {
			System.out.print("Ingrese el n�mero m�ximo para apostar: ");
			String maxStr = console.nextLine();
			if(!validNumber(maxStr)) { continue; }
			max = Integer.valueOf(maxStr) + 1;
			if(max <= min) { 
				System.out.println("Ingrese el n�mero mayor que " + min);
				continue; 
			}
			break;
		} while(true);
		
		do {
			System.out.print("Ingrese el n�mero de intentos: ");
			String intStr = console.nextLine();
			if(!validNumber(intStr)) { continue; }
			intentos = Integer.valueOf(intStr);
			break;
		} while(true);
		
		int systemNum = (int) (min + rand * (max - min));
		
		int i = 1;
		do {
			System.out.print("Ingresa un n�mero entre " + 
	                   min + " y " + (max - 1) + ": ");
			String userStr = console.nextLine();
			if(!validNumber(userStr)) {	continue; }
			int userNum = Integer.valueOf(userStr);
			
			if(systemNum == userNum) { break; }
			String mensaje = "Elija un n�mero " + 
		                     (systemNum > userNum ? "mayor" : "menor");
			System.out.println(mensaje);
			i++;
		} while(i<=intentos);
		
		console.close();
		if(i<intentos) {
			System.out.println("N�mero Encontrado en " + i + " intentos.");
		} else {
			System.out.println("Perdiste... Se acabaron tus intentos.. el n�mero es " + systemNum );
		}
		
	}
	
	private static boolean validNumber(String str) {
		if(!str.matches("^[0-9]+$")) {
			System.out.println("Favor colocal un n�mero valido.");
			return false;
		}
		return true;
	}

}
