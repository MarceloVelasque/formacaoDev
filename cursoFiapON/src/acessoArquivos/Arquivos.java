package acessoArquivos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class Arquivos {

	private static void gravarEstoque (String nomeDoArquivo, String caminho,List<String> conteudo) {
		FileWriter stream;
		PrintWriter print = null;
		
		try {
			//strem é uma conexão de escrita para o arquivo
			stream = new FileWriter(caminho);
		//a classe PrintWriter escreverá no arquivo
			for (String linha:conteudo) {
			print.println(linha);
		}
		//close fecha o arquivo
		print.close();
		stream.close();
		System.out.println("o arquivo"+nomeDoArquivo+"foi salvo em "+caminho);
	} catch (IOException e) {
		e.printStackTrace();
	}
	}}
