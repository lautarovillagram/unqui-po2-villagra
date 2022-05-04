package ar.edu.unq.po.tp5;

public class CajaCentral implements Agencia {

	private double totalAPagar;
	private int productosFacturados;
	private double tasaDeServicio;

	public int getProductosFacturados() {
		return productosFacturados;
	}

	public void setProductosFacturados(int productosFacturados) {
		this.productosFacturados = productosFacturados;
	}

	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public void setTasaDeServicio(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}

	public void setTotalAPagar(double totalAPagar) {
		this.totalAPagar = totalAPagar;
	}

	public void registrarProducto(Producto productoAAgregar) {

		if (productoAAgregar.hayStock()) {
			this.setTotalAPagar(this.getTotalAPagar() + productoAAgregar.getPrecio());
			productoAAgregar.restarUnStock();
			this.setProductosFacturados(this.getProductosFacturados() + 1);
		}

	}

	public double getTotalAPagar() {
		return this.totalAPagar;
	}

	@Override
	public void registrarPago(Factura factura) {
		Agencia.facturas.add(factura);
	}

}
