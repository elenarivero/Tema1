package ejerciciosparte2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Constante donde almacenamos el precio por kilo de las manzanas
		final float PRECIO_MANZANA = 2.35f;
		// Constante donde almacenamos el precio por kilo de las peras
		final float PRECIO_PERA = 1.95f;
		
		// Variable donde almaceno el kilo de manzanas a vender
		float kiloManzanas;
		
		// Variable donde almaceno el kilo de peras a vender
		float kiloPeras;
		
		// Variable donde guardamos el total del precio
		float total;
		
		// Creamos el Scanner para leer de teclado
		Scanner sc = new Scanner(System.in);
	
		// Le pedimos al usuario que introduzca los kilos de manzanas
		System.out.println("Introduzca los kilos de manzanas:");
		
		// Leemos los kilos de manzanas
		kiloManzanas = sc.nextFloat();
		
		// Le pedimos al usuario que introduzca los kilos de manzanas
		System.out.println("Introduzca los kilos de peras:");
				
		// Leemos los kilos de manzanas
		kiloPeras = sc.nextFloat();
		
		// Calculamos el total
		total = kiloManzanas*PRECIO_MANZANA + kiloPeras*PRECIO_PERA;
		
		// Mostramos por pantalla el total
		System.out.println("El precio total es: " + total);
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
