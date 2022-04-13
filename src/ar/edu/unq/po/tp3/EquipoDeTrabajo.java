package ar.edu.unq.po.tp3;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	private String nombreEquipo;
	private List<Persona> integrantes = new ArrayList<Persona>();

	public EquipoDeTrabajo(String nombre, ArrayList<Persona> integrantesDelEquipo) {
		nombreEquipo = nombre;
		integrantes = integrantesDelEquipo;
	}

	private void agregarIntegrante(Persona persona) {
		integrantes.add(persona);
	}

	private String getNombreEquipo() {
		return nombreEquipo;
	}

	private int promedioEdadIntegrantes() {
		int edadesSumadas = 0;

		for (Persona persona : integrantes) {
			edadesSumadas = edadesSumadas + persona.años();
		}

		return edadesSumadas / integrantes.size();

	}

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Persona integrante1 = new Persona("Lautaro", "Villagra", new Date(1996, 4, 16));
		Persona integrante2 = new Persona("Milagros", "Sosa", new Date(1996, 11, 5));
		Persona integrante3 = new Persona("Benito", "Perez", new Date(1990, 8, 25));
		Persona integrante4 = new Persona("Ignacio", "Zampedri", new Date(1995, 3, 5));
		Persona integrante5 = new Persona("Carlos", "Martinez", new Date(1985, 12, 1));

		EquipoDeTrabajo equipo1 = new EquipoDeTrabajo("los laburadores", new ArrayList<Persona>());

		equipo1.agregarIntegrante(integrante1);
		equipo1.agregarIntegrante(integrante2);
		equipo1.agregarIntegrante(integrante3);
		equipo1.agregarIntegrante(integrante4);
		equipo1.agregarIntegrante(integrante5);
		
		System.out.println(equipo1.promedioEdadIntegrantes());
	}

}
