package execptions;

import java.util.ArrayList;
import java.util.List;

public class TesteArquivo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomeDoArquivo = "estoque.csv";
		String diretorio = System.getProperty("user.home");
		String caminho = diretorio + "\\" + nomeDoArquivo;

		List<String> conteudo = new ArrayList<>();
		conteudo.add("Produto; Quantidade; Unidade de Medida; Valor da unidade");
		conteudo.add("Pera; 200; pct; R$5,40");
		conteudo.add("Morango; 400; cx ; R$6,50");
		conteudo.add("Abacaxi; 280; Un; R$5,00");
		
		gravarEstoque(nomeDoArquivo,caminho, conteudo);
		lerEstoque(caminho);
	}

	private static void gravarEstoque(String nomeDoArquivo, String caminho, List<String> conteudo) {
		// TODO Auto-generated method stub
		
	}

	private static void lerEstoque(String caminho) {
		// TODO Auto-generated method stub
		
	}

	
	}


