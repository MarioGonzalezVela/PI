package SuperPrestamosSA;

import java.util.*;
public class Recurso {
	
	protected int id,codigoPostal;
	protected String nombre,ubicacion;
	private Date fechaPrestamo;
	
	// Constructor


	public Recurso(int id, int codigoPostal, String nombre, String ubicacion, Date fechaPrestamo) {
		super();
		this.id = id;
		this.codigoPostal = codigoPostal;
		this.nombre = nombre;
		this.ubicacion = ubicacion;
		this.fechaPrestamo = fechaPrestamo;
	}

	// Getters y Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public Date getFechaPrestamo() {
		return fechaPrestamo;
	}

	public void setFechaPrestamo(Date fechaPrestamo) {
		this.fechaPrestamo = fechaPrestamo;
	}


	
}
