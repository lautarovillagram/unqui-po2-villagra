package ar.edu.unq.po.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

public class CounterTest {
	private Counter counter;

	@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();

		counter.agregarNumero(1);
		counter.agregarNumero(3);
		counter.agregarNumero(5);
		counter.agregarNumero(7);
		counter.agregarNumero(9);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(1);
		counter.agregarNumero(4);

	}

	@Test
	public void testEvenNumbers() {
		int amount = counter.cantidadPares();
		assertEquals(amount, 1);
	}

	@Test
	public void testOddNumbers() {
		int amount = counter.cantidadImpares();
		assertEquals(amount, 9);
	}

	@Test
	public void testMultiples() {
		int amount = counter.multiplosDe(3);
		assertEquals(amount, 2);
	}

	@Test
	public void testMayorMultiploEntre10Y100() {
		int amount = counter.mayorNumeroMultiploEntre(10, 100);
		assertEquals(amount, 1000);
	}

	@Test
	public void testMayorMultiploEntre30Y100() {
		int amount = counter.mayorNumeroMultiploEntre(30, 100);
		assertEquals(amount, 900);
	}

	@Test
	public void testMayorMultiploEntre27Y50() {
		int amount = counter.mayorNumeroMultiploEntre(27, 50);
		assertEquals(amount, -1);
	}
	
	@Test
	public void testMayorMultiploEntre50Y21() {
		int amount = counter.mayorNumeroMultiploEntre(50, 21);
		assertEquals(amount, -1);
	}

}
