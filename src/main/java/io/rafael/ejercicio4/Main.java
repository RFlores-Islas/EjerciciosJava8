package io.rafael.ejercicio4;

public class Main {

	public static void main(String []args) {
		int dias = 365;
		int horas = 24;
		StringBuilder nombre = new StringBuilder("Rafael");
		InterfaceFuncional interfaceFuncional = (x, y) -> {
			System.out.println("Hola " + nombre + " has vivido: " + dias + " con " + horas + " horas");
		};
		
		interfaceFuncional.calcularTiempoVivido(dias, horas);
		interfaceFuncional.fraseInvertida(nombre);
	}//FIN METODO
	
}//fin clase
