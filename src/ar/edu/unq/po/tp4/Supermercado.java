package ar.edu.unq.po.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> catalogo = new ArrayList<Producto>();

	public int getCantidadDeProductos() {
		return catalogo.size();
	}

	public double getPrecioTotal() {
		double sumaTotal = 0;
		for (Producto producto : catalogo) {
			sumaTotal = sumaTotal + producto.getPrecio();

		}

		return sumaTotal;
	}

	public void agregarProducto(Producto producto) {
		catalogo.add(producto);
	}
	
	public Supermercado(String nombreSuper, String direccionSuper) {
		nombre = nombreSuper;
		direccion = direccionSuper;
	}

}
