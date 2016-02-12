package Tema12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestTriangulo {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		List<Triangulo> listaTriangulos=new ArrayList<Triangulo>();	
		Scanner in=new Scanner(System.in);
		System.out.println("Introduzca los lados");
		double a=in.nextDouble();
		double b=in.nextDouble();
		double c=in.nextDouble();
	try {
		Triangulo t=new Triangulo(a,b,c);
		System.out.println(t); 
	} catch (IlegalTrianguloException e) {
		// TODO Auto-generated catch block
		System.out.println("Lados introducido no correctos");
	}

	}

}
