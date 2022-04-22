package ar.edu.unq.po.tp5;

public class ProductoTradicional extends Producto {

	public ProductoTradicional(double precioAsignado, int stock) {
		super(precioAsignado, stock);

	}

	@Override
	public double getPrecio() {
		return this.precio * 0.9;
	}

}
