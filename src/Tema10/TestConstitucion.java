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
		
		
		String palabra="";
		StringBuilder sBuilder=new StringBuilder();
		
		int contador=0;
		String palabraCambiada="";
		while(in.hasNextLine()){
			 palabra=in.nextLine();
			 palabraCambiada=palabra.replaceAll(".*[.;,:]$",palabra.substring(0,palabra.length()-1));
			 if(palabra.toLowerCase().matches("[a-αινσϊ]+")){
			      //System.out.println(palabra);
				 ListaConstitucion.add(palabraCambiada);
			 }
			 int posicionInicial=(int) (Math.random()*(ListaConstitucion.size()-499));
			 for (int i = posicionInicial; i < posicionInicial +500; i++) {
				 sBuilder.append(ListaConstitucion.get(i));
				
			}
			 contador++;
			 
		}
		
		
		System.out.println("Numero de palabras: "+UtilidadesString.numeroPalabras(sBuilder.toString().trim()));
		System.out.println("Numero de articulos determinados: "+UtilidadesString.numeroArticulosDeterminados(sBuilder.toString().trim()));
		System.out.println("Numero de articulos indeterminados: "+UtilidadesString.numeroArticulosIndeterminados(sBuilder.toString().trim()));
		System.out.println("Numero de preposciones : "+UtilidadesString.numeroPreposiciones(sBuilder.toString().trim()));
		int inicio=0;
		int fin=0;
		while(inicio>=fin){
			inicio=(int) (Math.random()*501);
			fin=(int) (Math.random()*501);
		}
		System.out.println("Numero de palabras: "+UtilidadesString.devolverMayusculaCaracteres(inicio, fin, sBuilder.toString().trim()));
		System.out.println("Numero de palabras: "+UtilidadesString.devolverMayusculaCaracteresFraseCompleta(inicio, fin, sBuilder.toString().trim()));
		System.out.println("Numero de palabras:"+UtilidadesString.devolverMayusculaPalabrasFrase(inicio, fin, sBuilder.toString().trim()));
		//Creamos el StringBuilder vacio
		
		
		

	}

}
