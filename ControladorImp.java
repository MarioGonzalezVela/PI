package SuperPrestamosSA;

public class ControladorImp implements Controlador {
	
	private Modelo modelo;
	private Vista vista;

	public ControladorImp() {
		super();
	}

	public void setVista(Vista miVista) {
		this.vista = vista;
		
	}

	public void setModelo(Modelo miModelo) {
		this.modelo = modelo;		
	}
	
}
