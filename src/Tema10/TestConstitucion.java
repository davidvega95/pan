package Tema10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestConstitucion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Creamos la clase scanner
		Scanner in=new Scanner(System.in);
		//Creamos la lista que vamos a guardar todas las palabras del fichero
		List<String>ListaConstitucion=new ArrayList<String>();
		String palabra;
		StringBuilder sBuilder=new StringBuilder(500);
		int posicion=(int) (Math.random()*(ListaConstitucion.size()-1));
		while(in.hasNextLine()){
			 palabra=in.nextLine();
			 ListaConstitucion.add(palabra);
			 
		}
		for (int i = 0; i < ListaConstitucion.size(); i++) {
			sBuilder.append(ListaConstitucion.get(posicion));
		}
		
		
		System.out.println(ListaConstitucion);
		//Creamos el StringBuilder vacio
		
		
		

	}

}
