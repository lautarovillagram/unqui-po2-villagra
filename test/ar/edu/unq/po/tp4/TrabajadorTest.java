package ar.edu.unq.po.tp4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class TrabajadorTest {

	private Ingreso ingreso1;
	private Ingreso ingreso2;
	private IngresoPorHorasExtras ingresoPorHorasExtras;
	private Trabajador trabajador;

	@BeforeEach
	public void setUp() {
		ingreso1 = new Ingreso(01, "recibo", 50000);
		ingreso2 = new Ingreso(02, "recibo", 55000);
		ingresoPorHorasExtras = new IngresoPorHorasExtras(01, "recibo horas extras", 15000, 15);
		trabajador = new Trabajador();

	}

	@Test
	public void testTotalPercibido() {
		assertEquals(0, trabajador.getTotalPercibido());
		trabajador.agregarIngreso(ingreso1);
		trabajador.agregarIngreso(ingreso2);
		trabajador.agregarIngreso(ingresoPorHorasExtras);
		assertEquals(120000, trabajador.getTotalPercibido());
	}

}
