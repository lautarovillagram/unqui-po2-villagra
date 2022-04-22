package ar.edu.unq.po.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {

	private List<Integer> numeros = new ArrayList<Integer>();

	public int sumarTodosLosNumeros() {
		int total = 0;
		for (Integer numero : numeros) {
			total += numero;

		}

		return total;
	}

	public int restarTodosLosNumeros() {
		int total = 0;
		for (Integer numero : numeros) {
			total -= numero;
		}

		return total;

	}

	public int multiplicarTodosLosNumeros() {
		int total = 0;
		for (Integer numero : numeros) {
			total *= numero;
		}
		return total;
	}

	public void agregarNumero(int x) {
		numeros.add(x);
	}
	
	public Multioperador() {}

}
