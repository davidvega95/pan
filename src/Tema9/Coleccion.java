package Tema9;

import java.util.Arrays;

import org.omg.Messaging.SyncScopeHelper;

public class Coleccion {
	//atributos (array bidimensional)
	private double[][]vector;
	//constructor

	public Coleccion(int filas,int columnas) {
		this.vector=new double[filas][columnas];
	}
	 //rellenamos el array de forma aleatoria
	public   void RellenarColeccion(int valor){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				vector[i][j]=Math.random()*valor;
				
			}
  
		
			
		}
			
			
		
	}
	//metodo que muestra el array bidimensional
	public void MostrarArray(){
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
				System.out.printf("%.2f ", +vector[i][j]);
			}
			System.out.println();
		}
		
	}
	//calculamos el maximo valor del array bidimensional
	public double valorMayor(){
		double maximo=vector[0][0];
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector.length; j++) {
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
			for (int j = 0; j < vector.length; j++) {
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
			for (int j = 0; j < vector.length; j++) {
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
