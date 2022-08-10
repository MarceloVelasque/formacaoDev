package Modelo;

public class Cliente extends Pessoa {
	protected double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Cliente [salario=" + salario + ", nome=" + getNome() + "]";
	}

	public Cliente(String nome, String telefone, String cpf, double salario) {
		super(nome, telefone, cpf);
		this.salario = salario;
	}

	
	}
	

