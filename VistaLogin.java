package SuperPrestamosSA;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import java.awt.Color;

public class VistaLogin extends JFrame implements Vista{
	public VistaLogin() {
		
		JFrame frame2 = new JFrame("Ventana Login");
		frame2.getContentPane().setBackground(new Color(151, 192, 109));
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setBounds(100, 100, 800, 600);
		frame2.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("LOG IN");
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		lblTitulo.setBounds(324, 47, 143, 95);
		frame2.getContentPane().add(lblTitulo);
		
		JButton btnLoginAdmin = new JButton("INICIAR SESIÓN COMO ADMINISTRADOR");
		btnLoginAdmin.setBackground(new Color(204, 231, 197));
		btnLoginAdmin.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnLoginAdmin.setBounds(194, 212, 410, 47);
		frame2.getContentPane().add(btnLoginAdmin);
		btnLoginAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				VistaRegistroAdmin vistaRegistroAdmin = new VistaRegistroAdmin();
				vistaRegistroAdmin.setVisible(false);
				VistaLoginAdmin vistaLoginAdmin = new VistaLoginAdmin();

//				vistaLoginAdmin.setVisible(true);
			}
		});
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(204, 231, 197));
		btnVolver.setBounds(28, 30, 100, 29);
		frame2.getContentPane().add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				VistaImp vistaImp = new VistaImp();
			}
		});
		
		
		JButton btnLoginSE = new JButton("INICIAR SESIÓN COMO SUPEREMPRESA");
		btnLoginSE.setBackground(new Color(204, 231, 197));
		btnLoginSE.setFont(new Font("Segoe Script", Font.PLAIN, 15));
		btnLoginSE.setBounds(194, 323, 410, 47);
		frame2.getContentPane().add(btnLoginSE);
		btnLoginSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame2.setVisible(false);
				VistaLoginSE vistaLoginSE = new VistaLoginSE();
//				vistaLoginSE.setVisible(true);
			}
		});
		
		frame2.setVisible(true);
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
