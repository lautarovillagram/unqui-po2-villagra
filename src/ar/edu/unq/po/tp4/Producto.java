package ar.edu.unq.po.tp4;

public class Producto {
	private String nombre;
	protected double precio;
	private Boolean esPrecioCuidado;

	public double getPrecio() {

		return precio;

	}

	public String getNombre() {
		return nombre;
	}

	public boolean esPrecioCuidado() {

		return esPrecioCuidado;
	}

	public Producto(String nombreProducto, double precioProducto) {
		nombre = nombreProducto;
		precio = precioProducto;
		esPrecioCuidado = false;
	}

	public Producto(String nombreProducto, double precioProducto, boolean precioCuidado) {
		nombre = nombreProducto;
		precio = precioProducto;
		esPrecioCuidado = precioCuidado;
	}

	public void aumentarPrecio(double aumento) {
		precio = this.getPrecio() + aumento;
	}

}
