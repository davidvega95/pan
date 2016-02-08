package Tema12;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Excepciones originadas con Scanner
		Scanner sc=new Scanner(System.in);
		System.out.println("Leer un entero");
		int entero=0;
		String enteroCadena=sc.next();
		if(enteroCadena.matches("[\\d]+")){
			 entero=Integer.parseInt(enteroCadena);
		}
		
		double decimal=0;
		String doubleCadena=sc.next();
		if(doubleCadena.matches("[\\d]+(\\.[\\d]+)12?")){
	         decimal=Double.parseDouble(doubleCadena);
		}
		sc.close();
		System.out.println("Entero: "+entero);
		System.out.println("Decimal: "+decimal);

	}

}
