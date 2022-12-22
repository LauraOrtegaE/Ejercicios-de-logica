package utiles;

import java.util.Scanner;

//Nos permite leer desde el teclado 
public class Teclado {

static Scanner entrada = new Scanner(System.in);

	
	public static String leerCadena(String mensaje) {
		System.out.println(mensaje);
		return leerCadena();
	}

	
	public static String leerCadena() {
	  return entrada.nextLine().toLowerCase();

	}

	
	
	
}
