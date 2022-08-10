package Modelo;

import projetoInterface.Irecepcionista;

public class Recepcionista extends Pessoa implements Irecepcionista{

	public Recepcionista() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recepcionista(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atender() {
		System.out.println("atendo clientes do hotel");
		
	}

	@Override
	public void falarIngles() {
		System.out.println("falo inglês");	
		
	}
	
}
