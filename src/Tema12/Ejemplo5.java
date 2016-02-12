package Tema12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo5 {
	//devuelve la primera palabra de una longitud dada
	//de un fichero
	
	public static String buscarPalabra(File inFile,int longitud) throws FileNotFoundException{
		String palabra="";
		//logica
		Scanner in=new Scanner(inFile);
		String auxiliar="";
		while(in.hasNext()){
			auxiliar=in.nextLine();
			if(auxiliar.length()==longitud){
				palabra=auxiliar;
				break;
			}
		}
			
		return palabra;
		
	}

}
