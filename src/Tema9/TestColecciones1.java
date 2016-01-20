package Tema9;

import java.util.Arrays;

public class TestColecciones1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Colecciones1 c1=new Colecciones1();
		System.out.println(c1);
		//efecto lateral con el getter 
		//int[]array=c1.getColeccion();
		
		
		c1.setColeccion(0, 3);
		for (int i = 0; i < c1.calcularLongitudArray()-1; i++) {
			int valor=c1.valorDePosicion(i-1);//conocer el valor de la posicion anterior
			c1.setColeccion(i, valor*2);//doblamos el valor de la anterior
			
		}
		System.out.println(c1);
		
		c1.getColeccion()[11]=1;
		c1.getColeccion()[0]=3;
		for (int i = 1; i < c1.calcularLongitudArray()-1; i++) {
			c1.getColeccion()[i]=(c1.getColeccion()[i-1])*2;
		
			
		}
		for (int i = 0; i < c1.getColeccion().length; i++) {
			System.out.println(c1.getColeccion()[i]);
		}
		int suma=0;
		for (int i = 0; i < c1.getColeccion().length; i++) {
			suma+=c1.getColeccion()[i];
		}
		System.out.println("La suma es: "+suma);
		int minimo=c1.getColeccion()[0];
		for (int i = 0; i < c1.getColeccion().length; i++) {
			if(c1.getColeccion()[i]<minimo){
				minimo=c1.getColeccion()[i];
			}
			
		}System.out.println("el minimo valor del array es: "+minimo);
			
		for (int i = 0; i < c1.getColeccion().length; i++) {
			System.out.println(c1.getColeccion());
			
		}
		int cont=0;
		int longitud=c1.getColeccion().length;;
		for (cont=0;cont<5;cont++) {
			c1.getColeccion()[longitud -1-cont]=(c1.getColeccion()[longitud-1-cont])/3;
			
		}
		int contador=0;
		//hecho por manolo
		for (int i = c1.calcularLongitudArray()-1; i < args.length; i--) {
			c1.setColeccion(i, c1.valorDePosicion(i)/3);
			contador++;
			if(contador==5){
				break;
			}
			
		}
		c1.ordenarArray();
		System.out.println("el elemento mas pequeño: "+c1.valorDePosicion(contador));
		contador=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.printf("%5d",c1.valorDePosicion(contador++));
				
			}
			
		}
		
		
		for (int i = 0; i < c1.getColeccion().length; i++) {
			if(c1.getColeccion()[i]<minimo){
				minimo=c1.getColeccion()[i];
			}
			
		}System.out.println("el minimo valor del array es: "+minimo);
			
		for (int i = 0; i < c1.getColeccion().length; i++) {
			System.out.println(c1.getColeccion());
			
		}
		
		

	}

}
