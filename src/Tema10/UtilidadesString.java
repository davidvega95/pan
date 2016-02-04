package Tema10;

public class UtilidadesString {
	//atributos
	public static final String[] ARTICULOS_DETERMINADOS={"EL","LA","LOS","LAS"};
	public static final String [] ARTICULOS_INDETERMINADOS={"UN","UNA","UNOS","UNAS"};
	public static final String [] PREPOSICIONES={"a", "ante", "bajo", "cabe", "con", "contra","de", "desde", 
			"durante", "en", "entre", "hacia", "hasta", "mediante", "para",
			"por", "según", "sin", "so", "sobre", "tras", "versus", "vía"};
	public static int numeroPalabras(String frase){
		String[] palabras=frase.split(" ");
		return palabras.length;
	}
	}
	
	


