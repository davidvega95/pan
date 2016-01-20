package Tema9;

import java.util.Arrays;

public class Colecciones1 {
	//atributos
	double d[ ] = new double[30];
	//char[ ] r = new char(1..30);
	//int i[ ] = (3, 4, 3, 2);esta mal por los parentesis
	int i[]={3,4,3,2};
	//float f[ ] = {2.3, 4.5, 6.6};esta mal por el tipò seria double o en cada valor de la lista poner un f 
	float f[]={2.3f,4.5f,6.6f};
	//char[ ] c = new char();esta mal falta los corchetes no son parentesis y debe indicar el tamaño
	char[]c=new char[19];
	//Ejercicio2
	//atributos
	private int coleccion[];
	//constructor
	public Colecciones1() {
		this.coleccion=new int[12];
		
		
	}
	public int[] getColeccion() {
		return coleccion;
	}
	public void setColeccion(int posicion,int valor) {
		
		this.coleccion[posicion] = valor;
		
	}
	@Override
	public String toString() {
		return "Colecciones1 [coleccion=" + Arrays.toString(coleccion) + "]";
	}
	public int calcularLongitudArray(){
		return this.coleccion.length;
	}
	public int valorDePosicion(int posicion){
		int pos=0;
		if(posicion<=this.coleccion.length){
			 return this.coleccion[posicion];
		}
		return -1;
		
	}
	public void ordenarArray(){
		Arrays.sort(coleccion);
	}
	
	
	
	

}
