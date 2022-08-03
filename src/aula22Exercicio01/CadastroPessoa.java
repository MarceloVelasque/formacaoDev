package aula22Exercicio01;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroPessoa {

	public static void main(String[] args) {
		int menu;
		Scanner ler =new Scanner (System.in);
	ArrayList<String> cadastropessoa =new  ArrayList<String>()	;
	System.out.println("digite o nome da preimeira pessoa para cadastrar ");
	cadastropessoa.add (ler.next());
	System.out.println("digite o nome da segunda pessoa para cadastrar ");
	cadastropessoa.add (ler.next());
	System.out.println("digite o nome da terceira pessoa para cadastrar ");
	cadastropessoa.add (ler.next());
	System.out.println("-----------------------------------------------------------");
	System.out.println("BEM VINDO ESCOLHA AS OPÇÕES DO MENU PARA EXIBIR AS INFORMAÇÕES");
	System.out.println("-----------------------------------------------------------");
	System.out.println(" DIGITE 1 PARA EXIBIR INFORMAÇÕES DO CLIENTE");
	System.out.println(" DIGITE 2 PARA EXIBIR INFORMAÇÕES DO FUNCIONÁRIO");
	System.out.println(" DIGITE 3 PARA EXIBIR INFORMAÇÕES DO GERENTE");
	menu = ler.nextInt();
	
	if (menu  == 1 ) {
	Cliente cliente =new Cliente ("pedro");
	System.out.println("digite o nome do cliente");
	cliente.getNome(ler.next());
	System.out.println("digite o codigo do cliente");
	cliente.setCodigo(ler.nextInt());
	cliente.imprimirDados();
	}
	else if (menu ==2 ) {
	
	Funcionario funcionario = new Funcionario("marcelo");
	System.out.println("digite o nome do funcionário");
	funcionario.getNome(ler.next());
	System.out.println("digite o salário do funcionário"+""+funcionario.getNome("marcelo"));
	funcionario.setSalario(ler.nextFloat());
	System.out.println("o calculo do imposto do salário do funcionario "+""+funcionario.getNome("marcelo")+""+"R$"+funcionario.getSalario());
	System.out.println("o imposto do salário do funcionário é "+funcionario.calculaImposto());
	funcionario.imprimirDados();
	funcionario.calculaImposto();
	}
	else if (menu==3) {
	
	Gerente gerente = new Gerente("zé pequeno");
	System.out.println("digite o nome do gerente");
	gerente.getNome(ler.next());
	System.out.println("digite o salário do gerente"+""+ gerente.getNome("zé pequeno"));
	gerente.setSalario(ler.nextFloat());
	System.out.println("o calculo do imposto do salário do funcionario "+""+gerente.getNome("marcelo")+""+"R$"+gerente.getSalario());
	System.out.println("o imposto do salário do funcionário é "+gerente.calculaImposto());
	gerente.imprimirDados();
	gerente.calculaImposto();
	} else {
		System.out.println("opção invalida");
	}
	
	
	
	
	
		
		
	}

}
