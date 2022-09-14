package br.com.fiap.banco;

public class ContaTeste1 {

	public static void main(String[] args) {
		Conta1 conta =new Conta1 ();
		conta.depositar(50);
		conta.setAgencia(123); 
		conta.setNumero(2222);
		conta.depositar(1000);
		System.out.println(conta.getSaldo());			
		Conta1 poupanca =new Conta1 (1000,222,1000);
	poupanca.retirar(100);
		System.out.println(poupanca.getSaldo());
		
		
		Conta1 contacorrente =new Conta1();
		contacorrente.setAgencia(111);
		contacorrente.setNumero(22);
		contacorrente.depositar(700);
		contacorrente.retirar(200);
		System.out.println(contacorrente.getSaldo());
		
	}
}
