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
import javax.swing.JTextArea;
import java.awt.Font;

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
		frame.setBounds(100, 100, 602, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblVenda = new JLabel("ADICIONE OS PRODUTOS DO ESTOQUE");
		lblVenda.setBounds(20, 77, 211, 14);
		frame.getContentPane().add(lblVenda);

		JLabel lblFormasDePagamento = new JLabel("FORMAS DE PAGAMENTO");
		lblFormasDePagamento.setBounds(60, 126, 142, 14);
		frame.getContentPane().add(lblFormasDePagamento);

		txtvenda = new JTextField();
		txtvenda.setBounds(235, 74, 110, 20);
		frame.getContentPane().add(txtvenda);
		txtvenda.setColumns(10);

		txtpagamento = new JTextField();
		txtpagamento.setBounds(210, 123, 135, 20);
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

				ArrayList<String> estoque = new ArrayList<String>();
				estoque.add("	[PRODUTO cerveja]---[VALOR R$4,40]---[ESTOQUE 45 ] ");
				estoque.add("	[PRODUTO carne patinho]---[VALOR R$56]---[ESTOQUE 10 ] ");
				estoque.add("	[PRODUTO guarana ]---[VALOR R$4,505]---[ESTOQUE 100 ] ");
				estoque.add("	[PRODUTO arroz]---[VALOR R$15,99]---[ESTOQUE 50 ] ");
				JOptionPane.showMessageDialog(null, "os produtos em estoque são " + estoque);
			}
		});
		btnestoque.setBounds(417, 7, 159, 23);
		frame.getContentPane().add(btnestoque);

		JButton btnvendido = new JButton("ADICIONAR PARA COMPRA");
		btnvendido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float venda = Float.parseFloat(txtvenda.getText());
				if (venda == 1) {

					JOptionPane.showMessageDialog(null, "você escolheu comprar garana");
					venda += +4.50;
				} else if (venda == 2) {
					JOptionPane.showMessageDialog(null, "você escolheu comprar carne");
					venda += +56;
				} else if (venda == 3) {
					JOptionPane.showMessageDialog(null, "você escolheu comprar cerveja");
					venda += +4.40;
				} else if (venda == 4) {

					JOptionPane.showMessageDialog(null, "você escolheu comprar arroz");
					venda += +15.99;
				} else {
					JOptionPane.showMessageDialog(null, "escolha inválida confira o estoque");

				}
			}
		});
		btnvendido.setBounds(355, 73, 167, 23);
		frame.getContentPane().add(btnvendido);

		JButton btnpagamento = new JButton("TIPO DE PAGAMENTO");
		btnpagamento.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				float pagamento = Float.parseFloat(txtpagamento.getText());
				float venda = Float.parseFloat(txtvenda.getText());
				if (pagamento == 1) {
					JOptionPane.showMessageDialog(null, "você escolheu pagar no dinheiro");
				} else if (pagamento == 2) {
					JOptionPane.showMessageDialog(null, "você escolheu pagar no cheque");

				} else if (pagamento == 3) {
					JOptionPane.showMessageDialog(null, "você escolheu pagar no cartão");
				} else {
					JOptionPane.showMessageDialog(null, "tipo de pagemento inválido tente dinheiro,cheque ou cartão");

				}
				if (venda == 1) {
					venda += +4.50;
					JOptionPane.showMessageDialog(null, "você pagara R$" + venda);
				} else if (venda == 2) {
					venda += +56;
					JOptionPane.showMessageDialog(null, "você pagara R$" + venda);
				} else if (venda == 3) {
					venda += +4.40;
					JOptionPane.showMessageDialog(null, "você pagara R$" + venda);
				} else if (venda == 4) {
	
				venda += +15.99;
				JOptionPane.showMessageDialog(null, "você pagara R$" + venda);
			} else {
				JOptionPane.showMessageDialog(null,"opção inválida");
			}

			 
			}});
		btnpagamento.setBounds(355, 122, 159, 23);
		frame.getContentPane().add(btnpagamento);
		
		JLabel lblNewLabel = new JLabel("DIGITE 1 PARA DINHEIRO, 2 PARA CHEQUE E 3 PARA PAGAR NO CARTÃO");
		lblNewLabel.setFont(new Font("Sitka Text", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setBounds(50, 102, 451, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("DIGITE 1  PARA ADICIOANR O PRIMEIRO PRODUTO DO ESTOQUE");
		lblNewLabel_1.setBounds(34, 11, 359, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("DIGITE 3  PARA ADICIOANR O TERCEIRO PRODUTO DO ESTOQUE");
		lblNewLabel_1_1.setBounds(34, 37, 369, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("DIGITE 4  PARA ADICIOANR O QUARTO PRODUTO DO ESTOQUE");
		lblNewLabel_1_2.setBounds(34, 52, 379, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("DIGITE 2  PARA ADICIOANR O SEGUNDO PRODUTO DO ESTOQUE");
		lblNewLabel_1_3.setBounds(34, 22, 369, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
	}
}
