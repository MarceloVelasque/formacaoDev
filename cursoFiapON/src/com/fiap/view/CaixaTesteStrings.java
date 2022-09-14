package com.fiap.view;

public class CaixaTesteStrings {
	public static void main(String[] args) {
		
//modo de String 01	
 String nome;
 nome = new String();
 nome ="maça";
 System.out.println(nome);
 
 //modo de String 02
 String nome2 =new String ("Maça");
 System.out.println(nome2);

 
 //modo de String 03
 /*
  * dessa forma perceba que não é estanciado o java usa
  * um pull de memoria para armazenar maça e não uma area
  * especifica criada com o operador new para variavél nome3
  * sendo um pull compartilhado que serve como um cache na
  * plataforma java
  */
 String nome3 = "maça";
 System.out.println(nome3);
 
 /*
  * perceba que o \n faz uma qubra de linha e 
  * pocisiona o cursor no incio da segunda linha
  */
 String descricao= "tipo Gala \nA maça mais doce do mercado";
 System.out.println(descricao);
 
 
 /*
  * perceba que o \t cria um espaçamento utilizando uma 
  * tabulação
  */
 descricao="tipo gala \tA maça mais doce do mercado";
 System.out.println(descricao);
 
 /*
  * perceba que o \" nós da a condição de imprimir uma aspas 
  * duplas sem atrabalhar a atribuição que estamos fazendo
  * a nossa String descrição
  */
 descricao="tipo Gala; \"A maça mais doce do mercado\"";
 System.out.println(descricao);
 
 /*
  * exemplos de metodos de comparação de String usando o 
  * equals
  */
 
 //comparaçaõ 01
 System.out.println(nome.equals(nome2)); // da false
 //porque foi colocado dentro da String nome "maça " tudo
 //minusculo e dentro de nome2 foi colocado na String"Maça"
 //com a priemira letra maiuscula
 
 System.out.println(nome.equalsIgnoreCase(nome2));// deu true
 //aqui esse metodo equalsIgnoreCase vai ignorar as diferenças 
 //entre os caracteres maiusculos e minusculos fazendo com que
 // o resultado retorne verdadeiro
 
 System.out.println(nome.equals(nome3));//true
 // aqui vai da veradadeiro porque ele compara nome "maça" tudo
 //minusculo com nome3 "maça" que também é tudo minusculo 
 
 boolean teste = (nome== nome3);
 System.out.println(teste);//false
 /*
  * aqui mesmo elas tento o mesmo conteúdo a comparação da false
  * porque? porque o sinal == não está comparando o conteúdo
  * da String e sim a posição dela em um derterminado lugar da 
  * memória
  */
 
 
 String nome4 ="maça";
 String nome5= "maça";
 
 teste = (nome4 == nome5);
 System.out.println(teste);//true
 /*
  * aqui tera o mesmo resultado que a primera
  * por ser um comparativo quase igual com nome4 e nome5
  * criadas, a difernça é que 
  * que não foram instanciadas 
  */
}
}
