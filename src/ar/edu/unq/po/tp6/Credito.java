package ar.edu.unq.po.tp6;

public abstract class Credito {
	private Double monto;
	private Clientes solicitante;
	private int plazoEnMeses;

	public Double getMonto() {
		return monto;
	}

	public void setMonto(Double monto) {
		this.monto = monto;
	}

	public Clientes getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(Clientes solicitante) {
		this.solicitante = solicitante;
	}

	public int getPlazoEnMeses() {
		return plazoEnMeses;
	}

	public void setPlazoEnMeses(int plazoEnMeses) {
		this.plazoEnMeses = plazoEnMeses;
	}

	public abstract boolean esAceptable();

	public double cuotaMensual() {
		return this.getMonto() / this.getPlazoEnMeses();
	}

}
