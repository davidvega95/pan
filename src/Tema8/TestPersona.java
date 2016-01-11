package Tema8;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1=new Persona("Joaquin Fernandez", "Masculino", 20);
		System.out.println(p1);
		System.out.println("Mayor de edad" +p1.MayorEdad());

	}

}
