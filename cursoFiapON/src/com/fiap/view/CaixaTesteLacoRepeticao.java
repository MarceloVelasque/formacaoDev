package com.fiap.view;

public class CaixaTesteLacoRepeticao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdproduto = 5;
		int registro =0;
		/*
		 * laço de repetição while aqui temos um contador
		 * que se chama registro, dentrp de parenteses eu
		 * especifico uma condição e o contadoor vai receber
		 * +1 toda vez que se repetir até ele cumprir a 
		 * condição estabelecida 
		 */
		while (registro <qtdproduto) {
			registro++;
			System.out.println("o produto número"+registro+"foi registrado");
		}
		
		
		
		
		/*
		 * o do while é quase mesma coisa que o while 
		 * pois ele vai se repetir até que uma condição
		 * seja atendida com a diferença que a condição
		 * é conferida no final do código rodado então ele lê 
		 * todo o código só depois verifica se está 
		 * atendendo a condição
		 */
		do {
			registro++;
			System.out.println("a quantidade de registro é"+qtdproduto);
		} while (registro <qtdproduto);
		
		
		
		
		
		/*
		 * usamos o for quando sabemos a condição ou temos
		 * predetermiando a quantidade que queremos que repita
		 * até que atenda a condição
		 */
	for ( int m =0 ; m < qtdproduto;m++) {
		System.out.println("o registro é "+registro);
	}

	}
	}
