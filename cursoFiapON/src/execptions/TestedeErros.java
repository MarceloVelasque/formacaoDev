package execptions;

public class TestedeErros {
// Exceções Unchecked
	public static void main(String[] args) throws DivisaoPorZeroExceptions {

		try {
			int val = 10 / 0;
			int[] valores = new int[3];
			System.out.println(valores[4]);

			String nome = null;
			System.out.println(nome.length());

			int numero = Integer.parseInt("zero");
		} catch (ArithmeticException e ) {
			System.out.println("não é possível realizar uma divisão por zero!");

			//mensagem com a lista de erros
			System.out.println(e.getMessage());

			// Imprime a pilha de erro da exceção
			
			System.out.println();

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("não é possível acessar a posição 4 do array!");

		} catch (NullPointerException e) {
			System.out.println("não foi possível retornar o lenth, variável nome não instanciada");

		} catch (NumberFormatException e) {
			System.out.println("não foi possível realizar a conversão");

		} catch (Exception e) {
			System.out.println("erro na execução do programa ");
		} finally {
			System.out.println("sempre passara aqui!");
		}
	}
}
