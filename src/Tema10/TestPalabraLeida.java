package Tema10;

import java.util.Scanner;

public class TestPalabraLeida {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		
				//creamos el objeto
				PalabraLeida p1=new PalabraLeida();
			
				//creamos la clase Scanner
				Scanner input=new Scanner(System.in);
				System.out.println("Introduzca una palabra");
				String palabra=input.nextLine();
				System.out.println("Introduzca otra palabra para comparar");
				String palabra1=input.nextLine();
				p1.setValor(palabra);
				System.out.println(p1);
              System.out.println(p1.SonIguales(palabra1));
	
	
}
}
