package ar.edu.unq.po.tp5;

public class ProductoTradicional extends ProductoCooperativa {

	public ProductoTradicional(double precioAsignado) {
		super(precioAsignado);

	}

	@Override
	public double getPrecio() {
		return this.precio * 0.9;
	}

}
