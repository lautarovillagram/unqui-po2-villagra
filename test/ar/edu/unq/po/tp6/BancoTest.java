package ar.edu.unq.po.tp6;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BancoTest {
	private Banco nacion;
	private Clientes cliente1;
	private Clientes cliente2;
	private Clientes cliente3;
	private PropiedadInmobiliaria propiedad1;
	private PropiedadInmobiliaria propiedad2;

	@BeforeEach
	public void SetUp() throws Exception {
		nacion = new Banco();
		cliente1 = new Clientes("Lautaro", "Villagra", "unamuno 123", 26, 10000d, nacion);
		cliente2 = new Clientes("milagros", "sosa", "triunvirato 321", 25, 14000d, nacion);
		cliente3 = new Clientes("cosme", "fulanito", "mosconi 456", 30, 20000d, nacion);
		propiedad1 = new PropiedadInmobiliaria("departamento dos ambientes", "triunvirato 321", 100000d);
		propiedad2 = new PropiedadInmobiliaria("casa de dos pisos", "mosconi 456", 150000d);
		cliente1.solicitarCreditoPersonal(50000d, 12);
		cliente2.solicitarCreditoInmobiliario(150000d, 24, propiedad1);
		cliente3.solicitarCreditoInmobiliario(100000d, 12, propiedad2);

	}

	@Test
	public void testClientesDelBanco() {
		assertEquals(nacion.getCantidadClientes(), 0);
		nacion.agregarCliente(cliente1);
		nacion.agregarCliente(cliente2);
		nacion.agregarCliente(cliente3);
		assertEquals(nacion.getCantidadClientes(), 3);

	}

	@Test
	public void testCantidadCreditosSolicitados() {

		assertEquals(nacion.getCantidadCreditosSolicitados(), 3);

	}

	@Test
	public void testCantidadCreditosSolicitados2() {
		assertEquals(nacion.getCantidadCreditosSolicitados(), 3);
		nacion.evaluarSolicitudes();
		assertEquals(nacion.getCantidadCreditosSolicitados(), 1);

	}

	@Test
	public void testCantidadCreditosACeptados() {
		assertEquals(nacion.getCantidadCreditosAprobados(), 0);
		nacion.evaluarSolicitudes();
		assertEquals(nacion.getCantidadCreditosAprobados(), 2);
	}

	@Test
	public void testMontoADesembolsar() {
		assertEquals(nacion.getMontoADesembolsar(), 0);
		nacion.evaluarSolicitudes();
		assertEquals(nacion.getMontoADesembolsar(), 150000d);
	}

}
