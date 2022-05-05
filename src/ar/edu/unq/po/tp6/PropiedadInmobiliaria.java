package ar.edu.unq.po.tp6;

public class PropiedadInmobiliaria {
	private String descripcion;
	private String direccion;
	private Double valorFiscal;

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Double getValorFiscal() {
		return valorFiscal;
	}

	public void setValorFiscal(Double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}
	
	public PropiedadInmobiliaria(String descripcion, String direccion, Double valorFiscal) {
		this.setDescripcion(descripcion);
		this.setDireccion(direccion);
		this.setValorFiscal(valorFiscal);
	}

}
