package ar.edu.unq.po.tp5;

public class ProductoCooperativa {

	protected double precio;

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getPrecio() {
		return this.precio;
	}

	public ProductoCooperativa(double precioAsignado) {
		this.setPrecio(precioAsignado);
	}

}
