package Modelo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		Cozinheira cozinheira = new Cozinheira();
		System.out.println("digite o nome da tia da cozinha");
		cozinheira.setNome(ler.next());
		System.out.println("digite o cpf da tia da cozinha ");
		cozinheira.setCpf(ler.next());
		System.out.println("digite o número de telefone");
		cozinheira.setTelefone(ler.next());
		cozinheira.Comida();
		cozinheira.LavaLouca();
		
System.out.println("------------------------------------------------------------");
		AuxiliarGeral auxiliar = new AuxiliarGeral();
		System.out.println("digite o nome da Auxiliar Geral");
		auxiliar.setNome(ler.next());
		System.out.println("digite o cpf da auxiliar ");
		auxiliar.setCpf(ler.next());
		System.out.println("digite o número de telefone");
		auxiliar.setTelefone(ler.next());
		auxiliar.Comida();
		auxiliar.arrumarACama();
		auxiliar.LavaLouca();
		auxiliar.limparQuarto();
		System.out.println("------------------------------------------------------------");		
		Recepcionista recepcionista =new Recepcionista();
		System.out.println("digite o nome da Recepcionista Geral");
		recepcionista.setNome(ler.next());
		System.out.println("digite o cpf da recpcionisata ");
		recepcionista.setCpf(ler.next());
		System.out.println("digite o número de telefone");
		recepcionista.setTelefone(ler.next());
		recepcionista.atender();
		recepcionista.falarIngles();
		System.out.println("------------------------------------------------------------");	
		Camareira camareira =new Camareira();
		System.out.println("digite o nome da camareira");
		camareira.setNome(ler.next());
		System.out.println("digite o cpf da camareira ");
		camareira.setCpf(ler.next());
		System.out.println("digite o número de telefone");
		camareira.setTelefone(ler.next());
		camareira.limparQuarto();
		camareira.arrumarACama();
		System.out.println("------------------------------------------------------------");	
		FazTudo faztudo =new FazTudo();
		System.out.println("digite o nome da pessoa que faz tudo");
		faztudo.setNome(ler.next());
		System.out.println("digite o cpf da pessoa que faz tudo ");
		faztudo.setCpf(ler.next());
		System.out.println("digite o número de telefone");
		faztudo.setTelefone(ler.next());
		faztudo.limparQuarto();
		faztudo.arrumarACama();
		faztudo.atender();
		faztudo.Comida();
		faztudo.falarIngles();
		faztudo.faztudo();
		faztudo.LavaLouca();
		System.out.println("------------------------------------------------------------");		
		Gerente gerente =new Gerente();
		System.out.println("digite o nome do gerente");
		gerente.setNome(ler.next());
		System.out.println("digite o cpf do gerente ");
		gerente.setCpf(ler.next());
		System.out.println("digite o número de telefone");
		gerente.setTelefone(ler.next());
		gerente.arrumarACama();
		gerente.atender();
		gerente.falarIngles();
		gerente.limparQuarto();
		

	}

}
