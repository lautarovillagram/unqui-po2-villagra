package ar.edu.unq.po.tp5;

import java.util.ArrayList;
import java.util.List;

public class CajaCentral {

	private double totalAPagar;

	public void registrarProducto(Producto productoAAgregar) {

		if (productoAAgregar.getCantidad() > 0) {
			totalAPagar += productoAAgregar.getPrecio();
			productoAAgregar.setCantidad(productoAAgregar.getCantidad() - 1);
		}

	}

	public double getTotalAPagar() {
		return this.totalAPagar;
	}

}
