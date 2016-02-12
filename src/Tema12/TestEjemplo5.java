package Tema12;

import java.io.File;
import java.io.FileNotFoundException;

public class TestEjemplo5 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int longitud=5;
		File inFile=new File("C:\\Users\\mañana\\Downloads\\nombres_mujer.txt");
		try {
			String nombreBuscado=Ejemplo5.buscarPalabra(inFile, longitud);
			System.out.println(nombreBuscado);
		
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Fichero noencotrado");
		}
		
        
	}

}
