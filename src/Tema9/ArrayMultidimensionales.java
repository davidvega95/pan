package Tema9;

import java.lang.reflect.Array;

public class ArrayMultidimensionales {
 static int [][] arrayBidimensionalEnteros;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int NUMERO_FILAS=4;
	    final int NUMERO_COLUMNAS=4;
		 arrayBidimensionalEnteros=new int [NUMERO_FILAS][NUMERO_COLUMNAS];
		System.out.printf("Nº filas: %d, nº columnas %d",arrayBidimensionalEnteros.length,
		arrayBidimensionalEnteros[0].length,
		arrayBidimensionalEnteros.length*arrayBidimensionalEnteros[0].length);
		rellenarArray(2,-2);
		System.out.println();
		mostrarArray();

	}
	 public static void rellenarArray(int numeroInicial,int numeroMultiplicador){
		 int numeroAlmacenar=numeroInicial;
		 for (int i = 0; i < arrayBidimensionalEnteros.length; i++) {
			 for (int j = 0; j < arrayBidimensionalEnteros.length; j++) {
				 arrayBidimensionalEnteros[i][j]=numeroAlmacenar;
				 numeroAlmacenar*=numeroMultiplicador;
				
			}
			
		}
	
		 
	 }
	 public static void mostrarArray(){
		 for (int i = 0; i < arrayBidimensionalEnteros.length; i++) {
			for (int j = 0; j < arrayBidimensionalEnteros.length; j++) {
				System.out.printf("%10d ",arrayBidimensionalEnteros[i][j]); 
				
			}
			System.out.println();
		}
	 }
	

}
