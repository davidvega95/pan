package Tema13;

import java.util.ArrayList;
import java.util.List;

public class Juego {
	//atributos
	private String nombreJuego;
	private String categoria;
	private int puntuacion;
	private List<Usuario>listaUsuarios;
	
	public Juego(String nombreJuego, String categoria, int puntuacion, List<Usuario> listaUsuarios) {
		super();
		this.nombreJuego = nombreJuego;
		this.categoria = categoria;
		this.puntuacion = puntuacion;
		this.listaUsuarios = new ArrayList<Usuario>();
	}
	public void addUsuario(Usuario u){
		this.listaUsuarios.add(u);
	}
	public boolean borrarUsuarios(String login){
		for (Usuario usuario : listaUsuarios) {
			if(usuario.getLogin().equals(login)){
				return listaUsuarios.remove(usuario);
			}
			
			}
		
	
		return false;}

	public void variarPuntuacion(int puntuacion){
		this.puntuacion+=puntuacion;
	}
	public String getNombreJuego() {
		return nombreJuego;
	}
	public void setNombreJuego(String nombreJuego) {
		this.nombreJuego = nombreJuego;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	@Override
	public String toString() {
		return "Juego [nombreJuego=" + nombreJuego + ", categoria=" + categoria + ", puntuacion=" + puntuacion
				+ ", listaUsuarios=" + listaUsuarios + "]";
	}
	
	
	

}
