package SuperPrestamosSA;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VistaRecursos extends JFrame implements Vista{
	
	public VistaRecursos() {

		JFrame frame5 = new JFrame("Ventana Recursos");
		frame5.getContentPane().setBackground(new Color(151, 192, 109));
		frame5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame5.setBounds(100, 100, 868, 605);
		getContentPane().setLayout(null);
		frame5.getContentPane().setLayout(null);

		JLabel lblTitulo = new JLabel("RECURSOS");
		lblTitulo.setBounds(317, 40, 193, 106);
		lblTitulo.setFont(new Font("Segoe Script", Font.PLAIN, 30));
		frame5.getContentPane().add(lblTitulo);
		
		JButton btnTomarRecurso = new JButton("TOMAR RECURSO");
		btnTomarRecurso.setBackground(new Color(204, 231, 197));
		btnTomarRecurso.setFont(new Font("Segoe Script", Font.PLAIN, 13));
		btnTomarRecurso.setBounds(310, 168, 200, 50);
		frame5.getContentPane().add(btnTomarRecurso);
		
		JButton btnDejarRecurso = new JButton("DEJAR RECURSO");
		btnDejarRecurso.setFont(new Font("Segoe Script", Font.PLAIN, 13));
		btnDejarRecurso.setBackground(new Color(204, 231, 197));
		btnDejarRecurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDejarRecurso.setBounds(310, 252, 200, 50);
		frame5.getContentPane().add(btnDejarRecurso);
		
		JButton btnRecursosDisp = new JButton("VER RECURSOS DISPONIBLES");
		btnRecursosDisp.setBackground(new Color(204, 231, 197));
		btnRecursosDisp.setFont(new Font("Segoe Script", Font.PLAIN, 13));
		btnRecursosDisp.setBounds(277, 431, 264, 50);
		frame5.getContentPane().add(btnRecursosDisp);
		
		JButton btnRegistroRecurso = new JButton("REGISTRAR RECURSO");
		btnRegistroRecurso.setBackground(new Color(204, 231, 197));
		btnRegistroRecurso.setFont(new Font("Segoe Script", Font.PLAIN, 13));
		btnRegistroRecurso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnRegistroRecurso.setBounds(310, 333, 200, 50);
		frame5.getContentPane().add(btnRegistroRecurso);
		
		JButton btnVolver = new JButton("Volver");
		btnVolver.setFont(new Font("Segoe Print", Font.PLAIN, 13));
		btnVolver.setBackground(new Color(204, 231, 197));
		btnVolver.setBounds(28, 30, 100, 29);
		frame5.getContentPane().add(btnVolver);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame5.setVisible(false);
				VistaLoginAdmin vistaLoginAdmin = new VistaLoginAdmin();
			}
		});
		
		frame5.setVisible(true);
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
