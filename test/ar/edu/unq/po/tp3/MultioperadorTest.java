package ar.edu.unq.po.tp3;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class MultioperadorTest {
	private Multioperador multioperador;

	@BeforeEach
	public void setUp() throws Exception {
		multioperador = new Multioperador();

		multioperador.agregarNumero(100);
		multioperador.agregarNumero(25);
		multioperador.agregarNumero(10);
		multioperador.agregarNumero(5);
		multioperador.agregarNumero(2);
		multioperador.agregarNumero(1);

	}

	@Test
	public void testSumarNumeros() {
		int amount = multioperador.sumarTodosLosNumeros();
		assertEquals(amount, 143);
	}

	@Test
	public void testRestarNumeros() {
		int amount = multioperador.restarTodosLosNumeros();
		assertEquals(amount, 57);
	}

	@Test
	public void testMultiplocarNumeros() {
		int amount = multioperador.multiplicarTodosLosNumeros();
		assertEquals(amount, 250000);
	}

}
