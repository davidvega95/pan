package Tema12;

public class Triangulo {
	//atributos
	private double a;
	private double b;
	private double c;
	
	
	
	//constructor
	public Triangulo(double a, double b, double c) throws IlegalTrianguloException {
		if(ValidarLadosDeTriangulo()){
		this.a = a;
		this.b = b;
		this.c = c;
		}
		else{
			throw new IlegalTrianguloException();
		}
	}
	//metodo de los lados Los tres lados a, b y c de un triangulo deben satisfacer la
	//desigualdad triangular: cada uno de los lados no puede ser mas largo que la
	//suma de los otros dos
	public boolean ValidarLadosDeTriangulo(){
		boolean valido=false;
		double suma=a+b;
		double suma1=a+c;
		double suma2=b+c;
		if((suma>c)&&(suma1>b)&&(suma2>a)){
			valido=true;
		}
		return valido;
		
	}
	@Override
	public String toString() {
		return "Triangulo [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
	
	
	

}
