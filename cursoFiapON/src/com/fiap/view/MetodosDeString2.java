package com.fiap.view;

public class MetodosDeString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String descricao = new String ("Maça Gala,a maça mais doce do mercado!");
		System.out.println(descricao.replace("G", "g"));
		//esse metodo subsituira todos caracteres de G maiusculo
		// por g minusculos na fraze da String descricao
		
		System.out.println(descricao.replace("Gala", "Fuji"));
		// esse metodo replace também substituira palavras como por exemplo
		// a palavra Gala por a palavra Fuji
		
		System.out.println(descricao.replace("a","A"));
		// e substituiora todas as ocorrências de "a" minusculo por
		// "A" maiusculos
		
		
		System.out.println(descricao.split("").length);
		//o metodo split quebrara o delimitador ("") espaço
		// e o atributo length nos retornara quantas string
		//foram resultantes dessa quebra apartir do caractere espaço
		
		
	//	System.out.println(Arrays.toString(descricao.split("")));
//o metoso split  transformado em String por Arrays fara a 
// impressão do resultado dessa quebra
//========================================================================	
	/*
	 * tera vezes que vamos precisar transformar todos os
	 * caracteres em minúsculos ou maiúsculos 
	 * e tera vezes que vamos precisar pegar só uma trecho  da String daí usaremos 
	 * os metodos as seguir
	 */
		System.out.println("===============================================");
		//====================================================
		System.out.println(descricao.toLowerCase());
		//o metoso toLowerCase transformara todos os caracteres em 
		// minúsculos 
		
		System.out.println(descricao.toString());
		// o metodo toLowerCase transformara todos os caracteres em 
		//maiúsculos 
		System.out.println("===============================================");
	//=========================================================	
		System.out.println(descricao.substring(0,4));
		// esse metodo substring pegar um trecho de descricao
		//indo do indice  0 indo até o indice  4 
		
		System.out.println(descricao.substring(4));
		// aqui pegara do indice 4 de descricao até o final da string
		System.out.println("===============================================");
		//===========================================================	
		
		System.out.println(descricao.substring(
				descricao.indexOf("Maça"), descricao.indexOf("")));
		/*o metodo substring ira pegar o trecho que queremos procurar
		 * o indexOf dara o indice aonde começa a palavra
		 *" Maça" dentro da String descricao
		 *e o segundo indiceOf ("") ira informar a substring aonde para
		 *o corte dessa substring quando o caractere espaço 
		 *for encontrado
		 */
		System.out.println(descricao);
		
	}

}
