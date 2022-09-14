package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancária
 * @author MARCELO
 *@version 1.0
 */
public class Conta1 implements Serializable {
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;

	public Conta1() {

	}

	public Conta1(int agencia, int numero, double saldo) {

		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor
	 *
	 */
	public void depositar(double valor) {
		this.saldo+= valor;
	}
	/**
	 * retira um valor do Saldo da Conta
	 * @param valor
	 * @see depositar
	 */
	public void retirar(double valor) {
		this.saldo-= valor;
	}
	/**
	 * verificar Saldo da conta
	 * @return valor do Saldo da Conta
	 */
 public double getSaldo() {
	 return this.saldo;
 }
}
