package Tema10;

import java.util.*;

public class TestClaveSegura {
	static List<String>listaClavesGeneradas=new ArrayList <String>();
	static List<String>listaClavesSeguras=new ArrayList <String>();

	public static void main(String[] args) {
		  String  FUENTE_CARACTERES = "aAbBcCdDeEfFgGhHiIjJkKlLmMnN˜nNoOpPqQrRsStTuUvVwWxXyYzZ0123456789¿?()=@.:,;!¡&  {}"; 
		// Generamos de forma aleatoria un numero de claves 
		//maximo de 10
		int numeroClaves=(int)(Math.random()*101);
		System.out.println("Generando "+numeroClaves+" claves");
		for (int i = 0; i < numeroClaves; i++) {
			//generamos de forma aleatoria eñ tamaño de la clave
			//con un tamaño maximo de 100
			int tamanoClave=new Random().nextInt(101);
			//guardamos los caracteres obtenidos aleatoriamente
			//de FUENTE_CARACTERES en un StringBuilder y los
			//añadimos con el metodo append
			StringBuilder sBuilder=new StringBuilder();
			for (int j = 0; j < tamanoClave; j++) {
				//obtenemos la posicion de forma aleatoria
				int posicion=(int) (Math.random()* FUENTE_CARACTERES.length());
				char caracterEscogido=FUENTE_CARACTERES.charAt(posicion);
				sBuilder.append(caracterEscogido);
				
			}
			//System.out.println(sBuilder);
			listaClavesGeneradas.add(sBuilder.toString());
			ClaveSegura cs=new ClaveSegura(sBuilder.toString());
			if(cs.esClaveSegura()){
				
				listaClavesSeguras.add(sBuilder.toString());
			}
		}
		System.out.println(listaClavesGeneradas);
		System.out.println("pene: "+listaClavesSeguras);
		System.out.println("Numero de claves seguras: "+listaClavesSeguras.size());
	

     
       
        


	}

}
