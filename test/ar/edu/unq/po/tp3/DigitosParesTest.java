package ar.edu.unq.po.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class DigitosParesTest {
	private Counter counter;

	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();

		counter.agregarNumero(2224);
		counter.agregarNumero(3521);
		counter.agregarNumero(1111);
		counter.agregarNumero(1231);

	}

	@Test
	public void testNumeroConMasPares() {
		int amount = counter.numeroConMasDigitosPares();
		assertEquals(amount, 2224);
	}

	@Test
	public void testDigitosPares() {
		int amount = counter.digitosPares(22);
		assertEquals(amount, 2);
	}

}
