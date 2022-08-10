package Modelo;

import projetoInterface.ICamareira;

public class Camareira extends Pessoa implements ICamareira {

	public Camareira() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Camareira(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void arrumarACama() {
		System.out.println(" meu trabalho é arrumar a cama de todo mundo");
		
	}

	@Override
	public void limparQuarto() {
		System.out.println("limpar a sujeira do quarto ");
		
	}
	
}
