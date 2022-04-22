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
		azucar = new ProductoCooperativa(10d, 5);
		queso = new ProductoTradicional(20d, 4);
		leche = new ProductoCooperativa(15d, 6);
	}

	@Test
	public void testPrecioTotal() {
		double precioTotal = caja.getTotalAPagar();

		assertEquals(precioTotal, 0);
		caja.registrarProducto(azucar);
		caja.registrarProducto(queso);
		caja.registrarProducto(leche);
		precioTotal = caja.getTotalAPagar();
		assertEquals(precioTotal, 43);
	}

}
