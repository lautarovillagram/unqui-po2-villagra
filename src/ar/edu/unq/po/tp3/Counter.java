package ar.edu.unq.po.tp3;

import java.util.ArrayList;
import java.util.List;

public class Counter {

	private List<Integer> numeros = new ArrayList<Integer>();

	public int cantidadPares() {
		int cantidadPares = 0;
		for (Integer numero : numeros) {
			if (numero % 2 == 0)
				cantidadPares++;

		}

		return cantidadPares;

	}

	public int cantidadImpares() {
		int cantidadImpares = 0;
		for (Integer numero : numeros) {
			if (numero % 2 != 0)
				cantidadImpares++;
		}

		return cantidadImpares;
	}

	public int multiplosDe(int x) {
		int multiplos = 0;
		for (Integer numero : numeros) {
			if (numero % x == 0)
				multiplos++;
		}
		return multiplos;
	}

	public void agregarNumero(int x) {
		numeros.add(x);

	}

	public int digitosPares(int x) {
		int numero = x;
		int cantidadDigitosPares = 0;
		while (numero > 0) {
			if (numero % 2 == 0) {
				cantidadDigitosPares++;
				numero = numero / 10;
			} else {
				numero = numero / 10;
			}

		}

		return cantidadDigitosPares;
	}

	public int numeroConMasDigitosPares() {
		int numeroConMasDigitosPares = 0;
		for (Integer numero : numeros) {
			if (this.digitosPares(numero) > numeroConMasDigitosPares)
				numeroConMasDigitosPares = numero;
		}

		return numeroConMasDigitosPares;
	}

	public int mayorNumeroMultiploEntre(int x, int y) {
		int mayorMultiplo = 1000;
		while (mayorMultiplo > 0 & !this.esMultiploDeXeY(mayorMultiplo, x, y)) {
			mayorMultiplo--;

		}

		if (mayorMultiplo == 0) {
			return -1;
		} else
			return mayorMultiplo;

	}

	public boolean esMultiploDe(int x, int y) {
		return x % y == 0;
	}

	public Boolean esMultiploDeXeY(int z, int x, int y) {
		return z % x == 0 & z % y == 0;

	}
}
