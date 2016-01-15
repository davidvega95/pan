package Tema9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EjemploLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creamos un arraylist de tipo String
		List<String>listaCadenas=new ArrayList<String>();
        //añadimos mediante Scanner las cadenas
		Scanner input=new Scanner (System.in);
		System.out.println("Introduce cadenas de texto(fin para acabar)");
		String cadena=input.next();
		while (!cadena.toLowerCase().equals("fin")){
			listaCadenas.add(cadena);
			cadena=input.next();
		}
		//cierro Scanner
		input.close();
		System.out.println(listaCadenas);
		System.out.println("¿Contiene a Pedro?"+listaCadenas.contains("Pedro"));
		System.out.println("Numero de palabras"+listaCadenas.size());
		if(listaCadenas.contains("Pedro")){
			System.out.println("Esta en la pòsicion: "+listaCadenas.lastIndexOf("Pedro"));
			if(listaCadenas.size()>0){
			System.out.println("Primera palabra:"+listaCadenas.get(0));
			//recorremos la lista e imprimimos las pàlabras en una unica linea
			//forma 1:clasica
			for (int i = 0; i < listaCadenas.size(); i++) {
				System.out.println(listaCadenas.get(i));
				
			}
			//Forma 2:bucle mejorado
			for(String string:listaCadenas){
				System.out.println(string);
			}
			//Forma3
			listaCadenas.forEach(System.out::println);
			}
		}
		
	}

}
