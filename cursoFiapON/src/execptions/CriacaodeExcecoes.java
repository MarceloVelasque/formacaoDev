package execptions;

public class CriacaodeExcecoes {
	public static void main(String[] args) {
		try {
			int val = 10 / 0;
		} catch (Exception e) {

			throw new DivisaoPorZeroExceptions();
		}
		// criamos a classe DivisaoPorZeroExceptions e extendemos ela de
		// RuntimeException, ao executar essa exceção veremos que será
		// lançada no console
		// a utilização de um nome em exception faz parte de uma conversão em
		// java
	}

	/*
	 * Para criar uma exceção basta criar uma classe que herde de Exception
	 * (checked) ou RuntimeException (unchecked) Por padrão, as exeções no Java
	 * terminam com Exception
	 * 
	 */
}
