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
		
	}

}
