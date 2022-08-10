package exercicioAula28;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("OLÁ SEJA BEM VINDO A SAÚDE D+");
		System.out.println("--------------------------------");
		System.out.println("POR FAVOR DIGITE SEU PESO");
		double peso = ler.nextDouble();
		System.out.println("----------------------------");
		System.out.println("AGORA DIGITE SUA ALTURA");
		double altura = ler.nextDouble();
		

		double imc = peso / Math.pow(altura, 2);
		
		if (imc < 18.5) {
			System.out.println("seu IMC é de   " + imc + "   você está com indice de magreza");
		} else if (imc >= 18.5 && imc <= 27.9) {
			System.out.println("seu IMC é de   " + imc + "   seu peso está normal como deve ser");
		} else if (imc >= 25 && imc <= 29.9) {
			System.out.println("seu IMC é de   " + imc + "   atenção você está com sobrepeso");
		} else if (imc >= 30 && imc <= 39.9) {
			System.out.println("seu IMC é de   " + imc + "   cuidado você já está com obesidade");
		} else {
			System.out.println("seu IMC é de   " + imc + "   atenção redobrada obesidade grave procure um médico");
		}

	}
}
