package io.rafael.ejercicio4;

@FunctionalInterface
public interface InterfaceFuncional {
	
	void calcularTiempoVivido(int dias, int horas);
	
	default void fraseInvertida(StringBuilder frase) {
		System.out.println(frase.reverse());
	}//FIN METODO

}//FIN INTERFACE
