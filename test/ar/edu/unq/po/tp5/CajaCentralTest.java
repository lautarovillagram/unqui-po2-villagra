package ar.edu.unq.po.tp5;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class CajaCentralTest {
	private CajaCentral caja;
	private ProductoCooperativa azucar;
	private ProductoTradicional queso;
	private ProductoCooperativa leche;

	@BeforeEach
	public void setUp() throws Exception {
		caja = new CajaCentral();
		azucar = new ProductoCooperativa(10d);
		queso = new ProductoTradicional(20d);
		leche = new ProductoCooperativa(15d);
	}

	@Test
	public void testPrecioTotal() {
		double precioTotal = caja.getPrecioTotal();

		assertEquals(precioTotal, 0);
		caja.agregarProducto(azucar);
		caja.agregarProducto(queso);
		caja.agregarProducto(leche);
		precioTotal = caja.getPrecioTotal();
		assertEquals(precioTotal, 43);
	}

}
