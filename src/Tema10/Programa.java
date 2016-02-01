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
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca nombres");
		}
		
		String palabra=in.nextLine();
		int contador=0;
		List <String>EmpiezaPorA=new ArrayList <String>();
		List
		List <String>NoTerminanPorVocal=new ArrayList<String>();
	/*	while(in.hasNext()){
			palabra=in.nextLine();
			contador++;
			if(in.nextLine().matches("[a].*")){
				EmpiezaPorA.add(palabra);
			}
			if(!in.nextLine().matches(".*[a-u]")){
				NoTerminanPorVocal.add(palabra);
			}
		}*/
		if(palabra.matches("[a].*")){
			EmpiezaPorA.add(palabra);
			
		}
		System.out.println("Numero de palabras"+contador);
		System.out.println(EmpiezaPorA);
		System.out.println(NoTerminanPorVocal);
		

	}

}
