package io.rafael.ejercicio2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaString {
	
	private static List<String> listNombres = new ArrayList<String>(Arrays.asList("juan", "pedro", "jose", "maria", "sofia"));
	
	public static void main(String []args) {
		
		listNombres.stream().forEach(action -> {
			System.out.println(action.toUpperCase().charAt(0) + action.substring(1));
		});
		
	}//FIN METODO
}//FIN CLASE
