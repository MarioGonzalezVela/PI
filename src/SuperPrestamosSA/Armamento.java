package SuperPrestamosSA;

import java.util.Date;

public class Armamento extends Recurso{
	
	private TiposArmamento tipo;
	private int cantidad;
	
	// Constructor
	
	public Armamento(int id, int codigoPostal, String nombre, String ubicacion, Date fechaPrestamo, TiposArmamento tipo,
			int cantidad) {
		super(id, codigoPostal, nombre, ubicacion, fechaPrestamo);
		this.tipo = tipo;
		this.cantidad = cantidad;
	}
	
	// Getters y Setters

	public TiposArmamento getTipo() {
		return tipo;
	}
	public void setTipo(TiposArmamento tipo) {
		this.tipo = tipo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
