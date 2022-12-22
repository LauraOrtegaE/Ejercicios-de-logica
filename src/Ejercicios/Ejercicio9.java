package Ejercicios;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
	// Creamos un objeto HashMap llamado minidicc que almacenará los valores	
	HashMap<String, String> minidicc = new HashMap <String, String> ();
		
	//Usamos el metodo put para agregar elementos
		minidicc.put("Gris claro", "Light gray");
		minidicc.put("Azul Marino", "Navy");
		minidicc.put("Azul", "Blue");
		minidicc.put("Verde", "Green");
		minidicc.put("Rojo", "Red");
		minidicc.put("Amarillo", "Yellow");
		minidicc.put("Negro", "Black");
		minidicc.put("Cafe", "Bown");
		minidicc.put("Rosa", "Pink");
		minidicc.put("Morado", "Purple");
		minidicc.put("Blanco", "White");
		minidicc.put("Gris", "Gray");
		minidicc.put("Lavanda", "Lavender");
		minidicc.put("Naranja", "Orange");
		minidicc.put("Cian", "Cyan");
		minidicc.put("Carmesi", "Crimson");
		minidicc.put("Oro", "Gold");
		minidicc.put("Magenta", "Magenta");
		minidicc.put("Rosa brumoso", "Misty Rose");
		minidicc.put("Plateado", "Silver");
		

		Scanner entrada = new Scanner(System.in);
		
		String color= entrada.nextLine();
		
			try {
				String valor = minidicc.get(color).toString(); // Si queremos consultar un valor usamos el metodo get 
				
				System.out.println("En ingles es: " +  minidicc.get(color).toString()); // Si existe mostramos 
				
			} catch (NullPointerException c) {
				
				System.out.println("Lo sentimos, esa palabra no esta en el minidiccionario"); // Si no lo tenemos mostramos 
			}
		
	}

}


