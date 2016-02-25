package Tema13;

public class Rectangulo {
	//atributos
	private double ancho;
	private double alto;
	public double getAncho() {
		return ancho;
	}

	public void setAncho(double ancho) {
		this.ancho = ancho;
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public static int getNumRectangulos() {
		return numRectangulos;
	}

	public static void setNumRectangulos(int numRectangulos) {
		Rectangulo.numRectangulos = numRectangulos;
	}
	private static int numRectangulos=0;
	
	//un constructor sin argumentos para crear objetos Rectangulo con los valores de los atributos por defecto.
      public Rectangulo() {
		
		this.ancho = 1;
		this.alto = 1;
		numRectangulos++;
	}

	public Rectangulo(double ancho, double alto) {
		
		this.ancho = ancho;
		this.alto = alto;
		numRectangulos++;
	}
	
	//metodo que devuelva el area del rectangulo
	public double AreaRectangulo(){
		return ancho*alto;
		
		
	}
	//Un metodo que devuelva perımetro de dichos objetos.
	public double PerimetroRectangulo(){
		return (this.ancho*2)+(this.alto*2);
	}
	public static int numRectangulos(){
		return numRectangulos;
		
	}

	@Override
	public String toString() {
		return "Rectangulo de lados: "+this.alto+" ,"+this.ancho+"de Area "
				+AreaRectangulo()+" y perimetro "+PerimetroRectangulo() ;
	}
	
      
	
	

}
