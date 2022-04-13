package ar.edu.unq.po.tp3;

import java.time.LocalDate;

import java.util.Date;

public class Persona {
	private String nombre;
	private String apellido;
	private Date fechaNacimiento;

	private String getNombre() {
		return nombre;
	}

	public Persona(String name, Date fechaDeNacimiento) {
		nombre = name;
		fechaNacimiento = fechaDeNacimiento;

	}

	public Persona(String name, String surname, Date fechaDeNacimiento) {
		nombre = name;
		apellido = surname;
		fechaNacimiento = fechaDeNacimiento;

	}

	public int a�os() {

		return LocalDate.now().getYear() - fechaNacimiento.getYear();
	}

	private boolean menorQue(Persona persona) {

		return this.a�os() < persona.a�os();
	}

	public Persona persona(String nombre, Date fechaNacimiento) {

		return new Persona(nombre, fechaNacimiento);
	}

}
