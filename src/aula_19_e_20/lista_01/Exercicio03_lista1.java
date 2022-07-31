package aula_19_e_20.lista_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.Window.Type;
import java.awt.SystemColor;

public class Exercicio03_lista1 {

	private JFrame frmBancoDoProgramador;
	private JTextField txtnumero;
	private JTextField txttipo;
	private JTextField txttitular;
	private JTextField txtdepositar;
	private JTextField txtsacar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Exercicio03_lista1 window = new Exercicio03_lista1();
					window.frmBancoDoProgramador.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Exercicio03_lista1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBancoDoProgramador = new JFrame();
		frmBancoDoProgramador.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		frmBancoDoProgramador.setTitle("BANCO DO PROGRAMADOR");
		frmBancoDoProgramador.setBounds(100, 100, 532, 337);
		frmBancoDoProgramador.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBancoDoProgramador.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NÚMERO DA CONTA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(20, 28, 118, 14);
		frmBancoDoProgramador.getContentPane().add(lblNewLabel);
		
		JLabel lblTipoDaConta = new JLabel("TIPO DA CONTA");
		lblTipoDaConta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTipoDaConta.setBounds(20, 66, 118, 14);
		frmBancoDoProgramador.getContentPane().add(lblTipoDaConta);
		
		JLabel lblTitularDaConta = new JLabel("TITULAR DA CONTA");
		lblTitularDaConta.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTitularDaConta.setBounds(20, 106, 118, 14);
		frmBancoDoProgramador.getContentPane().add(lblTitularDaConta);
		
		txtnumero = new JTextField();
		txtnumero.setBounds(148, 25, 86, 20);
		frmBancoDoProgramador.getContentPane().add(txtnumero);
		txtnumero.setColumns(10);
		
		txttipo = new JTextField();
		txttipo.setBounds(148, 63, 86, 20);
		frmBancoDoProgramador.getContentPane().add(txttipo);
		txttipo.setColumns(10);
		
		txttitular = new JTextField();
		txttitular.setBounds(148, 103, 86, 20);
		frmBancoDoProgramador.getContentPane().add(txttitular);
		txttitular.setColumns(10);
		
		txtdepositar = new JTextField();
		txtdepositar.setBounds(368, 60, 86, 20);
		frmBancoDoProgramador.getContentPane().add(txtdepositar);
		txtdepositar.setColumns(10);
		
		txtsacar = new JTextField();
		txtsacar.setBounds(368, 144, 86, 20);
		frmBancoDoProgramador.getContentPane().add(txtsacar);
		txtsacar.setColumns(10);
		
		JButton btndepositar = new JButton("DEPOSITAR");
		btndepositar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float saldo = 0;
				float depositar= Float.parseFloat(txtdepositar.getText());
				saldo += + depositar;
				JOptionPane.showMessageDialog(null,"R$"+ saldo);				
			}
		});
		btndepositar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btndepositar.setBounds(368, 24, 97, 23);
		frmBancoDoProgramador.getContentPane().add(btndepositar);
		
		JButton btnsacar = new JButton("SACAR");
		btnsacar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float saldo = 0;
				float sacar= Float.parseFloat(txtsacar.getText());
				saldo += - sacar;
				JOptionPane.showMessageDialog(null,"R$"+ saldo);
			}
		});
		btnsacar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnsacar.setBounds(365, 102, 89, 23);
		frmBancoDoProgramador.getContentPane().add(btnsacar);
		
		JButton btnlimpar = new JButton("LIMPAR");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtnumero.setText(null);
				txttipo.setText(null);
				txttitular.setText(null);
				txtdepositar.setText(null);
				txtsacar.setText(null);
				
				
				
			
			}
		});
		btnlimpar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnlimpar.setBounds(10, 264, 86, 23);
		frmBancoDoProgramador.getContentPane().add(btnlimpar);
		
		JButton btnfechar = new JButton("FECHAR");
		btnfechar.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnfechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnfechar.setBounds(417, 264, 89, 23);
		frmBancoDoProgramador.getContentPane().add(btnfechar);
		
		JButton btnconsultar = new JButton("CONSULTAR CONTA");
		btnconsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			float numeroconta = Float.parseFloat(txtnumero.getText());
			float tipoconta= Float.parseFloat(txttipo.getText());
			float titular=Float.parseFloat(txttitular.getText());
			float  saldo = Float.parseFloat(txtdepositar.getSelectedText()+txtsacar.getText());
			
			JOptionPane.showMessageDialog(null,"o número da conta é" +numeroconta +"o tipo da conta é" +tipoconta+
				"o titular da conta é "+	titular + "seu saldo é "+"R$"+saldo);
		
			
			
		
			
			}
		});
		btnconsultar.setBackground(SystemColor.inactiveCaption);
		btnconsultar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		btnconsultar.setBounds(169, 143, 156, 23);
		frmBancoDoProgramador.getContentPane().add(btnconsultar);
		
		JLabel lblconsultar = new JLabel("");
		lblconsultar.setFont(new Font("Tahoma", Font.PLAIN, 8));
		lblconsultar.setBounds(113, 175, 294, 112);
		frmBancoDoProgramador.getContentPane().add(lblconsultar);
		
	}
}
