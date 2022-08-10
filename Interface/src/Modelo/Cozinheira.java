package Modelo;

import projetoInterface.ICozinheira;

public class Cozinheira extends Pessoa implements ICozinheira {

	
	public void Comida() {
		System.out.println("faz o almoço e a janta e prepara o café");
	}	
	public void LavaLouca() {
		System.out.println("limpa a sujeira e lava a louça");
	}
	}


