package exercicioAula28;

import java.text.NumberFormat;
import java.util.Locale;

public class Exercicio10 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		String str1 = "12345";
		int num1 = Integer.parseInt(str1);
		System.out.println(" a conversão de String para int é de " + num1);

		System.out.print(NumberFormat.getCurrencyInstance().format(num1));
		System.out.printf("$",num1);
		
		
System.out.println("----------------------------------------------------------------");
		
Locale.setDefault(new Locale("pt", "br"));
		String str2 = "12345";
		double num2 = Double.parseDouble(str2);
		System.out.println(" a conversão de String para double é de " + num2);
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		String resultado = nf.format(num2);

		System.out.print(resultado);
		

	}
}
