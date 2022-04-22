package ar.edu.unq.po.tp5;

import java.util.ArrayList;
import java.util.List;

public class CajaCentral {

	private List<ProductoCooperativa> productos = new ArrayList<ProductoCooperativa>();

	public void agregarProducto(ProductoCooperativa producto) {
		productos.add(producto);
	}

	public double getPrecioTotal() {
		double precioTotal = productos.stream().mapToDouble(ProductoCooperativa::getPrecio).sum();
		return precioTotal;
	}
	
	

}
