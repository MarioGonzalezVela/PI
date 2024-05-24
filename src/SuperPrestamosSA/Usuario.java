package SuperPrestamosSA;

public class Usuario {

	private int id;
	private String nombre,contrasenya,direccion,correo;
	
	// Constructor
	
	public Usuario(int id, String nombre, String contrasenya, String direccion, String correo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.contrasenya = contrasenya;
		this.direccion = direccion;
		this.correo = correo;
	}

	// Getters y Setters
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getContrasenya() {
		return contrasenya;
	}

	public void setContrasenya(String contrasenya) {
		this.contrasenya = contrasenya;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
	
}
