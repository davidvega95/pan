package Tema10;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String[]PREPOSICION={"a", "ante", "bajo", "cabe", "con", "contra","de", "desde", 
				"durante", "en", "entre", "hacia", "hasta", "mediante", "para",
				"por", "según", "sin", "so", "sobre", "tras", "versus","a","a", "vía"};
		//convertimos en lista
		List <String> listaPreposiciones=Arrays.asList(PREPOSICION);
		System.out.println(listaPreposiciones);
		int numeroPreposiciones=Collections.frequency(listaPreposiciones, "a");
		System.out.println(numeroPreposiciones);
		String frase="hola mundo,espero que funcione";
		String[]palabras=frase.split(" ");
		List <String> listaPalabras=Arrays.asList(palabras);
        int numeroPalabras=Collections.frequency(listaPalabras, "que");
        System.out.println(listaPalabras);
        System.out.println(numeroPalabras);
	}

}
