package ar.edu.unq.po.tp6;

public class Clientes {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private Double sueldoNetoMensual;
	private Banco banco;

	public Double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}

	public void setSueldoNetoMensual(Double sueldoNetoMensual) {
		this.sueldoNetoMensual = sueldoNetoMensual;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public int getEdad() {
		return edad;
	}

	public void solicitarCreditoPersonal(Double monto, int meses) {
		banco.registrarSolicitud(new CreditoPersonal(this, monto, meses));

	}

	public void solicitarCreditoInmobiliario(double monto, int meses, PropiedadInmobiliaria propiedad) {
		banco.registrarSolicitud(new CreditoHipotecario(this, monto, meses, propiedad));
	}

	public double getSueldoNetoAnual() {
		return this.getSueldoNetoMensual() * 12;
	}

	public Clientes(String nombre, String apellido, String direccion, int edad, Double sueldoNetoMensual, Banco banco) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.banco = banco;

	}

}
