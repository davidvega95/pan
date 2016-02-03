package Tema10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		//leemos hasta que acabe el fichero
		//lista que contiene todos los nombres
		List <String>ListaContieneNombres=new ArrayList<String>();
		
		
		String nombreMujer=" ";
		int contador=0;
		//crea la lista vacia
		
		List <String>EmpiezaPorA=new ArrayList <String>();
		List <String>NoTerminanPorVocal=new ArrayList<String>();
		//lista con los nombres mas grandesç
		List <String>NombresMasGrandes=new ArrayList<String>();
		//lista con los nombres mas pequeños
				List <String>NombresMasPequenos=new ArrayList<String>();
		int nombreMujerGrande=0;
		int nombreMujerPequeno=Integer.MAX_VALUE;
		while(in.hasNextLine()){
			nombreMujer=in.nextLine();
			ListaContieneNombres.add(nombreMujer);
			if(nombreMujer.length()>nombreMujerGrande){
				nombreMujerGrande=nombreMujer.length();
				
			}
			if(nombreMujer.length()<nombreMujerPequeno )
				nombreMujerPequeno=nombreMujer.length();
		
		}
		   //recorro la lista
		if(args.length>0){
			//codigo de busqueda
			if(ListaContieneNombres.contains(args[0])){
				System.out.println("Existe el nombre: "+args[0]);
			}
			
				
			
			
		else{
			String dosPrimerasLetras=args[0].substring(0, 2);
			for (String nombre:ListaContieneNombres) {
				if(nombre.toLowerCase().startsWith("a")){
				EmpiezaPorA.add(nombre);
			}
				if(nombre.length()==nombreMujerGrande){
					NombresMasGrandes.add(nombre);
				}
				if(nombre.length()==nombreMujerPequeno){
					NombresMasPequenos.add(nombre);
				}
			
			//^ Significa negacion
			if(nombre.toLowerCase().matches(".*[^[aeiou]$")){
				NoTerminanPorVocal.add(nombre);
			}
			}
		}
				
			}}
	//	System.out.println("Numero de nombres de mujer leidos: "+nombreMujer);
	  //  System.out.println(EmpiezaPorA);
	    //System.out.println(NoTerminanPorVocal);
		
	
	/*	if(palabra.matches("[a].*")){
			EmpiezaPorA1.add(palabra);
			
		}
		if(!palabra.matches("*.[a,e,i,o,u]")){
			NoTerminanPorVocal.add(palabra);
		}
		System.out.println("Numero de palabras"+contador);
		System.out.println(EmpiezaPorA1);
		System.out.println(NoTerminanPorVocal);
		*/

	}


