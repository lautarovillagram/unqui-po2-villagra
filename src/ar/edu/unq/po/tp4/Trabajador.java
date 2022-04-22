package ar.edu.unq.po.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {

	private List<Ingreso> ingresosPercibidos = new ArrayList<Ingreso>();
	
	public Trabajador() {}

	public double getTotalPercibido() {
		double totalPercibido = 0;
		for (Ingreso ingresos : ingresosPercibidos) {
			totalPercibido = totalPercibido + ingresos.getMonto();
		}
		return totalPercibido;
	}

	public double getMontoImponible() {
		double montoImponible = 0;
		for (Ingreso ingresos : ingresosPercibidos) {
			montoImponible = montoImponible + ingresos.getMontoImponible();
		}
		return montoImponible;
	}

	public double getImpuestoAPagar() {
		return this.getMontoImponible() * 0.02;
	}
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosPercibidos.add(ingreso);
	}

}
