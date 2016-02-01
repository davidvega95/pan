package Tema10;

public class ClaveSegura {
	//atributo de tipo String
		private String clave;

	public ClaveSegura(String clave) {
		
		this.clave = clave;
	}
	
	private boolean tieneAlMenos8Caracteres(){
		return this.clave.length()>7;
	}
	
	//si contiene al menos alguna letra en minuscula
	private boolean contieneLetraMinuscula(){
		return this.clave.matches(".*[a-z].*");
	}
	private boolean contieneLetraMayuscula(){
		return this.clave.matches(".*[A-Z].*");
	}
	private boolean contieneDigitos(){
		return this.clave.matches(".*[1-9].*");
	}
	private boolean CaracterNoAlfanumerico(){
		return this.clave.matches(".*\\W.*") || this.clave.matches(".*_.*");
	}
	public boolean esClaveSegura(){
		return tieneAlMenos8Caracteres() && contieneDigitos() && contieneLetraMayuscula()
				&& contieneLetraMinuscula() && CaracterNoAlfanumerico();
	}
	
		
		
}
