package com.fiap.view;

public class MetosDeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String descricao = new String ("Maça Gala,a maça mais doce do mercado!");
		 System.out.println(descricao.length());
		 // o metodo length retornara o tamanho da string
		 
		 System.out.println(descricao.startsWith("Maça"));
		 //se quisermos saber se a String começa com 
		 // "maça" usamos o metodo startsWith que nos mostrara
		 
		 System.out.println(descricao.endsWith("!"));
		 // se quisermos saber se essa String finaliza com
		// uma escramação! então usamos o metodo ensWith ("!") )
		 
		 System.out.println(descricao.charAt(1));
		 // se quisermos saber qual string se encontra na
		 //primera posicao usamos o charAt (1) colocando dentro
		 //() a condição como a string começa sempre em zero
		 // teremos o retorno da letra a de maça
		 
		 System.out.println(descricao.indexOf("G"));
		 // o indexOf nos retornara o indice da posição do caracter "G" 
		 
		 System.out.println(descricao.lastIndexOf("a"));
		 // o lastIndexOf nos retornara o indice da posição da 
		 //ultima ocorrência do caracter a dentro da String
		 //descrição
	}

}
