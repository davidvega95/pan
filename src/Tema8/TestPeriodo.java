package Tema8;

import java.util.Scanner;

public class TestPeriodo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pendulo p1=new Pendulo(10.0);
		System.out.println(p1);
		System.out.printf("Pendulo de longitud %.2f y periodo %.2f%n", p1.getLongitud(),p1.CalcularPeriodo());
		//solicitamos la longitud con Scanner
		Scanner in=new Scanner(System.in);
		System.out.println("Dame otro valor de longitud");
		//creamos un objeto con referencia anonima y lo imprimimos
		double longitud=in.nextDouble();
		System.out.println(new Pendulo(longitud));
		//obtenemos los datos desde los argumentos
		String longitudArgumento=args[0];
		System.out.println(new Pendulo(Double.parseDouble(longitudArgumento)));

	}
}
