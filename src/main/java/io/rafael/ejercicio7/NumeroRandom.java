package io.rafael.ejercicio7;

import java.util.Scanner;

public class NumeroRandom {
	
	public static void main(String []args) {
		@SuppressWarnings("resource")
		Scanner entrada = new Scanner(System.in);
		int numeroRandom = (int) (Math.random() * 100);
		int contador = 0;
		int numeroUsuario;
		System.out.println(numeroRandom);
		
		do {
			System.out.println("Introduce un numero");
			numeroUsuario = entrada.nextInt();
			
			if (numeroUsuario < numeroRandom) {
				contador++;
				System.out.println("El numero ingresado es menor que el numero generado");
			} else if (numeroUsuario > numeroRandom) {
				contador++;
				System.out.println("El numero ingresado es mayor que el numero generado");
			}//FIN ELSE/IF
			
		} while (contador <5);
		
		System.out.println("Termino el juego");
		
	}//FIN METODO

}//FIN CLASE
