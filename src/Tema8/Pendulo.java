package Tema8;

public class Pendulo {
	public static final double GRAVEDAD=9.8;
	//atributos
	private static double longitud;
    //constructor
	public Pendulo(double longitud){
		this.longitud=longitud;
		
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	
    //metodo que calcula el periodo del pendulo
	public static double CalcularPeriodo(){
	  return 2*Math.PI*Math.sqrt(longitud/GRAVEDAD);
		
	}

	@Override
	public String toString() {
		return "Pendulo [getLongitud()= " + getLongitud() + "y periodo "+CalcularPeriodo()+"]";
	}


	
	
	

}
