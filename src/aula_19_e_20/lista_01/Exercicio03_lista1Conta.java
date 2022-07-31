package aula_19_e_20.lista_01;

import java.util.Scanner;

public class Exercicio03_lista1Conta   {

	public String numeroConta;
	public String tipoConta;
	public String titularConta;
	public Double saldo;
	public Double valorDeposito;
	public Double valorSaque;
	Scanner sc =new Scanner(System.in);
	
	
	

	public Exercicio03_lista1Conta(String numeroConta, String tipoConta, String titularConta, Double saldo, Double valorDeposito,
			Double valorSaque, Scanner sc) {
		super();
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
		this.valorDeposito = valorDeposito;
		this.valorSaque = valorSaque;
		this.sc = sc;
	}

	public void abrirConta() {
		System.out.print("Informe o seu nome: ");
		titularConta = sc.next();
		System.out.println("Qual tipo de conta deseja abrir?");
		tipoConta = sc.next();
		numeroConta = geraNumeroConta();
		System.out.println("Abertura de conta realizada com sucesso! Aguarde..");
	}

	public String geraNumeroConta() {
		int nroConta = (int) (Math.random() * Math.pow(10, 7));
		numeroConta = String.valueOf(nroConta + "-9");
		return numeroConta;
	}

	public void depositar(double valorDeposito) {
		System.out.print("Informe a quantia que deseja depositar: R$");
		valorDeposito = sc.nextInt();
		saldo += valorDeposito;
		System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso!");
	}

	public void sacar(double valorSaque) {
		System.out.print("Informe a quantia que deseja sacar: R$");
		valorSaque = sc.nextInt();
		if (valorSaque > saldo) {
			System.out.println("O valor informado para saque é maior que o saldo total da conta!");
		} else {
			this.saldo -= valorSaque;
			System.out.println("Saque de R$" + valorSaque + " realizado com sucesso!");
		}
	}

	

	public void consultarDadosBancarios() {
		System.out.println("Olá " + titularConta + ", seja bem vindo(a)!");
		System.out.println("Tipo: " + tipoConta);
		System.out.println("Número: " + numeroConta);
	}

	public void consultarSaldo(Double saldo, Double limite) {
		System.out.println("Seu saldo é de:  R$" + saldo);
		System.out.println("Seu limite é de: R$" + saldo);
		Double saldoTotal = saldo + (limite);
		System.out.println("Saldo + limite:  R$" + saldoTotal);
	}

}
