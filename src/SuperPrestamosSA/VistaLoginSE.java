package SuperPrestamosSA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class VistaLoginSE extends JFrame implements Vista {
	private JPasswordField passwordField;
	private JTextField textField;

	public VistaLoginSE() {

		JFrame frame4 = new JFrame("Ventana Login SE");
		frame4.getContentPane().setBackground(new Color(151, 192, 109));
		frame4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame4.setBounds(100, 100, 800, 600);
		frame4.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("LOGIN SUPEREMPRESA");
		lblTitulo.setBounds(198, 29, 444, 103);
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		frame4.getContentPane().add(lblTitulo);
		
		JLabel lblNicknameSE = new JLabel("Nickname");
		lblNicknameSE.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		lblNicknameSE.setBounds(314, 158, 112, 36);
		frame4.getContentPane().add(lblNicknameSE);
		
		JLabel lblPasswordSE = new JLabel("Contraseña");
		lblPasswordSE.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		lblPasswordSE.setBounds(316, 271, 124, 36);
		frame4.getContentPane().add(lblPasswordSE);
		
		
		
		JButton btnEntrarSE = new JButton("INICIAR SESIÓN");
		btnEntrarSE.setBackground(new Color(204, 231, 197));
		btnEntrarSE.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnEntrarSE.setBounds(270, 422, 224, 47);
		frame4.getContentPane().add(btnEntrarSE);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(314, 317, 141, 29);
		frame4.getContentPane().add(passwordField);
		
		textField = new JTextField();
		textField.setBounds(314, 214, 141, 29);
		frame4.getContentPane().add(textField);
		textField.setColumns(10);
		btnEntrarSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame4.setVisible(false);
				VistaRecursos vistaRecursos = new VistaRecursos();
//				vistaRecursos.setVisible(true);
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(204, 231, 197));
		btnVolver.setBounds(28, 30, 100, 29);
		frame4.getContentPane().add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame4.setVisible(false);
				VistaLogin vistaLogin = new VistaLogin();
			}
		});
		
		frame4.setVisible(true);
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
