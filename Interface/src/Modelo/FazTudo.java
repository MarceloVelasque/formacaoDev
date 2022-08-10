package Modelo;

import projetoInterface.ICamareira;
import projetoInterface.ICozinheira;
import projetoInterface.IFazTudo;
import projetoInterface.Irecepcionista;

public class FazTudo extends Pessoa implements IFazTudo,ICamareira , Irecepcionista, ICozinheira {
public void faztudo() {
	System.out.println("faz o que a camareira faz e o que a  cozinheira faz também"
			+"e se não bastase faz o que a recepcionista faz");
}

@Override
public void arrumarACama() {
	System.out.println("arrumo a cama");
	
}

@Override
public void limparQuarto() {
	System.out.println("limpo o quarto");
	
}

@Override
public void Comida() {
	System.out.println("faço comida");
	
}

@Override
public void LavaLouca() {
	System.out.println("ainda lavo a louça");
}

@Override
public void atender() {
	System.out.println("atendo o público");
	
}

@Override
public void falarIngles() {
	System.out.println("sou tão foda que ainda falo inglês, posso ser gerente no futuro kkkkkkk");
	
}
}
