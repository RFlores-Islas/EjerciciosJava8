package io.rafael.ejercicio5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListFilter {
	
	static List<Integer> listNumeros = new ArrayList<>(Arrays.asList(1, 8, 5, 2, 33, 54, 22, 6, 88, 13));
	
	public static void main(String []args) {
		listNumeros.stream().filter(filtro ->filtro %2 == 0).forEach(action -> {
			System.out.println(action);
		});
	}//FIN METODO
	
	
	
}//FIN CLASE
