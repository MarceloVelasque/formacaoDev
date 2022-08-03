package exercicioAula23;

import java.util.ArrayList;
import java.util.Scanner;

import exercicioAula24.Pagamento;
import exercicioAula24.Produto;
import exercicioAula24.Venda;

public class Mercadinho {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		Produto produto2 = new Produto();
		Produto produto3 = new Produto();
		Produto produto4 = new Produto();

		Pagamento pag = new Pagamento();

		Venda venda = new Venda();

		produto1.setNome("carne patinho");
		produto1.setPreco(35.5);
		produto1.setQuantidadeEstoque(6);

		produto2.setNome("guarana");
		produto2.setPreco(4.82);
		produto2.setQuantidadeEstoque(100);

		produto3.setNome("cerveja");
		produto3.setPreco(4.77);
		produto3.setQuantidadeEstoque(200);

		produto4.setNome("arroz");
		produto4.setPreco(15);
		produto4.setQuantidadeEstoque(20);

		System.out.println("PRODUTOS EM ESTOQUE");
		System.out.println("Produto 1: " + produto1.getQuantidadeEstoque());
		System.out.println("Produto 2: " + produto2.getQuantidadeEstoque());
		System.out.println("Produto 3: " + produto3.getQuantidadeEstoque());
		System.out.println("Produto 4: " + produto4.getQuantidadeEstoque());

		System.out.println();

		venda.adicionarItemVenda(produto1);
		venda.adicionarItemVenda(produto2);
		venda.adicionarItemVenda(produto3);
		venda.adicionarItemVenda(produto4);
		pag.selecionarTipoPagamento(1);

		System.out.println("PRODUTOS VENDIDO ");
		venda.visualizarVenda();

		System.out.println("FORMAS DE PAGAMENTO");
		venda.concluirVenda(pag);
	}

}
