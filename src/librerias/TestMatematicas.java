package librerias;

import java.util.Scanner;

public class TestMatematicas {

	public static void main(String[] args) {
		int numero;
		Scanner in=new Scanner (System.in);
		System.out.println("Introduzca un numero");
		numero=in.nextInt();
		// TODO Auto-generated method stub
		System.out.printf("%.2f%n", Matematicas.calcularRaizCuadrada(numero));
	}

}
