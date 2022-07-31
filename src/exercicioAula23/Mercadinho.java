package exercicioAula23;

import java.util.ArrayList;
import java.util.Scanner;

public class Mercadinho {

	public static void main(String[] args) {
		int escolha = 0;
		Scanner ler = new Scanner(System.in);
		System.out.println("BEM VINDO AO NOSSO APLICATIVOS DE COMPRA");
		System.out.println(" O ESTOQUE DOS PRODUTOS SÃO");
		ArrayList<Produto> estoque = new ArrayList<Produto>();
		estoque.add(new Produto("feijão", 12D, 34));
		estoque.add(new Produto("macarrão", 5D, 30));
		estoque.add(new Produto("arroz", 14D, 40));
		estoque.add(new Produto("carne ", 34D, 10));
		estoque.add(new Produto("sal", 10D, 55));

		for (int i = 0; i < estoque.size(); i++) {
			System.out.println("" + estoque.get(i));
		}

		Venda venda1 = new Venda();
		System.out.println("");
		

		System.out.println("--------------------------------------------");
		System.out.println("SIGA O MENU PARA EXCOLHER O PRODUTO QUE DESEJA COMPRAR");
		System.out.println("DIGITE 1 PARA COMPRAR FEIJÃO");
		System.out.println("DIGITE 2 PARA COMPRAR MACARRÃO");
		System.out.println("DIGITE 3 PARA COMPRAR ARROZ");
		System.out.println("DIGITE 4 PARA COMPRAR CARNE");
		System.out.println("DIGITE 5 PARA COMPRAR SAL");
		System.out.println("DIGITE UMA DAS OPÇÕES");
		
	switch (venda1.getListaVenda()) {
		case 1:
			System.out.println("VOCÊ ESCOLHEU COMPRAR FEIJÃO");
			break;
		case 2:
			System.out.println("VOCÊ ESCOLHEU COMPRAR MACARRÃO");
			break;
		case 3:
			System.out.println("VOCÊ ESCOLHEU COMPRAR ARROZ");
			break;
		case 4:
			System.out.println("VOCÊ ESCOLHEU COMPRAR CARNE");
			break;
		case 5:
			System.out.println("VOCÊ ESCOLHEU COMPRAR SAL");
			break;

		}
		Pagamento pagamento = new Pagamento();
		System.out.println("adicione o tipo de pagaemnto");
		pagamento.selecionarTipoPagamento(ler.nextInt());
		
       

	
	}

}
