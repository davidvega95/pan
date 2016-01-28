package Tema10;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String INPUT ="Mozilla Safari mfdfdf sdfgdsd"
				+ "Safari Mozilla sdjkfjksjd asdfdas asdfdd";
		final String PATRON_MOZILLA="Mozilla";
		Pattern patron=Pattern.compile(PATRON_MOZILLA);
		Matcher matcher=patron.matcher(INPUT);
		int contador=0;
		while(matcher.find()){
			contador++;
		}
		System.out.println("Nº de ocurrencias de Mozilla "+contador);
		

	}

}
