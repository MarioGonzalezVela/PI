package SuperPrestamosSA;

import java.util.Date;

public class SuperHeroe extends Recurso{

	private String habilidad;
	private int edad;
	private Procedencias procedencia;
	private Generos genero;
	
	// Constructor

	public SuperHeroe(int id, int codigoPostal, String nombre, String ubicacion, Date fechaPrestamo, String habilidad,
			int edad, Procedencias procedencia, Generos genero) {
		super(id, codigoPostal, nombre, ubicacion, fechaPrestamo);
		this.habilidad = habilidad;
		this.edad = edad;
		this.procedencia = procedencia;
		this.genero = genero;
	}

	/// Getters y Setters
	
	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public Procedencias getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(Procedencias procedencia) {
		this.procedencia = procedencia;
	}

	public Generos getGenero() {
		return genero;
	}

	public void setGenero(Generos genero) {
		this.genero = genero;
	}
	
	
	
}
