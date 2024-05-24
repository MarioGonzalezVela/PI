package SuperPrestamosSA;

import java.util.*;

public class Registro {
	
	// Usaremos mapas (TreeMaps) para almacenar los datos nickname - contraseña / clave - valor
	// Será la mejor opción ya que estarán en orden natural y no admitirá repetidos
	
	protected TreeMap<String,String> listaAdmins = new TreeMap <>(); // Administradores
	protected TreeMap<String,String> listaSuperEmpresas = new TreeMap <>(); // SuperEmpresas
	
}
