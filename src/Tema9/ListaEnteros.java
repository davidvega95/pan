package Tema9;

import java.util.*;

public class ListaEnteros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leemos mediante Scanner 10 enteros
		//Definimos el Scanner
		Scanner input=new Scanner(System.in);
		//Definimos la lista
		List<Integer>listaEnteros=new ArrayList<Integer>();
		System.out.println("Introduce valores");
		for (int i = 0; i < 10; i++) {
			listaEnteros.add(input.nextInt());
		
			
		}
		System.out.println(listaEnteros);
		//cerramo el scanneer
		input.close();
		//imprimimos el tamaño  de la lista
		System.out.println("Tamaño: "+listaEnteros.size());
		//primer y ultimo  elemento de la lista
		System.out.println("Primer elemento: "+listaEnteros.get(0));
		System.out.println("Ultimo elemento: "+listaEnteros.get(listaEnteros.size()-1));
		
		//añadir otro elemento
		listaEnteros.add(56);
		//añadir otro elemento a la posicion 0
		listaEnteros.add(0, 100);
		System.out.println(listaEnteros);
		//quitamos elementos
		listaEnteros.remove(0);
		listaEnteros.remove(4);
		System.out.println(listaEnteros);
		

	}

}
