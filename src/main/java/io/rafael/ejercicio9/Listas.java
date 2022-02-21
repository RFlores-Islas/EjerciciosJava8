package io.rafael.ejercicio9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
	
	static List<Integer> listA = new ArrayList<>(Arrays.asList(1, 2 , 4, 6, 8, 0, 3, 44, 52, 43, 129));
	static List<Integer> listB = new ArrayList<>(Arrays.asList(23, 4, 6, 2, 34, 7, 99, 52, 5, 8));
	
	
	public static void main(String []args) {
		
		List<Integer> newList = listA.stream().filter(listaA -> listB.contains(listaA)).collect(Collectors.toList());
		System.out.println(newList);
	}//FIN CLASE

}//FIN CLASE
