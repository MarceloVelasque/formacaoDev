package Modelo;

import projetoInterface.IAuxiliarGeral;
import projetoInterface.ICamareira;
import projetoInterface.ICozinheira;


public class AuxiliarGeral extends Pessoa implements IAuxiliarGeral ,ICamareira , ICozinheira  {

	@Override
	public void Comida() {
	System.out.println("auxilia ajudando a cortar os alimentos ");
		
	}

	@Override
	public void LavaLouca() {
		System.out.println("auxilia enchugando a louça");
		
	}

	@Override
	public void arrumarACama() {
		System.out.println("auxilia trocando os lençois e fronhas");
		
	}

	@Override
	public void limparQuarto() {
		System.out.println("auxilia ajudando a passar o aspiradore de pó");
		
	}

}
