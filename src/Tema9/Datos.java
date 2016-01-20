/**
 * @author David
 * @version 1.0
 * 	Clase que incorpora una coleccion de datos
 * y realiza operaciones estadisticas sobre ellos
 */



package Tema9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Datos {
	//atributos de acuerdo al UML
	private List<Double> temperaturas;
	/**
	 * @param temperaturas
	 */
	public Datos(List <Double>temperaturas){
		this.temperaturas=temperaturas;
	}
	public double valorMedio(){
       int suma=0;
       for (int i = 0; i < temperaturas.size(); i++) {
    	   suma+=temperaturas.get(i);
		
	}
       double media=suma/temperaturas.size();
       return media;
       
	}
	/**
	 * 
	 * @return desviacion Tipica
	 */
	public double desviacionTipica(){
		double varianza=0;
		for (int i = 0; i < temperaturas.size(); i++) {
			varianza+=(temperaturas.get(i)-valorMedio())*(temperaturas.get(i)-valorMedio());
			
		}
		double desviacionTipica=Math.sqrt(varianza/(temperaturas.size()-1));
		return desviacionTipica;
	}
	/**
	 * 
	 * @return numero de valores por debajo de la media
	 */
	
	public int ValoresdebajoMedia(){
		int cont=0;
		for (int i = 0; i < temperaturas.size(); i++) {
			if(temperaturas.get(i)<valorMedio()){
				cont++;
			}
			
		}
		
		return cont;
		
	}
	/**
	 * 
	 * @return temperatura maxima
	 */
	public double calcularValorMaximo(){
		Collections.sort(this.temperaturas);
		double maximo=temperaturas.get(0);
		for (int i = 0; i < temperaturas.size(); i++) {
			if(temperaturas.get(i)>maximo){
				maximo=temperaturas.get(i);
			}
			
			
		}
		return maximo;
		//return this.temperaturas.get(this.temperaturas.size()-1)
		
			
		}
	/**
	 * 
	 * @return temperatura minima
	 */
	public double calcularValorMinimo(){
		Collections.sort(this.temperaturas);
		return this.temperaturas.get(0);
	}

}
