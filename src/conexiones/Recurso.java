package conexiones;

public class Recurso {
	
	private int idRecurso,idSuperempresa;
	private String nombre,habilidad,modo;
	
	public Recurso() {
		super();
	}

	public Recurso(int idRecurso, String nombre, String habilidad, String modo, int idSuperempresa) {
		super();
		this.idRecurso = idRecurso;
		this.nombre = nombre;
		this.habilidad = habilidad;
		this.modo = modo;
		this.idSuperempresa = idSuperempresa;
	}

	public int getIdRecurso() {
		return idRecurso;
	}

	public void setIdRecurso(int idRecurso) {
		this.idRecurso = idRecurso;
	}

	public int getIdSuperempresa() {
		return idSuperempresa;
	}

	public void setIdSuperempresa(int idSuperempresa) {
		this.idSuperempresa = idSuperempresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	public String getModo() {
		return modo;
	}

	public void setModo(String modo) {
		this.modo = modo;
	}
	
	
	

}
