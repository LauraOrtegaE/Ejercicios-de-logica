package Ejercicios;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

import utiles.Teclado;

public class Ejercicio10 {

		public static void main(String[] args) throws IOException {

			// Retomando la coleccion de HashMap
			HashMap<String, String> minidicc = new HashMap<String, String>();

			ArrayList<String> diccop = new ArrayList<String>();

			// Aqui almacenamos las palabras aleatorias
			ArrayList<String> palabrasAleatorias = new ArrayList<String>();

			int aciertos = 0;
			int fallos = 0;

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

			//Le asigna una clave a los valores del diccop 
			diccop.addAll(minidicc.keySet());
			Collections.shuffle(diccop); //

			//Se agrega un ciclo for hasta que sea menor a 6. 
			for (int i = 1; i < 6; i++) {
				palabrasAleatorias.add(diccop.remove(0));
			}
			// A cada palabra se le pregunta una por una
			for (String i : palabrasAleatorias) {
				// Con el paquete utililes y clase teclado nos permite la lectura desde el teclado
				String respuesta = "";
				respuesta = Teclado.leerCadena("Como se dice en ingles " + i + ": ");
				if (respuesta.contains(minidicc.get(i))) {
					aciertos++;
				} else {
					fallos++;
				} //Al final contamos los fallos y aciertos
			}
			System.out.println("Tuviste: " + aciertos + "aciertos y fallaste en " + fallos + " palabras."); // Se le muestra al jugador sus resultados 
		}

}
