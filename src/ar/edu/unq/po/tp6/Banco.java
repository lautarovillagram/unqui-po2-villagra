package ar.edu.unq.po.tp6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Banco {

	private List<Clientes> clientes = new ArrayList<Clientes>();
	private List<Credito> creditosSolicitados = new ArrayList<Credito>();
	private List<Credito> creditosAprobados = new ArrayList<Credito>();

	public void agregarCliente(Clientes cliente) {
		clientes.add(cliente);
	}

	public void evaluarSolicitudes() {

		List<Credito> creditosParaAprobar = creditosSolicitados.stream().filter(credito -> credito.esAceptable())
				.collect(Collectors.toList());
		creditosSolicitados.removeAll(creditosParaAprobar);
		creditosAprobados.addAll(creditosParaAprobar);

	}

	public void registrarSolicitud(Credito credito) {
		creditosSolicitados.add(credito);
	}

	public int getCantidadClientes() {
		return clientes.size();
	}

	public int getCantidadCreditosSolicitados() {
		return creditosSolicitados.size();
	}

	public int getCantidadCreditosAprobados() {
		return creditosAprobados.size();
	}

	public double getMontoADesembolsar() {
		double montoTotal = creditosAprobados.stream().mapToDouble(Credito::getMonto).sum();
		return montoTotal;

	}

}
