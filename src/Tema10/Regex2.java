package Tema10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Regex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//leemos con scanner posibles direcciones IP
		//las direcciones IP pueden ser:
		//127.0.0.1 255.255.255.255 192.168.0.1
		//no son validas 127.0.1 ni 256.255.255
		Scanner in=new Scanner (System.in);
		System.out.println("Introduzca ips");
		String posibleIP=in.next();
		//creamos una coleccion para guardar esas IP
		List<String> listaIps=new ArrayList<String>();
		
		while(validarIP(posibleIP)){
			//si es valida a la lista
			listaIps.add(posibleIP);
			posibleIP=in.next();
			
		}
		in.close();
        System.out.println(listaIps);
	}
	//metodo que nos valida la direccion IP
	public static boolean validarIP(String ip){
		boolean validar=false;
		//primero que encaje con xxx.xxx.xxx donde x es digito1
		//return ip.matches("\\d{3}\\.\\d{3}.\\d{3}.\\d{3}");
		//aqui no encaja 192.168.0.1 modificamos la regex
		//return ip.matches("\\d{1,3}\\.\\d{1,3}\\.\\d{3}\\.\\d{1,3}");
		//problema q se trga direcciones superiores
		return ip.matches("(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d\\d|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d\\d|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d\\d|\\d)\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]|\\d\\d|\\d)\\.");
		
	}

}
