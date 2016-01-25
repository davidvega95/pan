package Tema10;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Regex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena1="El terremoto acumulaba hasta las 11,39 horas 27 r�plicas, siendo las m�s elevadas dos registradas a las 6,54 y a las 7,10 horas y que alcanzaron una magnitud de 4,6.";
        String cadena2="En total 26 personas han recibido asistencia en el hospital por percances a ra�z o tras el terremoto, en concreto \"por crisis de ansiedad, por cortes en alg�n caso al recoger objetos de cristal o cer�mica que cayeron al suelo en las viviendas o por golpes que sufrieron al bajar escaleras o en otras situaciones derivadas de la premura con que intentaban salir de sus casas\", seg�n los �ltimos datos de la Delegaci�n del Gobierno.";
        String cadena3="Todas las personas atendidas por servicios m�dicos y hospitalarios por heridas leves han sido dadas de alta. La citada fuente ha subrayado que todos los heridos \"fueron dados de alta tras ser atendidos\".";
        String cadena4="Los efectos del terremoto han sido m�s que evidentes en algunos edificios, especialmente los m�s antiguos del centro de la ciudad, con ca�das de cascotes y falsos techos. En otros han aparecido grietas o ha sufrido el desprendimiento de parte de sus fachadas, lo que ha obligado a los Bomberos a proceder al desalojo por motivos de seguridad. Seg�n el 112, solo se han dado incidencias materiales.";
        String cadena5="a sido el caso del Palacio de la Asamblea de Melilla, que ha sido cerrado, tras la aparici�n de grietas en el interior del edificio y las dos torretas que coronan la parte central de su fachada, que est�n siendo evaluadas por t�cnicos. El cierre ha afectado al normal funcionamiento de la Administraci�n local de Melilla.";
          final String INPUT=cadena1+cadena2+cadena3+cadena4+cadena5;
        //generar el patron el,laslos,las,un una,unos y unas
        final String PATRON="(el|l[oa]s|la|una?|un[ao]s?)";
        //generamos el objeto Pattern
        Pattern patron=Pattern.compile(PATRON);
        Matcher matcher=patron.matcher(INPUT.toLowerCase());
        //creamos un contador
        int contador=0;
        while(matcher.find()){
        	contador++;
        	}
        System.out.println("Numero de articulos:"+contador);
        
	}

}
