package ArraysEArrayList;

import com.fiap.view.Produto;

public class CaixaTesteArrayObjeto {

public static void main(String[] args) {
	
	//aqui são arrays unidimencionais
	//==============================================
	Produto []produto =new Produto [2];
	
	Produto prod1 =new Produto ();
	prod1.setNome("limão");
	prod1.setDescricao("esse limão é galego");
	prod1.setValor(4);
	
	Produto prod2 =new Produto();
	prod2.setNome("maçã");
	prod2.setDescricao("gala");
	prod2.setValor(5);
	
	produto [0]=prod1;
	produto[1]=prod2;
	//usando o length retorna o tamanho desse array
	for ( int i =0; i < produto.length;i++) {
		System.out.println(produto[i].toString());
	}//ao usar a impressão toString mostraremos todos da
	//classe Produto
	
	/*
	 * aqui nesse for para cada variavel do nome prod do 
	 * tipo produto no array produto imprima com o metodo
	 * carregado toString
	 */
	for (Produto prod:produto) {
		System.out.println(prod.toString());
	}
	//======================================================
	/* AQUI SE TRATA DE ARRAYS MULTI DIMENCIONAIS 
	 * nesse trecho declaramos um array localizarProduto com
	 * 2 dimensões [] [] em seguida estanciamos new produto
	 * com [10] corredores e [3] prateleira em cada corredor
	 * ou seja 30 prateleiras.
	 */
	Produto [][]localizarProduto =new Produto [10][3];
	localizarProduto[2][1]=prod1;
	localizarProduto[2][2]=prod2;
	System.out.println(localizarProduto[2][1].getNome());
	System.out.println(localizarProduto[2][1].getDescricao());
	System.out.println(localizarProduto[2][1].getValor());
	
	/*
	 * ao imprimir ele pega o produto do corredor 2 praleteira 1 e 
	 * imprime que no caso é o limão. se eu quiser mostrar
	 * o produto maça eu devo colocar corredor[2] prateleira
	 * [2] como está abaixo 
	 */
	System.out.println(localizarProduto[2][2].getNome());
	System.out.println(localizarProduto[2][2].getDescricao());
	System.out.println(localizarProduto[2][2].getValor());
}
	
	
}
