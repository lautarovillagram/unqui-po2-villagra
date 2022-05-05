package ar.edu.unq.po.tp6;

public class CreditoHipotecario extends Credito {
	private PropiedadInmobiliaria propiedadInmobiliaria;

	public PropiedadInmobiliaria getPropiedadInmobiliaria() {
		return propiedadInmobiliaria;
	}

	public void setPropiedadInmobiliaria(PropiedadInmobiliaria propiedadInmobiliaria) {
		this.propiedadInmobiliaria = propiedadInmobiliaria;
	}

	public CreditoHipotecario(Clientes cliente, Double montoSolicitado, int meses, PropiedadInmobiliaria propiedad) {
		this.setSolicitante(cliente);
		this.setMonto(montoSolicitado);
		this.setPlazoEnMeses(meses);
		this.setPropiedadInmobiliaria(propiedad);

	}

	public int edadAlFinalizarElCredito() {
		return this.getSolicitante().getEdad() + this.getPlazoEnMeses() / 12;
	}

	@Override
	public boolean esAceptable() {

		return this.cuotaMensual() <= this.getSolicitante().getSueldoNetoMensual() * 0.5
				&& this.getMonto() <= this.getPropiedadInmobiliaria().getValorFiscal() * 0.7
				&& this.edadAlFinalizarElCredito() < 65;

	}

}
