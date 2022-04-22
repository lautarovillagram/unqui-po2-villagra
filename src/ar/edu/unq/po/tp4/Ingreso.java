package ar.edu.unq.po.tp4;

public class Ingreso {
	protected int mes;
	protected String concepto;
	protected double monto;

	public double getMonto() {
		return monto;
	}

	public double getMontoImponible() {
		return this.getMonto();

	}
	
	public Ingreso(int month, String concept, double montoPercibido) {
		mes = month;
		concepto = concept;
		monto = montoPercibido;
	}
	
	public Ingreso() {}

}
