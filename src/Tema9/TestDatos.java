package Tema9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <Double> temperaturas= new ArrayList<Double>();
		Scanner input=new Scanner(System.in);
		//leemos el numero de datos y posteriormente los datos
		System.out.println("Introduce nº datos a leer");
		int numeroDatos=input.nextInt();
		for (int i = 0; i < numeroDatos; i++) {
			temperaturas.add(input.nextDouble());
			
		}
		input.close();
		Datos datos=new Datos(temperaturas);
		System.out.println(temperaturas);
		System.out.println("Datos estadisticos");
		System.out.printf("Valor medio %.2f, desviacion tipica %.2f y valor por debajo de la media %d ",datos.valorMedio()
				,datos.desviacionTipica(),datos.ValoresdebajoMedia());
       System.out.printf("Vlor maximo %.2f y valor minimo %.2f",datos.calcularValorMaximo(),datos.calcularValorMinimo());
	}

}
