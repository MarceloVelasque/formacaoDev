package aula22Exercicio01;

import java.security.PublicKey;

public class Funcionario extends Pessoa {
	public Funcionario(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	private float salario;

	public void imprimeDados() {
		System.out.println("Nome: " + super.getNome("marcelo"));
		System.out.println("Salário: " + this.salario);
	}

	public float calculaImposto() {
		return (float) 0.03;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public void calcularImposto() {
		// TODO Auto-generated method stub
		
	}
	}
	
	
		
	
