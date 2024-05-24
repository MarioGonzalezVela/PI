package SuperPrestamosSA;

import javax.swing.JFrame;

public class Test {

	public static void main(String[] args) {
		
//		LogIn login = new LogIn();
//		login.bienvenida();
//		PreguntasFrecuentes FAQ = new PreguntasFrecuentes();
//		 System.out.println(FAQ.imprimirFAQ());
//		Menu menu = new Menu();
//		 menu.imprimirMenu();
		
		// Patrón MVC

		Controlador controlador = new ControladorImp();
		Modelo modelo = new ModeloImp();
		Vista vista = new VistaImp();

		// Para que se conozcan entre ellos

		controlador.setModelo(modelo);
		controlador.setVista(vista);
		vista.setControlador(controlador);
		vista.setModelo(modelo);
		modelo.setVista(vista);

//		VistaImp paginaPrincipal = new VistaImp();
//		paginaPrincipal.setVisible(true);

	}

}
