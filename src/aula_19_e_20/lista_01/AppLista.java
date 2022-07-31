package aula_19_e_20.lista_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AppLista {

	private JFrame frame;
	private JTextField txtidade;
	private JTextField txtnota1;
	private JTextField txtnota2;
	private JTextField txtnota3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppLista window = new AppLista();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AppLista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		frame.getContentPane().add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("New tab", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("digite a idada do aluno");
		lblNewLabel_1.setBounds(49, 26, 123, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("digite a priemira nota do aluno");
		lblNewLabel_1_1.setBounds(49, 68, 161, 14);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("digite a segunda nota do aluno");
		lblNewLabel_1_2.setBounds(55, 109, 161, 14);
		panel.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("digite a terceira nota do aluno");
		lblNewLabel_1_2_1.setBounds(55, 155, 153, 14);
		panel.add(lblNewLabel_1_2_1);
		
		txtidade = new JTextField();
		txtidade.setBounds(220, 23, 86, 20);
		panel.add(txtidade);
		txtidade.setColumns(10);
		
		txtnota1 = new JTextField();
		txtnota1.setColumns(10);
		txtnota1.setBounds(220, 65, 86, 20);
		panel.add(txtnota1);
		
		txtnota2 = new JTextField();
		txtnota2.setColumns(10);
		txtnota2.setBounds(222, 106, 86, 20);
		panel.add(txtnota2);
		
		txtnota3 = new JTextField();
		txtnota3.setColumns(10);
		txtnota3.setBounds(222, 152, 86, 20);
		panel.add(txtnota3);
		
		JButton btnNewButton = new JButton("CALCULAR MÉDIA");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Float nota1 = Float.parseFloat(txtnota1.getText());
				Float nota2 = Float.parseFloat(txtnota2.getText());
				Float nota3 = Float.parseFloat(txtnota3.getText());
				Float media = (nota1 + nota2 + nota3) / 3;
								JOptionPane.showMessageDialog( null, " a primeira nota é "+""+nota1+"" + "a segunda nota é "+""+nota2+""
										+ "a terceira nota é "+""+nota3+""+"sua media é "+ media);
			}
		});
		btnNewButton.setBounds(217, 199, 131, 23);
		panel.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_2, null);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_3, null);
		
		JLabel lblNewLabel = new JLabel("Exercício 01");
		panel_3.add(lblNewLabel);
	}
}
