package Tema10;

import java.util.Scanner;
import java.lang.StringBuilder;

public class EjemploClaseCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//leemos hasta que no quede nada en el fichero
		String input="";
		//leemos hasta que acabe el fichero
		int contadorSaltoLinea;
		while(in.hasNext()){
			input+=in.next();
			//convertir el String a un array de char
			char[] arraychar=input.toCharArray();
			//lo recorremos
			int contadorLetras=0;
			int contadorNumeros=0;
			int contadorSimbolos=0;
			for (char c : arraychar) {
				if(Character.isDigit(c)){
					contadorNumeros++;
				}
				else if(Character.isLetter(c)){
					contadorLetras++;
				}
				else{
					contadorSimbolos++;
					
				}
				
				
			}
				System.out.printf("%s %d %s %d %s %d%n" , " Digitos:"
						,contadorNumeros,"Letras: ",contadorLetras ,"Simbolos",contadorSimbolos);
					
		}

	}

}
