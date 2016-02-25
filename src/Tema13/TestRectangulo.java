package Tema13;

import java.util.Scanner;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner (System.in);
		System.out.println("Introduzca el ancho y la altura del rectangulo");
		double ancho=in.nextDouble();
		double altura=in.nextDouble();
		System.out.println("Introduzca otro ancho y altura");
		double ancho1=in.nextDouble();
		double altura1=in.nextDouble();
		//constructor por defecto
		Rectangulo r1=new Rectangulo();
		Rectangulo r2=new Rectangulo(ancho,altura);
		Rectangulo r3=new Rectangulo(ancho1,altura1);
		System.out.println("EL area del rectangulo por defecto de ancho"+r1.getAncho()+" y de altura "+r1.getAlto()+" es: "+r1.AreaRectangulo());
		System.out.println("EL perimetro del rectangulo por defecto de ancho"+r1.getAncho()+" y de altura "+r1.getAlto()+" es: "+r1.PerimetroRectangulo());
		System.out.println("EL area del rectangulo 1 de ancho"+ancho+" y de altura "+altura+" es: "+r2.AreaRectangulo());
		System.out.println("EL perimetro del rectangulo 1 de ancho"+ancho+" y de altura "+altura+" es: "+r2.PerimetroRectangulo());
		System.out.println("EL area del rectangulo 2 de ancho"+ancho1+" y de altura "+altura1+" es: "+r3.AreaRectangulo());
		System.out.println("EL perimetro del rectangulo 2 de ancho"+ancho1+" y de altura "+altura1+" es: "+r3.PerimetroRectangulo());
		
		
		System.out.println("Numero de rectangulos:"+Rectangulo.numRectangulos());
        
	}

}
