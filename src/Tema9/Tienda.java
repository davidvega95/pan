package Tema9;
import java.util.ArrayList;
import java.util.List;

public class Tienda {

   //atributos un arrayList
	
	private List<Producto> lista;
		//constructor

		public Tienda() {
			this.lista=new ArrayList<Producto>();
			
			
		}
		public void AñadirProducto ( Producto p ){
			this.lista.add(p);
			
			
		}
		public List<Producto> getLista() {
			return lista;
		}
		public void EliminarProducto(Producto p){
			this.lista.remove(p);
			System.out.println("Producto eliminado");
		}
		public Producto ProductoMasCaro(){
			Producto productoMasCaro=lista.get(0);
			//logica: recorremos la cleccion,comparamos
			//los precios (getPrecioProducto()) y actualizamos si es
			//necesario la ariable productoMasCaro
			for (Producto producto : lista) {
				if(producto.getPrecioProducto()>productoMasCaro.getPrecioProducto()){
					productoMasCaro=producto;
				}
			}
			return productoMasCaro;
				
				
				
			}
		public Producto ProductoMasBarato(){
			Producto productoMasBarato=lista.get(0);
			//logica: recorremos la cleccion,comparamos
			//los precios (getPrecioProducto()) y actualizamos si es
			//necesario la ariable productoMasCaro
			for (Producto producto : lista) {
				if(producto.getPrecioProducto()<productoMasBarato.getPrecioProducto()){
					productoMasBarato=producto;
				}
			}
			return productoMasBarato;
				
				
				
			}
		public String listarProductos(){
			return lista.toString();
		}
		//metodo que le pasamos String nombre del producto y
		//devuelve la posicion del objeto
		
		
		//metodo que elimina un producto, dado el nombre del mismo
		public boolean eliminarProductoPorNombre(String nombre){
			//boolean que  nos informa del exito de la operacion
			boolean exito=false;
			for (Producto producto : lista) {
				if (producto.getNombreProducto().equals(nombre)) {
					lista.remove(producto);
					exito=true;
					break;
					
				}
				
			}
			return exito;
		}
	
			
			
		}

		
		

	

	


