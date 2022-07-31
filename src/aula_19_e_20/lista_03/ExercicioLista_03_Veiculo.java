package aula_19_e_20.lista_03;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.xml.parsers.ParserConfigurationException;

import java.awt.Font;

public class ExercicioLista_03_Veiculo {

	private JFrame frame;
	private JTextField txtano;
	private JTextField txtmodelo;
	private JTextField txtcor;
	private JTextField txtquilometragem;
	private JTextField txtmudarcor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioLista_03_Veiculo window = new ExercicioLista_03_Veiculo();
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
	public ExercicioLista_03_Veiculo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 482, 319);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ANO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(37, 24, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblModelo = new JLabel("MODELO");
		lblModelo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblModelo.setBounds(37, 71, 46, 14);
		frame.getContentPane().add(lblModelo);
		
		JLabel lblCor = new JLabel("COR");
		lblCor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblCor.setBounds(37, 120, 46, 14);
		frame.getContentPane().add(lblCor);
		
		JLabel lblQuilometragem = new JLabel("QUILOMETRAGEM");
		lblQuilometragem.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblQuilometragem.setBounds(10, 168, 115, 14);
		frame.getContentPane().add(lblQuilometragem);
		
		JButton btnNewButton = new JButton("MUDAR COR");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cor =txtcor.getText();
				String mudarcor = txtmudarcor.getText();
		JOptionPane.showMessageDialog(null," sua cor atual"+ " é"+"" + ""+cor+""+"sua nova cor é "+mudarcor );
				
			}
		});
		btnNewButton.setBounds(257, 164, 167, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnexibircor = new JButton("EXIBIR COR");
		btnexibircor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		    String cor=txtcor.getText();
		    JOptionPane.showMessageDialog(null, txtcor.getText());
			}
		});
		btnexibircor.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnexibircor.setBounds(253, 67, 171, 23);
		frame.getContentPane().add(btnexibircor);
		
		JButton btbverificar = new JButton("VERIFICAR MANUTANÇÃO");
		btbverificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int quilometragem =Integer.parseInt( txtquilometragem.getText());
				
				if (quilometragem < 25000) {
					JOptionPane.showMessageDialog(null, " tudo ok");
					
				} else if (quilometragem>=25000 && quilometragem < 75000) {
					JOptionPane.showMessageDialog(null, "precisa realizar a manutanção");
				} else {
				
					JOptionPane.showMessageDialog(null, "por favor faça a manutanção completa");
				
				}
					
			}
			
		});
		btbverificar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btbverificar.setBounds(253, 20, 181, 23);
		frame.getContentPane().add(btbverificar);
		
		txtano = new JTextField();
		txtano.setBounds(122, 21, 86, 20);
		frame.getContentPane().add(txtano);
		txtano.setColumns(10);
		
		txtmodelo = new JTextField();
		txtmodelo.setColumns(10);
		txtmodelo.setBounds(122, 68, 86, 20);
		frame.getContentPane().add(txtmodelo);
		
		txtcor = new JTextField();
		txtcor.setColumns(10);
		txtcor.setBounds(122, 117, 86, 20);
		frame.getContentPane().add(txtcor);
		
		txtquilometragem = new JTextField();
		txtquilometragem.setColumns(10);
		txtquilometragem.setBounds(122, 165, 86, 20);
		frame.getContentPane().add(txtquilometragem);
		
		JLabel lblDigiteACor = new JLabel("DIGITE A COR PARA MUDAR");
		lblDigiteACor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDigiteACor.setBounds(257, 101, 167, 14);
		frame.getContentPane().add(lblDigiteACor);
		
		txtmudarcor = new JTextField();
		txtmudarcor.setBounds(294, 126, 86, 20);
		frame.getContentPane().add(txtmudarcor);
		txtmudarcor.setColumns(10);
	}
}
