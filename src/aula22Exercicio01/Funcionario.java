package aula22Exercicio01;

import java.security.PublicKey;

public class Funcionario extends Pessoa {

	public Funcionario(String nome) {
		super(nome);	
	}
	protected float imposto;
	
	
	public float getImposto() {
		return imposto;
	}
	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	private float salario;
	public Funcionario(String nome, float salario) {
		super(nome);
		this.salario = salario;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	public void calcularImposto() {
	 imposto = (this.salario /100* 3);
	 
	}
	
	
	
	@Override
	public void imprimirDados() {
		super.imprimirDados();
		
}
	@Override
	public String toString() {
		return "Funcionario [imposto=" + imposto + ", salario=" + salario + ", getImposto()=" + getImposto()
				+ ", getSalario()=" + getSalario() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	} 
	
	}
	
	
		
	