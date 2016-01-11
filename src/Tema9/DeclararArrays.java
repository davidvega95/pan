package Tema9;


public class DeclararArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declarar  primer Array (de enteros)
		//creamos la referencia
    int Enteros[]=new int[3];
    //creamos el array
    Enteros[0]=7;
    Enteros[1]=8;
    Enteros[2]=10;
    for (int i = 0; i < Enteros.length; i++) {
		System.out.printf("%d ",Enteros[i]);
	}
    System.out.println();
    //Declaramos y creamos la referencia
    double[]referenciaDoubles=new double[3];
    //inicializamos los valores
    referenciaDoubles[0]=12.1;
    referenciaDoubles[1]=13.1;
    referenciaDoubles[2]=14.1;
    for (int i = 0; i < referenciaDoubles.length; i++) {
		System.out.printf("%.2f%n", referenciaDoubles[i]);
	}
    //Declaramos, creamos e inicializamos el array
    String[] referenciaCadenas={"hola", " ","mundo"};
    for (int i = 0; i < referenciaCadenas.length; i++) {
		System.out.printf("%s ",referenciaCadenas[i]);
	}
    System.out.println();
    boolean[]referenciaBoolean={true,false,true};
    //recorremos el array de forma clasica
    for (int i = 0; i < referenciaBoolean.length; i++) {
		System.out.printf("%b ", referenciaBoolean[i]);
	}
    System.out.println();
    //recorremos el array de un bucle mejorado
    for (String cadena:(referenciaCadenas)) {
    	System.out.print(cadena);
		
	}
    System.out.println();
    for (boolean b : referenciaBoolean) {
    	System.out.printf("%b ",b);
		
	}
    
    
    
    
    
	}

}
