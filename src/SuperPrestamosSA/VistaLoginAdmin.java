package SuperPrestamosSA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Rectangle;
import javax.swing.JTextField;
import javax.swing.JPasswordField;

public class VistaLoginAdmin extends JFrame implements Vista {
	private JTextField textFieldNicknameA;
	private JTextField textFieldContrasenyaA;

	public VistaLoginAdmin() {

		JFrame frame3 = new JFrame("Ventana Login admin");
		frame3.getContentPane().setBackground(new Color(151, 192, 109));
		frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame3.setBounds(100, 100, 815, 635);
		frame3.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("LOGIN ADMINISTRADOR");
		lblTitulo.setBounds(190, 37, 414, 81);
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		frame3.getContentPane().add(lblTitulo);

		JLabel lblNicknameA = new JLabel("Nickname");
		lblNicknameA.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		lblNicknameA.setBounds(314, 158, 112, 36);
		frame3.getContentPane().add(lblNicknameA);

		JLabel lblPasswordA = new JLabel("Contraseña");
		lblPasswordA.setFont(new Font("Segoe Script", Font.PLAIN, 20));
		lblPasswordA.setBounds(314, 283, 124, 36);
		frame3.getContentPane().add(lblPasswordA);

		textFieldNicknameA = new JTextField();
		textFieldNicknameA.setBounds(314, 217, 145, 29);
		frame3.getContentPane().add(textFieldNicknameA);
		textFieldNicknameA.setColumns(10);

		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(204, 231, 197));
		btnVolver.setBounds(28, 30, 100, 29);
		frame3.getContentPane().add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3.setVisible(false);
				VistaLogin vistaLogin = new VistaLogin();
			}
		});

		JButton btnEntrarAdmin = new JButton("INICIAR SESIÓN");
		btnEntrarAdmin.setBackground(new Color(204, 231, 197));
		btnEntrarAdmin.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnEntrarAdmin.setBounds(270, 422, 224, 47);
		frame3.getContentPane().add(btnEntrarAdmin);
		
		textFieldContrasenyaA = new JTextField();
		textFieldContrasenyaA.setColumns(10);
		textFieldContrasenyaA.setBounds(314, 335, 145, 29);
		frame3.getContentPane().add(textFieldContrasenyaA);
		btnEntrarAdmin.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
				// INTENTO DE COMPROBAR SI NICKNAME Y CONTRASEÑA SON CORRECTOS (AL FINAL LLEVO DIRECTAMENTE A RECURSOS)

//				VistaRegistroAdmin vistaRegistroAdmin = new VistaRegistroAdmin();
//				vistaRegistroAdmin.setVisible(false);
//				VistaLoginAdmin vistaLoginAdmin = new VistaLoginAdmin();

//				String nickname = vistaRegistroAdmin.getNickname();
//				String contrasenya = vistaRegistroAdmin.getContrasenya();

				// JPasswordField devuelve un array de chars por lo que hay que tratarlo
				// diferente
//				char[] arrayContrasenya = passwordField.getPassword();
//				String contrasenyaLogin = new String(arrayContrasenya); // Lo pasamos a String

				String nicknameLogin = textFieldNicknameA.getText();
				String contrasenyaLogin = textFieldContrasenyaA.getText();

//				if (((!nicknameLogin.equals(nickname)) || (!contrasenyaLogin.equals(contrasenya)))) {
//
//					JOptionPane.showMessageDialog(frame3, "Nickname o contraseña incorrectos");
//
//				} else {}
				
					frame3.setVisible(false);
					VistaRecursos vistaRecursos = new VistaRecursos();
				}
			

		});

		frame3.setVisible(true);
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
