package Tema10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PalabraLeida {
	//atributos
		private String valor;
		
		public String getValor() {
			return valor;
		}

		public void setValor(String valor) {
			this.valor = valor;
		}

		public int NumeroDeLetras(){
			int numletras=0;
			numletras=valor.length();
			
			return numletras;
		}
		public boolean EmpiezaPorVocal(){
			//con expresiones regulares
			return this.valor.toLowerCase().matches("[aeiouáéíóú].*");
			/*boolean valido=false;
			char empieza=valor.charAt(0);
			if((empieza=='a')||(empieza=='e')||(empieza=='i')||(empieza=='o')||(empieza=='u')){
				valido=true;
			}
			return valido;*/
			
			
		}
		
		public boolean AcabaPorVocal(){
			/*boolean valido=false;
			char empieza=valor.charAt(valor.length()-1);
			if((empieza=='a')||(empieza=='e')||(empieza=='i')||(empieza=='o')||(empieza=='u')){
				valido=true;
			}
			return valido;
			*/
			//expresiones regulares
			return this.valor.toLowerCase().matches(".*[aeiouáéíóú]");
			
		}
		public int NumeroDeVocales(){
			/*int contador=0;
			
			
			for (int i = 0; i < valor.length()-1; i++) {
			      if((valor.charAt(i)=='a')||(valor.charAt(i)=='e')||(valor.charAt(i)=='i')||(valor.charAt(i)=='o')||(valor.charAt(i)=='u')){
				         contador++;
			       }
				
			}
			return contador;
			*/
			Pattern patron=Pattern.compile("[aeiouáéíóúü]");
			Matcher matcher=patron.matcher(valor.toLowerCase());
			int contador=0;
			while(matcher.find()){
				contador++;
			}
			return contador;
		}
		public boolean ContieneH(){
			/*boolean encontrado=false;
			for (int i = 0; i < valor.length(); i++) {
				if(valor.charAt(i)=='h'){
					encontrado=true;
					
				}
				
			}
			
			
			return encontrado;*/
			//expresiones regulares
			return this.valor.toLowerCase().contains("h");
		}
		
		
		public boolean EsUnPalindromo(){
			/*boolean encontrado=true;
			int i=0;
			int j=valor.length()-1;
			while((i<j)&&(encontrado==true)){
				if(valor.charAt(i)!=valor.charAt(j)){
					encontrado=false;
				}
				else{
					i++;
					j--;
				}
			}
			return encontrado;
			*/
			StringBuilder sBuilder=new StringBuilder(this.valor);
			return this.valor.equalsIgnoreCase(sBuilder.reverse().toString());
			
		}
		public boolean SonIguales(String palabra){
			return valor.equalsIgnoreCase(palabra);
			
		}

		@Override
		public String toString() {
			return "PalabraLeida [valor=" + valor + ", getValor()=" + getValor()
					+ ", NumeroDeLetras()=" + NumeroDeLetras()
					+ ", EmpiezaPorVocal()=" + EmpiezaPorVocal()
					+ ", AcabaPorVocal()=" + AcabaPorVocal()
					+ ", NumeroDeVocales()=" + NumeroDeVocales() + ", ContieneH()="
					+ ContieneH() + ", EsUnPalindromo()=" + EsUnPalindromo() + "]";
		}
		

}
