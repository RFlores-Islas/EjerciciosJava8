package io.rafael.ejercicio3;

public class TrianguloFloy {
	
	public static void main(String []args) {
		int contador = 1;
		
		for (int i = 1; i<=4; i ++) {
			System.out.println("");
			for (int j = 1; j<=i; j++) {
				System.out.print(contador + " ");
				contador++;
			}
		}
	}//FIN METODO

}//FIN CLASE
