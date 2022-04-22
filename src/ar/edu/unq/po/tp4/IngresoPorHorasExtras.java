package ar.edu.unq.po.tp4;

public class IngresoPorHorasExtras extends Ingreso {
	private int horasExtras;

	@Override
	public double getMontoImponible() {
		return 0;
	}

	public IngresoPorHorasExtras(int month, String concept, double montoPercibido, int horasExtrasTrabajadas) {
		mes = month;
		concepto = concept;
		monto = montoPercibido;
		horasExtras = horasExtrasTrabajadas;
	}

}
