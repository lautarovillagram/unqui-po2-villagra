package ar.edu.unq.po.tp5;

public class Producto {

	protected double precio;
	private int cantidad;

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return precio;
	}

	public Producto(double price, int amount) {
		this.setPrecio(price);
		this.setCantidad(amount);
	}
	
	public boolean hayStock() {
		return this.getCantidad() > 0;
	}
	
	public void restarUnStock() {
		this.setCantidad(this.getCantidad() - 1);
	}
	
	

}
