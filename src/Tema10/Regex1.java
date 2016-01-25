package Tema10;

public class Regex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaPrueba="Lucha por tus sueños y que "
				+ "nadie te lo impida por nada en "
				+ "el mundo";
		String cadenaPrueba2=" Odio 2016, este va a ser un peor año";
		//comrpueba que empieza con uno o mas espacios en blanco
		//^\\sL
		//luego contiene 3 digitos \\d{3}
		//y termina en ú   ú.$
	if(cadenaPrueba2.matches("^\\s+L.*\\d{3}.*o\\.$*")){
		System.out.println("La cadena tiene digitos");
	}
	else{
		System.out.println("La cadena no tiene digitos");
	}
	
	}

}
