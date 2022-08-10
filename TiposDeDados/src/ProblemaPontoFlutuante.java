import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
// o erro desse exempplo é que ele não da a soma correta que deveria ser 0.3
// ele da 0.300000000000004 que não passa de resto de conta "lixo" para corrigir isso
// usa esses tipos de situações listas a baixo

public class ProblemaPontoFlutuante {
	public static void main(String[] args) {
		// Problema com n�meros em ponto flutuante
		double a = 0.1;
		double b = 0.2;
		double c = a + b;

		if (c != 0.3) {
			System.out.println("Algo estranho est� acontecendo: 0,1 + 0,2 != " + c);
		}

		// 1a. solu��o: Arredondamento 'manual'
		c = Math.round((a + b) * 100) / 100.;
//função math são funções da classe matemática.
//c = Math.round((a + b) * 100) / 100.; essa função math.round faz o arredondamento 
// usa se *100 para ele jogar duas casas a frente não ficando 0.3 más sim 30.0
// caso queira mostrar 3.0 faça como está no exemplo c = Math.round((a + b) * 100) / 100.;
// divido por / 100 e em sequida coloco um . "ponto" o resultado sera 0.3 o esperado
		if (c == 0.3) {
			System.out.println("M�todo 1, ok! 0,1 + 0,2 = " + c);
		}

		// 2a. solu��o: String.format()
		String str = String.format(Locale.US, "%.2f", (a + b));
		c = Double.valueOf(str);
		if (c == 0.3) {
			System.out.println("M�todo 2, ok! 0,1 + 0,2 = " + c);
		}
// o segundo jeito é usando o Locale.US,"%.2f",(a+b)); sempre que for transformar 
// um número usando o padrão americano. o padrão brasil coloca "," 
//que acaba dando erro
		}
		// 3a. solu��o: DecimalFormat.format()
		DecimalFormat formato = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.US)); 
		String res = formato.format(a + b);
		c = Double.valueOf(res);

		if (c == 0.3) {
			System.out.println("M�todo 3, ok! 0,1 + 0,2 = " + c);
// a terceira solução é usando o DecimalFormat, estancio ele e coloco como no exemplo
// dentro da mascara "0.00" é ande aparecera o valor, lembrando que na sequencia
// tem o padrão americano DecimalFormatSymbols(Locale.US)); forçando ele rodar sem da problemas
// substituindo a "," padrão BR pelo "." padrão americano
// DecimalFormat formato = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.US));
			
//String res = formato.format(a + b); "ele vai pegar o formatador DecimalFormat formato = new DecimalFormat("0.00", new DecimalFormatSymbols(Locale.US));
// vai colocar a soma dentro (a+b);"
			
//	c = Double.valueOf(res);} " aqui é feita a conversão da String res=formato.format para número
			
// aqui só exibe na tela a conversão usando if sendo opcional 	
//if (c == 0.3) {
//			System.out.println("M�todo 3, ok! 0,1 + 0,2 = " + c);
}