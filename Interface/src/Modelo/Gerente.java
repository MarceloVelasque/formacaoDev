package Modelo;

import projetoInterface.ICamareira;
import projetoInterface.Irecepcionista;

public class Gerente extends Pessoa implements Irecepcionista, ICamareira  {

	public Gerente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Gerente(String nome, String telefone, String cpf) {
		super(nome, telefone, cpf);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void atender() {
		System.out.println("atendo o público  ");
		
	}

	@Override
	public void falarIngles() {
		System.out.println(" e falo inglês fluente ");
		
	}

	@Override
	public void arrumarACama() {
		System.out.println("arrumar cama");
		
	}

	@Override
	public void limparQuarto() {
		System.out.println("limpo  quarto");
		
	}
	
}
