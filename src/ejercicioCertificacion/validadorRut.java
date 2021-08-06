package ejercicioCertificacion;

import java.util.Scanner;

public class validadorRut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ingresoRut, digitoCorrecto;
		int digitoVerificador;
		
		Scanner rut=new Scanner(System.in);
		System.out.println("Introduzca Rut sin codigo verificador y puntos");
		ingresoRut = rut.nextLine();
		
		if (ingresoRut.length() == 8 || ingresoRut.length() == 7){

			int rutObtenido = Integer.parseInt(ingresoRut); //rut sin dígito verificador.
	        int contador = 2;
	        int suma = 0;
	        while (rutObtenido != 0) {
	        	//saco los digitos uno por uno por medio del % 10
	            int multiplo = (rutObtenido % 10) * contador;
	            suma = suma + multiplo;
	            rutObtenido = rutObtenido / 10;
	            contador++;
	            if (contador == 8) {
	                contador = 2;
	            }
	        }
	        digitoVerificador = suma / 11;
	        int resto = suma - (11 * digitoVerificador);
	        Integer resultado = 11 - resto;
	        digitoCorrecto = resultado.toString();
	        
	        if (digitoCorrecto.equals("11")){
	        	
	        	digitoCorrecto = "0";
	        }
	        if (digitoCorrecto.equals("10")){
	        	
	        	digitoCorrecto = "K";
	        }
	        
	        if(Integer.parseInt(digitoCorrecto) > 10 && Integer.parseInt(digitoCorrecto) > 11){
	        	
	        	System.out.println("Rut totalmente invalido");
	        }

	        	System.out.println("El codigo verificador del rut: " + ingresoRut + " es: "+digitoCorrecto);	

		}
	}

}
