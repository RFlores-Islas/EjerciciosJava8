package io.rafael.ejercicio6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListasFilter {
	
	static List<String> listPaises = new ArrayList<>(Arrays.asList("Rusia", "Estados Unidos", "Brasil", "Canada", "Mexico"));
	
	public static void main(String []args) {
		
		listPaises.stream().filter(filtro -> 
		filtro.charAt(filtro.length() - 1) == 'a'
		|| filtro.charAt(filtro.length() - 1) == 'e'
		|| filtro.charAt(filtro.length() - 1) == 'i'
		|| filtro.charAt(filtro.length() - 1) == 'o'
		|| filtro.charAt(filtro.length() - 1) == 'u').forEach(action -> {
			System.out.println(action);
		});//FIN FUNCION
	}//FIN METODO

}//FIN CLASE
