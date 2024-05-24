package SuperPrestamosSA;

import java.util.Date;

public class Tecnologia extends Recurso{

	private Procedencias procedencia;

	// Constructor
	
	public Tecnologia(int id, int codigoPostal, String nombre, String ubicacion, Date fechaPrestamo,
			Procedencias procedencia) {
		super(id, codigoPostal, nombre, ubicacion, fechaPrestamo);
		this.procedencia = procedencia;
	}

	// Getter y Setter

	public Procedencias getProcedencia() {
		return procedencia;
	}

	public void setProcedencia(Procedencias procedencia) {
		this.procedencia = procedencia;
	}
	
	
}
