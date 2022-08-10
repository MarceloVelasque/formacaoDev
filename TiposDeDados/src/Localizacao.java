import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Localizacao {
	public static void main(String[] args) {
		// O Locale � preciso estar antes do Scanner
		Locale.setDefault(Locale.US);	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero real (com ponto decimal): ");
		double valor = sc.nextDouble();
		
		System.out.print(NumberFormat.getCurrencyInstance().format(valor));
		System.out.printf(" || %.5f\n\n", valor);
// se rodar o programa vai reparar que ele está imprimindo em dolar $, o responsável por isso é a
// função (NumberFormat.getCurrencyInstance() 
// já o ".format(valor));" ele formata o valor para o padrão americado colocando
// . ponto no número no local correto exemplo "$123.45", e não sobrando lixo 0,0000123,45

// System.out.printf(" || %.5f\n\n", valor); " nada mais é que a impresão do código acima"
		
		
		// Padr�o alem�o
		Locale.setDefault(Locale.GERMANY);	
		sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero real (com v�rgula decimal): ");
		valor = sc.nextDouble();
		
		System.out.print(NumberFormat.getCurrencyInstance().format(valor));

		System.out.printf(" || %.2f\n\n", valor);
// aqui eu colocaria o mesmo comentário que está acima é o mesmo jeito só que aqui
// é o padrão alemão
// o padrão alemão usa EURO € e diferente do padrão americano ele usa "," ao invés de "." ponto
		
		
		// Padr�o nacional
		Locale.setDefault(new Locale("pt", "BR"));
		// mesma coisa o Brasil usa "," e não "." 
//função locale.setdefault(new Locale("","")): é para chamar o padrão de um país 
		sc = new Scanner(System.in);
		
		System.out.print("Digite um n�mero real (com v�rgula decimal): ");
		valor = sc.nextDouble();
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
	//nf.setGroupingUsed(false); 
// Agrupamento de d�gitos ou seja com  não é colocado "." 
//ela configura como sera o procediemnto desse formatador
// para ver basts rodar normalmente depois descomentar a linha 49 para ver a diferença
		String resultado = nf.format(valor);
		
		System.out.print(resultado);
		System.out.printf(" || R$ %.2f\n", valor);
		
		sc.close();
	}
}
