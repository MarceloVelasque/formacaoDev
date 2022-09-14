package execptions;

import java.awt.AWTException;

/*
 * podemos classicar uma exeção java de três classificações distintas
 * checked,unchecked e error
 * checked: é quando você é obrigado a tratar uma determinada linha
 * de código que pode gerar uma exeção 
 * 
 * unchecked: é quando você não é obrigado a tratar e geralmente um erro
 * unchecked herda da classe runtime exeption.
 * 
 * error:é quando acontece um erro que não pode ser tratado
 * na sua codificação que a jvm  apresenta uma determinada situação de erro
 * que não existe tratativa no seu código fonte 
 */
public class TesteExecptions {

	public static void main(String[] args) throws DivisaoPorZeroExceptions {
	
		try {
			//trecho aonde a exceção pode  ocorrer
		int val =10/0;
		System.out.println(val);
		
		} catch (Exception e) {//captura da exceção
			
			//tratamento da exceção
			e.printStackTrace();
		}

}}
