package io.rafael.ejercicio8;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String []args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el numero a");
		int numeroA = entrada.nextInt();
		
		System.out.println("Introduce el numero b");
		int numeroB = entrada.nextInt();
		
		System.out.println("Introduce el numero c");
		int numeroC = entrada.nextInt();
		
		if (numeroA > numeroB && numeroA > numeroC) {
			System.out.println("El numero mayor es: " + numeroA);
		} else if (numeroB > numeroA && numeroB > numeroC) {
			System.out.println("El numero mayor es: " + numeroB);
		} else {
			System.out.println("El numero mayor es: " + numeroC);
		}//FIN ELSE
		
	}//FIN METODO
}//FIN CLASE
