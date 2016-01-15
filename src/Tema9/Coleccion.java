package Tema9;

import java.util.Arrays;



public class Coleccion {
	//atributos (array bidimensional)
	private double[][]vector;
	//constructor

	public Coleccion(int filas,int columnas) {
		this.vector=new double[filas][columnas];
	}
	//constructor por defecto 
	

	 //rellenamos el array de forma aleatoria
	public   void RellenarColeccion(int valor){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				vector[i][j]=Math.random()*valor;
				
			}
  
		
			
		}
			
			
		
	}
	public Coleccion(double[][] vector) {
		super();
		this.vector = vector;
	}
	//metodo que convierte el array bidimensional en un array unidimensional
	//usamos la clase array para ordenar el array unidimensional
	//hacemos calculos estadisticos
	
	public void calcularValoresEstadisticos(){
		int tamano=vector.length*vector[0].length;
		double[] vectorUnidimensional=new double[tamano];
		 int cont=0;
	    //for each va corriendo cada uno de los elemntos de la coleccion
		for (double[] d : vector) {
	    	for (double e : d) {
				vectorUnidimensional[cont]=e;
				cont++;
			}
			
		}
		Arrays.sort(vectorUnidimensional);
		for (int i = 0; i < vectorUnidimensional.length; i++) {
			System.out.print(" "+vectorUnidimensional[i]);
			
		}
		System.out.println();
		System.out.printf("Valor mas grande: %.2f y el mas pequeño %.2f%n",
				vectorUnidimensional[vectorUnidimensional.length-1],vectorUnidimensional[0]);
	}
	

	

	//metodo que muestra el array bidimensional
	public void MostrarArray(){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				System.out.printf("%.2f ", +vector[i][j]);
			}
			System.out.println();
		}
		
	}
	//calculamos el maximo valor del array bidimensional
	public double valorMayor(){
		double maximo=vector[0][0];
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				if(vector[i][j]>maximo){
					maximo=vector[i][j];
				}
				
			}
			
		}
		return maximo;
	}
	//calculamos el minimo valor de array bidimensional
	public double valorMenor(){
		double minimo=vector[0][0];
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				if(vector[i][j]<minimo){
					minimo=vector[i][j];
				}
				
			}
			
		}
		return minimo;
	}
	//calculamos el valor medio del array bidimensional
	public double valorMedio(){
		double suma=0;
		double media=0;
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				suma+=vector[i][j];
				
			}
			
			
		}
		return media=suma/(vector.length*vector[0].length);

		
	}
	
	@Override
	public String toString() {
		 
		return "Coleccion [vector=" + Arrays.toString(vector) + ", valorMayor()=" + valorMayor() + ", valorMenor()="
				+ valorMenor() + ", valorMedio()=" + valorMedio() + "]";
	}
	
	
	
	
	
}
