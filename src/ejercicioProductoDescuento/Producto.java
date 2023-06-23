package ejercicioProductoDescuento;

public class Producto {
	
	// Atributos
		String nombre;
		float precio;
		private static final float descuento = 15f;

		public Producto(String nombre, float precio) {
			// TODO Auto-generated constructor stub
			this.nombre = nombre;
			this.precio = precio;
		}
		
		// Metodos

		// Mostrando info del producto
		public void imprimirInfo() {
			System.out.println("Nombre: " + this.nombre);
			System.out.println("Precio: " + this.precio);
		}
		
		public float aplicarDescuento() {
			
			return aplicarDescuento(Producto.descuento);
			
		}
		
		public float obtenerDescuento(float descuento) {
			// Calculando el descuento
			float precioDescuento = (this.precio * descuento) / 100;
			return precioDescuento;
		}
		
		public float obtenerDescuento() {
			return obtenerDescuento(Producto.descuento);
		}
		
		public float aplicarDescuento(float descuento) {
			
			// Aplicando validacion de descuento
			if(descuento >= 0 && descuento <= 100) {
				// Calculando el descuento
				float precioDescuento = obtenerDescuento(descuento);
				// Aplicando el descuento al precio
				float precioFinal = this.precio - precioDescuento;
				// devolver
				return precioFinal;
			}
			else {
				// Marcando error de descuento
				System.out.println("El descuento no es valido");
				return this.precio;
			}
		}

		
		@Override
		public String toString() {
			return "Producto[" + this.nombre + ", " + this.precio + "]";
		}

}// cierre clase
