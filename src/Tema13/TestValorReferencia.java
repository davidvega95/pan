package Tema13;

public class TestValorReferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p=new Persona("juanito",22);
		System.out.println("antes de llamar cambiar"+p);
		cambiarObjetos(p);
		System.out.println("despues de llamar cambiar"+p);
		System.out.println("-----------------------");
		int a=5;
		int b=10;
		System.out.println("Antes de llamar al metodo cambiarTipoprimitivos ,"+p);
		cambiarTiposprimitivos(a, b);
		System.out.println("Despues de llamar al metodo cambiarTipoprimitivos ,"+p);

	}
	public static void cambiarObjetos(Persona p){
		System.out.println("dentro del metodo cambiar: "+p);
		p.setNombre("joaquinito");
		p.setEdad(12);
		
	}
	public static void cambiarTiposprimitivos(int a,int b){
		int aux=a;
		a=b;
		b=a;
		System.out.printf("%s,%s %d%n","Dentro del metodo cambiar de a ", +a+"y de b,"+b);
	}

}
