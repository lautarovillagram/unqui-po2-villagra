package ar.edu.unq.po.tp6;

public class CreditoPersonal extends Credito {

	public CreditoPersonal(Clientes cliente, Double montoSolicitado, int meses) {
		this.setSolicitante(cliente);
		this.setMonto(montoSolicitado);
		this.setPlazoEnMeses(meses);
	}

	@Override
	public boolean esAceptable() {
		return this.getSolicitante().getSueldoNetoAnual() >= 15000
				&& this.cuotaMensual() < this.getSolicitante().getSueldoNetoMensual() * 0.7;
	}

}
