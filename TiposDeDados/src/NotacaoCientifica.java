import java.text.DecimalFormat;

public class NotacaoCientifica {
	public static void main(String[] args) {
		double numero = 1.23e2;
		System.out.println(numero)
		//transforma um número ao quadrado "e2;" significa que é o número da 
		//sequencia  1.23 elevado "e2;" ao quadrado

		numero = 123;
		DecimalFormat f = new DecimalFormat("0.#####E0");
		System.out.println(f.format(numero)); 
		// o mesmo processo só que inverso usando a função 
		//DecimalFormat f = new DecimalFormat("0.#####E0");
		//um número e exemplo acima 123; 
		// e transforma ao quadrado colocando no final de 123 o e2;
		//que sefnifica elevado ao quadrado
	}
}
