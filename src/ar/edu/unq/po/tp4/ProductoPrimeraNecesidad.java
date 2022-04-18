package ar.edu.unq.po.tp4;

public class ProductoPrimeraNecesidad extends Producto {
	private double descuentoQueSeAplica;

	public ProductoPrimeraNecesidad(String nombreProducto, double precioProducto) {
		super(nombreProducto, precioProducto);
		descuentoQueSeAplica = 10;

	}

	public ProductoPrimeraNecesidad(String nombreProducto, double precioProducto, boolean precioCuidado) {
		super(nombreProducto, precioProducto);
		descuentoQueSeAplica = 10;

	}

	public ProductoPrimeraNecesidad(String nombreProducto, double precioProducto, boolean precioCuidado,
			double descuento) {
		super(nombreProducto, precioProducto);
		descuentoQueSeAplica = descuento;
	}

	@Override
	public double getPrecio() {
		return precio - this.descuentoAAplicar();
	}
	
	public double descuentoAAplicar() {
		return (precio * descuentoQueSeAplica) / 100;
	}

}
