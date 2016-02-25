package Tema13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
	//Atributos
		private List<CuentaBancaria> Cuentas=new ArrayList<CuentaBancaria>();
		
		
		//metodo que guarde cuentas
		public boolean GuardarCuentas(CuentaBancaria c){
			if(Cuentas.contains(c))
				return false;
			else
				return Cuentas.add(c);
			
			
			
		}
		public boolean EliminarCuentas(CuentaBancaria c){
			if(Cuentas.contains(c))
				return false;
			else
				return Cuentas.remove(c);
			
			
			
		}
		public List<CuentaBancaria> devolvercuentaMayorSaldo(){
			List<CuentaBancaria> listaMayorSaldo=new ArrayList<CuentaBancaria>();
			
			if(Cuentas.size()>0){
				double saldoMayor=0;
				CuentaBancaria c=null;
				//recorremos para encontrar UNA de las cuentas 
				//de mayor saldo
				for (CuentaBancaria cuentaBancaria : Cuentas) {
					if(cuentaBancaria.getSaldo()>saldoMayor){
						c=cuentaBancaria;
						saldoMayor=c.getSaldo();
					}
					
				}
				for (CuentaBancaria cuentaBancaria : listaMayorSaldo) {
					if(c.getSaldo()==cuentaBancaria.getSaldo()){
						listaMayorSaldo.add(cuentaBancaria);
					}
					
				}
			}
			return listaMayorSaldo;
		}
		public List<CuentaBancaria> devolvercuentaMenorSaldo(){
			List<CuentaBancaria> listaMenorSaldo=new ArrayList<CuentaBancaria>();
			if(Cuentas.size()>0){
				 CuentaBancaria c=null;
				double saldoMenor=Double.MAX_VALUE;
				for (CuentaBancaria cuentaBancaria : Cuentas) {
					if(cuentaBancaria.getSaldo()<saldoMenor){
						
						saldoMenor=c.getSaldo();
						listaMenorSaldo.clear();//resetea la lista
						listaMenorSaldo.add(c);
					}
					
				}
				for (CuentaBancaria cuentaBancaria : listaMenorSaldo) {
					if(cuentaBancaria.getSaldo()==saldoMenor){
						listaMenorSaldo.add(cuentaBancaria);
					}
					
				}
			}
			return listaMenorSaldo;
		}
		public List<CuentaBancaria> devolverListadoMorosos(){
			List<CuentaBancaria> listaMorosos=new ArrayList<CuentaBancaria>();
			for (CuentaBancaria cuentaBancaria : Cuentas) {
				if(cuentaBancaria.getSaldo()<0){
					listaMorosos.add(cuentaBancaria);
				}
				
				
			}return listaMorosos;
		}
		
		
		
	/*	public int buscarCuenta (  String numCuenta){
		    //esquema de viusqueda
			int i=0;
			int posicion=-1;
			boolean encontrado=false;
			while((i<Cuentas.size())&&(!encontrado)){
			if (Cuentas.get(i).getNumCuenta()== numCuenta){
			   encontrado=true;
			    posicion=i;
			}
			else {
				
				i++;
				
			}
			}
			return posicion;
			}
		
		
		
		public double MayorSaldo(){
			double maximoSaldo=Cuentas.get(0).getSaldo();
			
			for (int i = 0; i < Cuentas.size(); i++) {
				if(maximoSaldo>Cuentas.get(i).getSaldo()){
					maximoSaldo=Cuentas.get(i).getSaldo();
				}
				
			}
			
			return maximoSaldo;
			
		}
		
		public double MinimoSaldo() {
	          double minimoSaldo=Cuentas.get(0).getSaldo();
	  		
			for (int i = 0; i < Cuentas.size(); i++) {
				if(minimoSaldo<Cuentas.get(i).getSaldo()){
					minimoSaldo=Cuentas.get(i).getSaldo();
				}
				
			}
			
			return minimoSaldo;
			
		}
		*/
		public double SaldoMedio(){
			int suma=0;
			for (int i = 0; i < Cuentas.size(); i++) {
				suma+=Cuentas.get(i).getSaldo();
			}
			double media=suma/Cuentas.size();
			return media;
		}
		@Override
		public String toString() {
			//return "Banco [Cuentas=" + Cuentas.size() + ", SaldoMedio()=" + SaldoMedio()+ "]";
		return "Nº cuentas: "+Cuentas.size()+" Saldo medio: "+SaldoMedio();
		}
		

}
