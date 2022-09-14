package testetiposdedados;

import java.math.BigDecimal;
import java.math.RoundingMode;



public class TipoBigDecimal {

	public static void main(String[] args) {
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal resultado = big1.add(big2);
		
		if (resultado.compareTo(BigDecimal.valueOf(0.3)) == 0) {
			System.out.println("Deu boa!");
		} else {
			System.out.println("Deu ruim!");
		}

		big1 = new BigDecimal("10.0");
		big2 = new BigDecimal("3.0");
		try {
			System.out.println(big1.divide(big2,2,RoundingMode.DOWN));
			//System.out.println(big1.divide(big2));		
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}

}

