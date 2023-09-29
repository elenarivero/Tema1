package ejerciciosparte1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Declaro las dos notas como enteras
		int nota1, nota2;
		
		// Declaro la media como float porque puede tener decimales
		float media;
		
		Scanner sc = new Scanner(System.in);
		
		// Pido las notas al usuario
		System.out.println("Introduzca dos notas:");
		nota1 = sc.nextInt();
		nota2 = sc.nextInt();
		
		// Calculo la media de dos notas
		media = (float) (nota1 + nota2)/2;
		
		System.out.println("La media es: " + media);

		sc.close();
	}

}
