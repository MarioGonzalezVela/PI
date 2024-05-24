package SuperPrestamosSA;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JTextPane;

public class VistaFaq extends JFrame implements Vista {

	private Modelo modelo;
	private Controlador controlador;

	public VistaFaq() {

		JFrame frame1 = new JFrame("Ventana Preguntas Frecuentes");
		frame1.getContentPane().setBackground(new Color(151, 192, 109));

		frame1.setSize(800, 600);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame1.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("PREGUNTAS FRECUENTES");
		lblTitulo.setBounds(165, 31, 506, 83);
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		frame1.getContentPane().add(lblTitulo);
		
		frame1.setVisible(true);
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;

	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;

	}

	public Container getContenedor() {

		return null;
	}
}
