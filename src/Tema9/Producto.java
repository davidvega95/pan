package Tema9;

public class Producto {
	//atributos
		private int id;
		private String nombreProducto;
		private double precioProducto;
		//constructor
		public Producto(int id, String nombreProducto, double precioProducto) {
			super();
			this.id = id;
			this.nombreProducto = nombreProducto;
			this.precioProducto = precioProducto;
		}
		public int getId() {
			return id;
		}
		public String getNombreProducto() {
			return nombreProducto;
		}
		public double getPrecioProducto() {
			return precioProducto;
		}
		@Override
		public String toString() {
			return "Producto [id=" + id + ", nombreProducto=" + nombreProducto
					+ ", precioProducto=" + precioProducto + "]";
		}
		/*public static void main(String[] args) {
			Producto p=new Producto(2,"pan",1.5);
			System.out.println(p);
		}*/
		
		

}
