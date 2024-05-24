package SuperPrestamosSA;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

public class VistaImp extends JFrame implements Vista {

	private Modelo modelo;
	private Controlador controlador;

	public VistaImp() {

		JFrame frame1 = new JFrame("Ventana Principal");
		frame1.getContentPane().setBackground(new Color(151, 192, 109));
		
		frame1.setBounds(100, 100, 800, 600);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		frame1.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("SUPER PRÉSTAMOS S.A.");
		lblTitulo.setBounds(195, 44, 446, 96);
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		frame1.getContentPane().add(lblTitulo);

		JButton btnLogin = new JButton("LOG IN");
		btnLogin.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnLogin.setBackground(new Color(204, 231, 197));
		btnLogin.setForeground(new Color(0, 0, 0));
		btnLogin.setBounds(297, 205, 170, 44);
		frame1.getContentPane().add(btnLogin);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				VistaLogin vistaLogin = new VistaLogin();
			}
		});

		JButton btnRegistro = new JButton("REGISTRO");
		btnRegistro.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnRegistro.setBackground(new Color(204, 231, 197));
		btnRegistro.setForeground(new Color(0, 0, 0));
		btnRegistro.setBounds(297, 292, 170, 44);
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				VistaRegistro vistaRegistro = new VistaRegistro();
			}
		});
		frame1.getContentPane().add(btnRegistro);

		JButton btnFaq = new JButton("PREGUNTAS FRECUENTES");
		btnFaq.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnFaq.setBackground(new Color(204, 231, 197));
		btnFaq.setForeground(new Color(0, 0, 0));
		btnFaq.setBounds(229, 373, 304, 56);
		frame1.getContentPane().add(btnFaq);
		btnFaq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame1.setVisible(false);
				VistaFaq vistaFaq = new VistaFaq();
			}
		});
		
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
