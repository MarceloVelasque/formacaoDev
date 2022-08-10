public class ConverteStringParaNumero {

	public static void main(String[] args) {
		String str1 = "123";
		int num1 = Integer.parseInt(str1);
		System.out.println(num1);
		
		String str2 = "456.78f";
		float num2 = Float.parseFloat(str2);
		System.out.println(num2);
		
		String str3 = "789.01";
		double num3 = Double.parseDouble(str3);
		System.out.println(num3);
		// nesses exercicios é feito a conversão de String para números 
		//usando o objeto  seguida do parse como exemplo acima
		//String str3 = "789.01"; declaro como String o que está entre ""
		//double num3 = Double.parseDouble(str3); aqui foi escolhido transformar
		// para double, então dou um nome double num3 e já uso a função Double.parseDouble
		// double num3 = Double.parseDouble(str3);observe que foi recebido a String (str3)
		// ao imprimir System.out.println(num3); ele mostra a conversão
	}

}
