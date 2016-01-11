package Tema8;

public class Persona {
	private String nombre;
	private String Sexo;
	private int edad;
	

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", Sexo=" + Sexo + ", edad=" + edad + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getSexo() {
		return Sexo;
	}


	public void setSexo(String sexo) {
		Sexo = sexo;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public Persona(String nombre, String sexo, int edad) {
		super();
		this.nombre = nombre;
		Sexo = sexo;
		this.edad = edad;
	}
	//metodo que nos dice si es mayor de edad
	public boolean MayorEdad(){
		return this.edad>=18;
		
	}



}
