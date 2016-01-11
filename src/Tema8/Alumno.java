package Tema8;

public class Alumno {
	//atributos
	private String nombre;
	private int edad;
	private String dni;
	private double notas;
	private int asignaturasMatriculadas;
	
	
	public Alumno(String nombre, int edad, String dni, double notas,int asignaturasMatriculadas) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.dni = dni;
		this.notas = notas;
		this.asignaturasMatriculadas=asignaturasMatriculadas;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public double getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas = notas;
	}
	
	public int getAsignaturasMatriculadas() {
		return asignaturasMatriculadas;
	}
	public void setAsignaturasMatriculadas(int asignaturasMatriculadas) {
		this.asignaturasMatriculadas = asignaturasMatriculadas;
	}
	public double notaMedia(){
		double notamedia=0;
		int suma=0;
		
		for (int i = 0; i < asignaturasMatriculadas; i++) {
			notas=Math.random();
			suma+=notas;
			
		}
		notamedia=suma/asignaturasMatriculadas;
		return notamedia;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", notas=" + notas
				+ ", asignaturasMatriculadas=" + asignaturasMatriculadas + "]";
	}
	
	

}
