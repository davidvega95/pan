package Tema12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;

public class Ejemplo4 {

	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			URL url=new URL("http://www.ideal.es/jaen");
			URLConnection conexion=url.openConnection();
			BufferedReader in=new BufferedReader(new InputStreamReader(
				conexion.getInputStream()));
			String leido;
			while((leido= in.readLine()) != null){
				System.out.println(leido);
			}
			
		} catch (MalformedURLException e) {
			// TODO: handle exception
		  e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
