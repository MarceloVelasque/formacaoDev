package aula22Exercicio01;

import java.security.PublicKey;

public class Cliente extends Pessoa {

	public Cliente(String nome) {
		super(nome);
		
	}
	private int codigo;
	
	public Cliente(String nome, int codigo) {
		super(nome);
		
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public void imprimirDados() {
		super.imprimirDados();
		System.out.println("o código do cliente"+"é"+getCodigo());
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", getCodigo()=" + getCodigo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
		
			
		}
	
	
	
	

