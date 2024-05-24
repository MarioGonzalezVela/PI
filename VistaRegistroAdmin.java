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
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class VistaRegistroAdmin extends JFrame implements Vista {
	private JTextField textFieldNickname;
	private JTextField textFieldNombre;
	private JTextField textFieldSuperpoder;
	private JTextField textFieldUbicacion;
	private JTextField textFieldContrasenya;
	private JTextField textFieldRepetirContrasenya;
	private JTextField textFieldCodigo;

	public VistaRegistroAdmin() {

		JFrame frame7 = new JFrame("Ventana Registro Admin");
		frame7.getContentPane().setBackground(new Color(151, 192, 109));
		frame7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame7.setBounds(100, 100, 800, 600);
		frame7.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("REGISTRO ADMINISTRADOR");
		lblTitulo.setBounds(174, 36, 500, 108);
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		frame7.getContentPane().add(lblTitulo);

		JButton btnAltaAdmin = new JButton("REGISTRARSE");
		btnAltaAdmin.setBackground(new Color(204, 231, 197));
		btnAltaAdmin.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnAltaAdmin.setBounds(271, 453, 210, 58);
		frame7.getContentPane().add(btnAltaAdmin);
		btnAltaAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				// Comprobación contraseña

				String contrasenya = textFieldContrasenya.getText();
				String repetirContrasenya = textFieldRepetirContrasenya.getText();

				LogIn loginAdmin = new LogIn();
				if (!loginAdmin.verificarContrasenya(contrasenya)) {
					JOptionPane.showMessageDialog(frame7,
							"Contraseña incorrecta ✖\nLa contraseña debe contener al menos 6 caracteres, un número, una mayúscula y una minúscula");
				} else if (!contrasenya.equals(repetirContrasenya)) {
					JOptionPane.showMessageDialog(frame7, "Las contraseñas no coinciden");
				} else {
					JOptionPane.showMessageDialog(frame7, "Contraseña validada ✔");

					// Comprobación nickname

					String nickname = textFieldNickname.getText();

					LogIn loginAdmin2 = new LogIn();
					if (!loginAdmin2.verificarNickname(nickname)) {
						JOptionPane.showMessageDialog(frame7,
								"Nickname incorrecto ✖\nEl nickname debe estar compuesto por caracteres anglosajones");
					} else {
						frame7.setVisible(false);
						VistaImp vistaImp = new VistaImp();

					}
				}
			}
		});

		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(204, 231, 197));
		btnVolver.setBounds(28, 30, 100, 29);
		frame7.getContentPane().add(btnVolver);

		textFieldNickname = new JTextField();
		textFieldNickname.setBounds(119, 190, 96, 19);
		frame7.getContentPane().add(textFieldNickname);
		textFieldNickname.setColumns(10);

		textFieldNombre = new JTextField();
		textFieldNombre.setColumns(10);
		textFieldNombre.setBounds(119, 278, 96, 19);
		frame7.getContentPane().add(textFieldNombre);

		textFieldSuperpoder = new JTextField();
		textFieldSuperpoder.setColumns(10);
		textFieldSuperpoder.setBounds(119, 374, 96, 19);
		frame7.getContentPane().add(textFieldSuperpoder);

		textFieldUbicacion = new JTextField();
		textFieldUbicacion.setColumns(10);
		textFieldUbicacion.setBounds(549, 190, 96, 19);
		frame7.getContentPane().add(textFieldUbicacion);

		textFieldContrasenya = new JTextField();
		textFieldContrasenya.setColumns(10);
		textFieldContrasenya.setBounds(549, 278, 96, 19);
		frame7.getContentPane().add(textFieldContrasenya);

		textFieldRepetirContrasenya = new JTextField();
		textFieldRepetirContrasenya.setColumns(10);
		textFieldRepetirContrasenya.setBounds(549, 374, 96, 19);
		frame7.getContentPane().add(textFieldRepetirContrasenya);

		textFieldCodigo = new JTextField();
		textFieldCodigo.setColumns(10);
		textFieldCodigo.setBounds(335, 374, 96, 19);
		frame7.getContentPane().add(textFieldCodigo);

		JLabel lblNickname = new JLabel("Nickname");
		lblNickname.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblNickname.setBounds(119, 167, 96, 13);
		frame7.getContentPane().add(lblNickname);

		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblNombre.setBounds(119, 255, 96, 13);
		frame7.getContentPane().add(lblNombre);

		JLabel lblSuperpoder = new JLabel("Superpoder");
		lblSuperpoder.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblSuperpoder.setBounds(119, 351, 128, 13);
		frame7.getContentPane().add(lblSuperpoder);

		JLabel lblCodigoSecreto = new JLabel("Código secreto");
		lblCodigoSecreto.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblCodigoSecreto.setBounds(321, 345, 137, 19);
		frame7.getContentPane().add(lblCodigoSecreto);

		JLabel lblUbicacion = new JLabel("Ubicación");
		lblUbicacion.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblUbicacion.setBounds(549, 167, 96, 13);
		frame7.getContentPane().add(lblUbicacion);

		JLabel lblContrasenya = new JLabel("Contraseña");
		lblContrasenya.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblContrasenya.setBounds(549, 255, 114, 13);
		frame7.getContentPane().add(lblContrasenya);

		JLabel lblContrasenyaRepetir = new JLabel("Repetir contraseña");
		lblContrasenyaRepetir.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblContrasenyaRepetir.setBounds(519, 351, 168, 13);
		frame7.getContentPane().add(lblContrasenyaRepetir);
		btnVolver.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				frame7.setVisible(false);
				VistaRegistro vistaRegistro = new VistaRegistro();
			}

		});

		frame7.setVisible(true);
	}
	
	// Para luego poder recogerlas desde el login
	
	public String getNickname() {
        return textFieldNickname.getText();
    }

    public String getContrasenya() {
        return textFieldContrasenya.getText();
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
