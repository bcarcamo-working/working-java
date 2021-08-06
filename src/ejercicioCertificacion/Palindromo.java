package ejercicioCertificacion;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num;
		int numero, cifra1, cifra2, cifra3, cifra4, cifra5;
		Scanner cap=new Scanner(System.in);
		System.out.println("Introduzca un numero");
		num = cap.nextLine();
		
		numero = Integer.parseInt(num);
/*
		while (!(numero>=100000000&&numero<=maxIndex)){
		    System.out.println("El numero debe ser de 9 digitos, vuelva y digite");
		    num = cap.nextLine();
		    numero = Integer.parseInt(num);
		    }
		// Descompone el numero cifra a cifra
		 * 		    for (int i = num.length() - 1; i >= 0; i--) { 
		    	num = num + num.charAt(i); 
	        }
		    
		 */ 
	
			cifra1= numero/10000;
		    cifra2= (numero%10000)/1000;
		    cifra3= (numero%1000)/100;
		    cifra4= (numero%100)/10;
		    cifra5= (numero%10);

		//Revisa que se cumpla la condicion para que sea palindromo    
	        if(cifra1==cifra5 && cifra2==cifra4){ 
		            System.out.println("El numero es palindromo");      
		        }else
		            System.out.println("El numero No es palindromo");  
		    }
	
		//String palimentro
	
	
	}



