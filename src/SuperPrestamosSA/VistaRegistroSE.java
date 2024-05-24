package SuperPrestamosSA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class VistaRegistroSE extends JFrame implements Vista {
	private JTextField textFieldNicknameSE;
	private JTextField textFieldNombreSE;
	private JTextField textFieldSuperpoderSE;
	private JTextField textFieldUbicacionSE;
	private JTextField textFieldContrasenyaSE;
	private JTextField textFieldContrasenyaRepetirSE;
	private JLabel lblNicknameSE;
	private JLabel lblNombreSE;
	private JLabel lblSuperpoderSE;
	private JLabel lblUbicacionSE;
	private JLabel lblContrasenyaSE;
	private JLabel lblContrasenyaRepetirSE;
	private JCheckBox chckbxTerminos;
	private JCheckBox chckbxAnyosCrimen;

	public VistaRegistroSE() {
		
		JFrame frame8 = new JFrame("Ventana Registro SE");
		frame8.getContentPane().setBackground(new Color(151, 192, 109));
		frame8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame8.setBounds(100, 100, 800, 600);
		frame8.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("REGISTRO SUPEREMPRESA");
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		lblTitulo.setBounds(159, 44, 487, 110);
		frame8.getContentPane().add(lblTitulo);
		
		JButton btnAltaSE = new JButton("REGISTRARSE");
		btnAltaSE.setBackground(new Color(204, 231, 197));
		btnAltaSE.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnAltaSE.setBounds(461, 457, 226, 51);
		frame8.getContentPane().add(btnAltaSE);
		btnAltaSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Comprobación contraseña

				String contrasenya = textFieldContrasenyaSE.getText();
				String repetirContrasenya = textFieldContrasenyaRepetirSE.getText();

				LogIn loginAdmin = new LogIn();
				if (!loginAdmin.verificarContrasenya(contrasenya)) {
					JOptionPane.showMessageDialog(frame8,
							"Contraseña incorrecta ✖\nLa contraseña debe contener al menos 6 caracteres, un número, una mayúscula y una minúscula");
				} else if (!contrasenya.equals(repetirContrasenya)) {
					JOptionPane.showMessageDialog(frame8, "Las contraseñas no coinciden");
				} else {
					JOptionPane.showMessageDialog(frame8, "Contraseña validada ✔");

					// Comprobación nickname

					String nickname = textFieldNicknameSE.getText();

					LogIn loginAdmin2 = new LogIn();
					if (!loginAdmin2.verificarNickname(nickname)) {
						JOptionPane.showMessageDialog(frame8,
								"Nickname incorrecto ✖\nEl nickname debe estar compuesto por caracteres anglosajones");
					} else {
						frame8.setVisible(false);
						VistaImp vistaImp = new VistaImp();

					}
				}
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(204, 231, 197));
		btnVolver.setBounds(28, 30, 100, 29);
		frame8.getContentPane().add(btnVolver);
		
		textFieldNicknameSE = new JTextField();
		textFieldNicknameSE.setBounds(159, 216, 96, 19);
		frame8.getContentPane().add(textFieldNicknameSE);
		textFieldNicknameSE.setColumns(10);
		
		textFieldNombreSE = new JTextField();
		textFieldNombreSE.setColumns(10);
		textFieldNombreSE.setBounds(159, 306, 96, 19);
		frame8.getContentPane().add(textFieldNombreSE);
		
		textFieldSuperpoderSE = new JTextField();
		textFieldSuperpoderSE.setColumns(10);
		textFieldSuperpoderSE.setBounds(159, 390, 96, 19);
		frame8.getContentPane().add(textFieldSuperpoderSE);
		
		textFieldUbicacionSE = new JTextField();
		textFieldUbicacionSE.setColumns(10);
		textFieldUbicacionSE.setBounds(486, 216, 96, 19);
		frame8.getContentPane().add(textFieldUbicacionSE);
		
		textFieldContrasenyaSE = new JTextField();
		textFieldContrasenyaSE.setColumns(10);
		textFieldContrasenyaSE.setBounds(486, 306, 96, 19);
		frame8.getContentPane().add(textFieldContrasenyaSE);
		
		textFieldContrasenyaRepetirSE = new JTextField();
		textFieldContrasenyaRepetirSE.setColumns(10);
		textFieldContrasenyaRepetirSE.setBounds(486, 390, 96, 19);
		frame8.getContentPane().add(textFieldContrasenyaRepetirSE);
		
		lblNicknameSE = new JLabel("Nickname");
		lblNicknameSE.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblNicknameSE.setBounds(163, 193, 117, 13);
		frame8.getContentPane().add(lblNicknameSE);
		
		lblNombreSE = new JLabel("Nombre");
		lblNombreSE.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblNombreSE.setBounds(159, 283, 96, 13);
		frame8.getContentPane().add(lblNombreSE);
		
		lblSuperpoderSE = new JLabel("Superpoder");
		lblSuperpoderSE.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblSuperpoderSE.setBounds(163, 367, 117, 13);
		frame8.getContentPane().add(lblSuperpoderSE);
		
		lblUbicacionSE = new JLabel("Ubicación");
		lblUbicacionSE.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblUbicacionSE.setBounds(486, 193, 113, 13);
		frame8.getContentPane().add(lblUbicacionSE);
		
		lblContrasenyaSE = new JLabel("Contraseña");
		lblContrasenyaSE.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblContrasenyaSE.setBounds(486, 283, 113, 13);
		frame8.getContentPane().add(lblContrasenyaSE);
		
		lblContrasenyaRepetirSE = new JLabel("Repetir contraseña");
		lblContrasenyaRepetirSE.setFont(new Font("Segoe Script", Font.PLAIN, 16));
		lblContrasenyaRepetirSE.setBounds(461, 367, 181, 13);
		frame8.getContentPane().add(lblContrasenyaRepetirSE);
		
		chckbxTerminos = new JCheckBox("Acepto los términos y condiciones");
		chckbxTerminos.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxTerminos.setBackground(new Color(255, 255, 255));
		chckbxTerminos.setBounds(77, 495, 203, 21);
		frame8.getContentPane().add(chckbxTerminos);
		
		chckbxAnyosCrimen = new JCheckBox("Llevo más de 14 años luchando contra el crimen");
		chckbxAnyosCrimen.setFont(new Font("Tahoma", Font.BOLD, 10));
		chckbxAnyosCrimen.setBounds(77, 450, 273, 21);
		frame8.getContentPane().add(chckbxAnyosCrimen);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame8.setVisible(false);
				VistaRegistro vistaRegistro = new VistaRegistro();
			}
		});
		
		frame8.setVisible(true);
	}
	
	// Para luego poder recogerlas desde el login
	
	public String getNickname() {
        return textFieldNicknameSE.getText();
    }

    public String getContrasenya() {
        return textFieldContrasenyaSE.getText();
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
