package cursoFiapON;

public class TesteConta {

	public static void main(String[] args) {
		//aqui foi usado classes e atributos com a classe conta e a classe cliente sendo aqui a
		//classe principal aonde estou estanciando a classe conta dando varios tipos de nomes para ela
		// contacorrente,contapoupanca,containvestimento
		//-----------------------------------------------------------------------------------------------
		//foi feito uma outra classe cliente com atributos de nome e idade, foi estanciado na classe conta 
		// para que pudessemos usar ela ao convocar a classe Conta na principal assim conseguimos mostrar as 
		// informações de cliente ao estanciar a classe conta na principal mostrando o nome e a idade
		//=====================================================================================================
		Conta contacorrente = new Conta ();
		contacorrente.numero = 11 ;
		contacorrente.saldo =2000;
		contacorrente.cliente.nome="Agata";
		contacorrente.cliente.idade=15;
		
		
		
		System.out.println("o número da conta corrente é "+ contacorrente.numero+
				"o saldo da conta é "+contacorrente.saldo+
				"e o nome do cliente é"+contacorrente.cliente.nome+ " e a idade do cliente é "+contacorrente.cliente.idade);
		
		Conta contapoupanca= new Conta ();
		contapoupanca.numero =11;
		contapoupanca.saldo = 5000;
		contapoupanca.cliente.nome= "Amanda";
		contapoupanca.cliente.idade= 45;
		
		System.out.println("o número da conta poupança é "+contapoupanca.numero+
				"o saldo da conta é "+contapoupanca.saldo+
				"e o nome do cliente é"+contapoupanca.cliente.nome+ " e a idade do cliente é "+contapoupanca.cliente.idade);
		
		Conta containvestimento = new Conta ();
		containvestimento.numero =33;
		containvestimento.saldo=8000;
		containvestimento.cliente.nome= "Marcelo";
		containvestimento.cliente.idade=27;
		
		System.out.println("o número da conta de investimento é "+containvestimento.numero+
				"o saldo da conta é "+containvestimento.saldo+ 
				"e o nome do cliente é"+containvestimento.cliente.nome+ " e a idade do cliente é "+containvestimento.cliente.idade);
		
		
		
		
		

	}

}
