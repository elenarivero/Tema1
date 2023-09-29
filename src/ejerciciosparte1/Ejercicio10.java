package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creamos la constante IVA
		final int IVA = 21;
		
		// Declaramos la variable donde guardar el precio
		double precio;
		
		// Variable donde almacenaremos el precio final
		double precioFinal;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos un precio al usuario
		System.out.println("Introduzca un precio");
		
		// Leemos el precio de teclado
		precio = sc.nextDouble();
		
		// Calculamos el precio final
		precioFinal = precio*IVA/100 + precio;
		
		// Mostramos el precio final
		System.out.println("El precio final es " + precioFinal);
		
		// Cerramos el Scanner
		sc.close();
		
	}

}
