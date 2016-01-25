package Tema9;

public class TestTienda {

	public static void main(String[] args) {
		// TODO Auto-generated method stubç
		Tienda tienda=new Tienda();
		//Creamos desde codigo objetos producto
        Producto producto1=new Producto(0,"pan",1.5);
        tienda.AñadirProducto(producto1);
        Producto producto2=new Producto(1,"condon",12.5);
        tienda.AñadirProducto(producto2);
        Producto producto3=new Producto(2,"vibrador",6.5);
        tienda.AñadirProducto(producto3);
        Producto producto4=new Producto(3,"ps4",399.0);
        tienda.AñadirProducto(producto4);
        //que pasa si imprimo el valor de tienda?
        System.out.println(tienda.listarProductos());
        System.out.println("Productos mas caro"+tienda.ProductoMasCaro());
        System.out.println("Producto mas barato"+tienda.ProductoMasBarato());
        //eliminar producto
       Producto producto5=new Producto(3,"ps4",399.0);
       tienda.EliminarProducto(producto4);
       System.out.println(tienda.listarProductos());
      
	}

}
