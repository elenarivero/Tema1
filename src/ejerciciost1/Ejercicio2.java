package ejerciciost1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		int edad;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una edad:");
		edad = sc.nextInt();
		//edad = edad +1; // edad++
				
		System.out.println("Su edad el año que viene será: " + edad++);
		System.out.println(edad);
		
	}

}
