package ArraysEArrayList;

public class Arrays {
	public static void main(String[] args) {
		
		/*
		 * aqui temos um dos tipos de arrays aonde colocamos
		 * a quantidade que queremos dentro de [] no caso aqui
		 * é 5 vezes e tremos que declarar valores para os 5
		 * valores 0 recebendo 10 assim por diante 
		 */
		float valores [] = new float[5];
		valores[0] = 10;
		valores[1] = 20;
		valores[2] = 30;
		valores[3] = 40;
		valores[4] = 50;
		System.out.println(valores[1]);
		
		
		/*
		 * esse tipo de array já estanciamos e colocamos os valores
		 * já na quantidade que queremos sem precisar colocar 
		 * a quantidade e depois colocar valores em cada um
		 * os valores são colocados diretos e quantidade que pretende.
		 */
		float [] valores1 = new float[] {10,20,30,40,50};
		System.out.println(valores1[4]);
		
		
		/*
		 * aqui não estanciamos más declaramos os valores já 
		 * ao invés de colocarmos a quantidade e depois colocarmos
		 * os valores em cada um a diferença do que está a cima é
		 * que não está estanciado 
		 */
		float [] valores2 = {10,20,30,40,50};
		System.out.println(valores2[4]);
		
		
		/*
		 * esses exemplos de array são do tipo primitivos sendo 
		 * possivél apenas colovar int, float, byte,char, boolean
		 */
	}
}
