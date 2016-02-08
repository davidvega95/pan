package Tema12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo3 {
	public static void main(String[] args) {
		
	
	File inFile=new File("uno.txt");
	Scanner in=null;
	
	try{
		
		 in=new Scanner(inFile);
		int numeroABuscar=0;
		String leido;
		while(in.hasNextInt()){
			leido=in.next();
			if(leido.matches("[\\d]+")){
				numeroABuscar=Integer.parseInt(leido);
			}
		
		}
		System.out.println("El valor doble del numero encontrado es: "+numeroABuscar);
		
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
		System.out.println("El fichero no existe");
	}
	finally {
		if(in !=null){
	    	in.close();
	    	System.out.println("Bloque finally");
		}
	}



}
}

