package exercicioAula24;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class ExercicioAula24 {

	private JFrame frame;
	private JTextField txtvenda;
	private JTextField txtpagamento;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExercicioAula24 window = new ExercicioAula24();
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
	public ExercicioAula24() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 548, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblVenda = new JLabel("ADICIONE OS PRODUTOS DO ESTOQUE");
		lblVenda.setBounds(68, 49, 209, 14);
		frame.getContentPane().add(lblVenda);
		
		JLabel lblFormasDePagamento = new JLabel("FORMAS DE PAGAMENTO");
		lblFormasDePagamento.setBounds(113, 105, 123, 14);
		frame.getContentPane().add(lblFormasDePagamento);
		
		txtvenda = new JTextField();
		txtvenda.setBounds(78, 74, 184, 20);
		frame.getContentPane().add(txtvenda);
		txtvenda.setColumns(10);
		
		txtpagamento = new JTextField();
		txtpagamento.setBounds(111, 123, 135, 20);
		frame.getContentPane().add(txtpagamento);
		txtpagamento.setColumns(10);
		
		JButton btnlimpar = new JButton("LIMPAR");
		btnlimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtvenda.setText(null);
				txtpagamento.setText(null);
			}
			
		});
		btnlimpar.setBounds(77, 174, 89, 23);
		frame.getContentPane().add(btnlimpar);
		
		JButton btnrealizar = new JButton("REALIZAR COMPRA");
		btnrealizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnrealizar.setBounds(228, 174, 135, 23);
		frame.getContentPane().add(btnrealizar);
		
		JButton btncancelar = new JButton("CANCELAR");
		btncancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btncancelar.setBounds(412, 174, 89, 23);
		frame.getContentPane().add(btncancelar);
		
		JButton btnestoque = new JButton("CONFERIR ESTOQUE");
		btnestoque.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			ArrayList<String> estoque= new ArrayList<String>();
			estoque.add("	[PRODUTO cerveja]---[VALOR R$4,40]---[ESTOQUE 45 ] ");
			estoque.add("	[PRODUTO carne patinho]---[VALOR R$56]---[ESTOQUE 10 ] ");
			estoque.add("	[PRODUTO guarana ]---[VALOR R$4,505]---[ESTOQUE 100 ] ");
			estoque.add("	[PRODUTO arroz]---[VALOR R$15,99]---[ESTOQUE 50 ] ");
			JOptionPane.showMessageDialog(null, "os produtos em estoque são "+estoque);
			}
		});
		btnestoque.setBounds(184, 11, 159, 23);
		frame.getContentPane().add(btnestoque);
		
		JButton btnvendido = new JButton("ADICIONAR PARA COMPRA");
		btnvendido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String venda=(txtvenda.getText());
				switch (venda) {
				case "feijão":
					System.out.println("você escolheu comprar feijão");
				break;
				case "carne":
					System.out.println("você escolheu comprar carne");
					break;
				case "cerveja":
					System.out.println("você escolheu comprar cerveja");
					break;
				case "arroz":
					System.out.println("você escolheu comprar arroz");
					break;
				}
			}
		});
		btnvendido.setBounds(272, 73, 167, 23);
		frame.getContentPane().add(btnvendido);
		
		JButton btnpagamento = new JButton("TIPO DE PAGAMENTO");
		btnpagamento.setBounds(280, 122, 159, 23);
		frame.getContentPane().add(btnpagamento);
	}
}
