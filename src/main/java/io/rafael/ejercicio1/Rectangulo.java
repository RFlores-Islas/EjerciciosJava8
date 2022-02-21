package io.rafael.ejercicio1;

public class Rectangulo implements Forma{
	
	private Integer lado;
	private Integer ancho;
	
	public Rectangulo() {
		
	}//FIN CONSTRUCTOR
	
	public Rectangulo(Integer lado, Integer ancho) {
		this.lado = lado;
		this.ancho = ancho;
	}//FIN CONSTRUCTOR
	
	public Integer getLado() {
		return lado;
	}//FIN METODO

	public void setLado(Integer lado) {
		this.lado = lado;
	}//FIN METODO

	public Integer getAncho() {
		return ancho;
	}//FIN METODO

	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}//FIN METODO

	public Integer calcularArea() {
		return lado * ancho;
	}//FIN METODO
	
}//FIN CLASE
