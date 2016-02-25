package Tema13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestJuego {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego juego =new Juego("Programacion","Informatica", 0, null);
		System.out.println(juego);
		try {
			Scanner sc=new Scanner(new File("C:\\Users\\mañana\\Desktop\\Usuarios.txt"));
			String login;
			String password="";
			Usuario u;
		/*	while(sc.hasNext()){
				login=sc.next();
				if(sc.hasNext()){
					password=sc.next();
				}
				else
				   password=Usuario.generarLoginOPassword();
				
				try {
					u=new Usuario(login,password);
					juego.addUsuario(u);
					int puntuacion=(int)(Math.random()*100);
				} catch (UsuarioException e) {
					System.out.println("login: "+login+" no valido");
					// TODO: handle exception
				}
			}*/
			System.out.println(juego);
			String linea="";
			while(sc.hasNextLine()){
			  linea=sc.nextLine();
			  String[] valores =linea.split("\\s+"); login=valores[0];
			  if(valores.length==2){
			  
			  password=valores[1];
			  }
			  else{
				 
				  password=Usuario.generarLoginOPassword();
			  }
			  try {
				u=new Usuario(login,password);
				juego.addUsuario(u);
				System.out.println("Eliminando un usaurio");
				juego.borrarUsuarios(login);
			} catch (UsuarioException e) {
				// TODO: handle exception
				System.out.println("login: "+login+" no valido");
				
			}
			  			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Fichero no existe");
		}
		
		
	
	
	
	}

}
