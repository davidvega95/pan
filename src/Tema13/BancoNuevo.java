package Tema13;

public class BancoNuevo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco BancoNuevo=new Banco();
		CuentaBancaria c1=new CuentaBancaria();
		BancoNuevo.GuardarCuentas(c1);
		CuentaBancaria c2=new CuentaBancaria();
		BancoNuevo.GuardarCuentas(c2);
		CuentaBancaria c3=new CuentaBancaria();
		BancoNuevo.GuardarCuentas(c3);
		CuentaBancaria c4=new CuentaBancaria();
		BancoNuevo.GuardarCuentas(c4);
		try {
			CuentaBancaria c5=new CuentaBancaria(-200,2.6);
			BancoNuevo.GuardarCuentas(c5);
			System.out.println(c5);
		} catch (CuentaBancariaException e) {
			// TODO Auto-generated catch block
			System.out.println("Cuenta con saldo negativo");
		}
		try {
			CuentaBancaria c6=new CuentaBancaria(200,2.6);
			BancoNuevo.GuardarCuentas(c6);
			BancoNuevo.devolvercuentaMayorSaldo();
			System.out.println(c6);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println(BancoNuevo);

	}

}
