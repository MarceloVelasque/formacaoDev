package aapp;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import dao.ProdutoDAO;
import modelo.Produto;

public class Principal {

	public static void main(String[] args) {
		SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
		NumberFormat fm = NumberFormat.getCurrencyInstance();

		ProdutoDAO dao = new ProdutoDAO();

		Produto prod = new Produto(2, "notebook",null, null, null);
		dao.adicionar(prod);
		dao.alterar(prod);
		dao.excluir(3);

		List<Produto> lista = dao.listarTodos();

		System.out.println("Lista de Produtos");
		System.out.println("-----------------");

		for (Produto produto : lista) {
			System.out.println("Id...........: " + produto.getIdProd());
			System.out.println("Nome produto.: " + produto.getNomeProd());
			System.out.println("Data cadastro: " + fd.format(produto.getDataCadastro()));
			System.out.println("Quantidade...: " + produto.getQuantidade());
			System.out.println("Preço........: " + fm.format(produto.getPreco()));
			System.out.println();
		}
	}

}