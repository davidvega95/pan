package Tema12;

public class TestConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(Conversion.ConvertirBinarioADecimal("11"));
			System.out.println(Conversion.convertirHexadecimalABinario("111b"));
		} catch (NoBinarioException e) {
			// TODO: handle exception
			System.out.println("No es un numero binario");
		}
		catch(NoHexadecimalException e){
			System.out.println("No es un numero hexadecimal");
			
		}

	}

}
