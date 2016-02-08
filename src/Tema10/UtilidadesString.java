package Tema10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UtilidadesString {
	//atributos
	public static final String[] ARTICULOS_DETERMINADOS={"EL","LA","LOS","LAS"};
	public static final String [] ARTICULOS_INDETERMINADOS={"UN","UNA","UNOS","UNAS"};
	public static final String [] PREPOSICIONES={"a", "ante", "bajo", "cabe", "con", "contra","de", "desde", 
			"durante", "en", "entre", "hacia", "hasta", "mediante", "para",
			"por", "seg�n", "sin", "so", "sobre", "tras", "versus", "v�a"};
	public static int numeroPalabras(String frase){
		String[] palabras=frase.split(" ");
		return palabras.length;
	}
	public static int numeroArticulosDeterminados(String frase){
		//convertimos la frase en un array String
		String[] palabras=frase.split(" ");
		int contador=0;
		//recorremos el array para ir comparando con los articulos
		for (String palabra : palabras) {
			for (String articulos : ARTICULOS_DETERMINADOS) {
				if(articulos.equalsIgnoreCase(palabra)){
					contador++;
					break;
				}
				
			}
			
		}
		return contador;
		
	}
	public static int numeroArticulosIndeterminados(String frase){
		//convertimos la frase en un array String
		String[] palabras=frase.split(" ");
		int contador=0;
		//recorremos el array para ir comparando con los articulos
		for (String palabra : palabras) {
			for (String articulos : ARTICULOS_INDETERMINADOS) {
				if(articulos.equalsIgnoreCase(palabra)){
					contador++;
					break;
				}
				
			}
			
		}
		return contador;
		
	}
	public static int numeroPreposiciones(String frase){
		//convertimos la frase en un array String
		String []palabras=frase.split(" ");
		List<String>listaPalabras=Arrays.asList(palabras);
		int contador=0;
		for (String preposiciones : PREPOSICIONES) {
			contador+=Collections.frequency(listaPalabras, preposiciones);
			
		}
		return contador;
	}
	public static String devolverMayusculaCaracteres(int inicio,int fin,String frase){
		return frase.substring(inicio,fin).toUpperCase();
	}
	public static String devolverMayusculaCaracteresFraseCompleta(int inicio,int fin,String frase){
		return frase.substring(0,inicio)+frase.substring(inicio,fin)+frase.substring(fin,frase.length());
	}
	public static String devolverMayusculaPalabrasFrase(int inicio,int fin,String frase){
		String[]palabras=frase.split(" ");
		String substring=" ";
		for (int i = inicio; i < frase.length(); i++) {
			if(i>=inicio && i<fin){
			    substring+=palabras[i].toUpperCase()+" ";
			 }
			else {
				substring+=palabras[i]+" ";
			}
			
		}
		return substring.trim();
	}
	}
	
	


