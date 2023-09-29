package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static void main(String[] args) {
		// Variable donde guardar el radio del círculo
		float radio;
		
		// Variable donde guardar la longitud del círculo
		double longitud;
		
		// Variable donde guardar el área del círculo
		double area;
		
		// Scanner para leer del teclado
		Scanner sc = new Scanner(System.in);
		
		// Le pido al usuario que me introduzca un radio
		System.out.println("Introduzca el radio del círculo");
		
		// Leemos el radio de teclado
		radio = sc.nextFloat();
		
		// Calculamos la longitud
		longitud = 2 * Math.PI * radio;
		
		// Calculamos el área
		area = Math.PI * Math.pow(radio, 2);
		
		// Mostramos la longitud y el área
		System.out.println("La longitud es " + longitud + " y el área es " + area);
		
		// Cerramos el Scanner
		sc.close();
	}

}
