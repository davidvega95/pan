package Tema10;

import java.util.Scanner;
import java.util.*;
public class EjemploDistinto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		//ejecutamos con log.txt | java EjemploStringBuilder
		//leemos los datos con Scanner
		//creamos un StringBuilder y añadimos
		//IP usando una expresion regular
		//creamos el scanner
		Set<String> conjuntoIPDiferentes=new HashSet<String>();
		Scanner in=new Scanner (System.in);
		//Creamos el StringBuilder vacio
		StringBuilder sBuilder=new StringBuilder();
		//Creamos el patron IP
		final String regexIP=("(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d\\d|\\d)\\."
				+ "(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d\\d|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|"
				+ "\\d\\d|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d\\d|\\d)");
		//oleemos palabra a palabra
		//variable para almacenar in.next()
		String palabra="";
		int contador=0;
		while(in.hasNext()){
			palabra=in.next();
			if(in.next().matches(regexIP)){
			  conjuntoIPDiferentes.add(palabra);
			  //añadimos un separador
			
			 
		}
		
		}//cerramo el scanner
		in.close();
		//quitamos el ultimo caracter
		//sBuilder.delete(sBuilder.length()-1,sBuilder.length())
		//otra forma seria darle 
		System.out.println(conjuntoIPDiferentes);
		
		System.out.println("NUmeros de accesos:"+conjuntoIPDiferentes.size());

	}

}
