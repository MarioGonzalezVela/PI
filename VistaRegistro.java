package SuperPrestamosSA;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class VistaRegistro extends JFrame implements Vista{
	public VistaRegistro() {
		
		JFrame frame6 = new JFrame("Ventana Registro");
		frame6.getContentPane().setBackground(new Color(151, 192, 109));
		frame6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame6.setBounds(100, 100, 800, 600);
		frame6.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("REGISTRO");
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		lblTitulo.setBounds(300, 51, 185, 97);
		frame6.getContentPane().add(lblTitulo);

		JButton btnRegistroAdmin = new JButton("REGISTRARSE COMO ADMINISTRADOR");
		btnRegistroAdmin.setBackground(new Color(204, 231, 197));
		btnRegistroAdmin.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnRegistroAdmin.setBounds(195, 224, 400, 47);
		frame6.getContentPane().add(btnRegistroAdmin);
		btnRegistroAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame6.setVisible(false);
				VistaRegistroAdmin vistaRegistroAdmin = new VistaRegistroAdmin();
//				vistaRegistroAdmin.setVisible(true);
			}
		});
		
		JButton btnRegistroSE = new JButton("REGISTRARSE COMO SUPEREMPRESA");
		btnRegistroSE.setBackground(new Color(204, 231, 197));
		btnRegistroSE.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnRegistroSE.setBounds(195, 331, 400, 47);
		frame6.getContentPane().add(btnRegistroSE);
		btnRegistroSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame6.setVisible(false);
				VistaRegistroSE vistaRegistroSE = new VistaRegistroSE();
//				vistaRegistroSE.setVisible(true);
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(204, 231, 197));
		btnVolver.setBounds(28, 30, 100, 29);
		frame6.getContentPane().add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame6.setVisible(false);
				VistaImp vistaImp = new VistaImp();
			}
		});
		
		frame6.setVisible(true);
	}

	@Override
	public void setControlador(Controlador controlador) {
		
	}

	@Override
	public void setModelo(Modelo modelo) {
		
	}

	@Override
	public Container getContenedor() {
		return null;
	} 
}
