package Tema9;
import java.util.*;
public class TestColeccion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coleccion c1=new Coleccion(3,2);
		double [][] vector={{1,2,3},{4,5,6}};
		Coleccion c2=new Coleccion(vector);

		
		c1.RellenarColeccion(5);		
		c1.MostrarArray();
		c1.calcularValoresEstadisticos();
		System.out.println(c1);
		c2.RellenarColeccion(7);
		c2.MostrarArray();
		c2.calcularValoresEstadisticos();
		System.out.println(c2);
		
		
		

		System.out.println(" ");
		
        
        
	}

}
