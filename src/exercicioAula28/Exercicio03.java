package exercicioAula28;

import java.lang.reflect.Method;

public class Exercicio03 {

	public static void main(String[] args) {
		System.out.println("2^10 = " + Math.pow(2, 10));
		System.out.println("Raiz quadrada de 1000 = " + Math.sqrt(1000));
		System.out.println("Valor absoluto de -10 = " + Math.abs(-10));
		System.out.println("O valor Máximo entre o número 42 e 666 é"+Math.max(42, 666));
		System.out.println("O valor Minimo entre o número 42 e 666 é "+Math.min(42, 666));
		System.out.println("O número 4,9 arendondado para cima é "+Math.ceil(6));
		System.out.println("O número 4,9 arendondado para cima é "+Math.floor(7));
		System.out.println("O calculo do Seno é" +(Math.sin(Math.toRadians(90))) +" já o Cosseno  de 90° é "+
		(Math.cos(Math.toRadians(90)))+ " e a  tangente de 45° é"+ (Math.round(Math.toRadians(45))));
	}
}