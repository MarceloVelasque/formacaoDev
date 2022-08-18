package exerciciosaula32;

public class Exercicio01Calculadora {
	public int somar(int num1, int num2) {
		int resultado =num1+num2;
		return resultado;
	}

	public int subtrair(int num1, int num2) {
		int resultado =num1 -num2;
		return resultado;
	}

	public double multiplicar(double num1, double num2) {
		return num1 * num2;
	}
	public double  dividir (double num1, double num2) {
		return num1 / num2;
	}

	@Override
	public String toString() {
		return "Calculadora [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}

