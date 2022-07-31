package aula_19_e_20.lista_01;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args)  {
		{
			
			String nome;
			int idade;
			float media,nota1,nota2,nota3;
			
			Exercicio01 alunomedia =new Exercicio01();
			Scanner ler=new Scanner(System.in);
			System.out.println(Exercicio01.nome(""));
			nome=ler.nextLine();
			System.out.println("digite a idada do aluno");
			idade=ler.nextInt();
			System.out.println("digite a priemira nota do aluno"+nome);
			nota1=ler.nextFloat();
			System.out.println("digite a segunda nota do aluno"+nome);
			nota2=ler.nextFloat();
			System.out.println("digite a terceira nota do aluno"+nome);
			nota3=ler.nextFloat();
		    System.out.println(alunomedia.media(nota1,nota2,nota3));



	}
		
	}	public int media;	    static String nome (String nome) {
			return(nome);
		}

		int idade(int idade) {
			return (idade);
		}

		float media(float not1, float not2, float not3) {
			this.media = (int) ((not1 + not2 + not3) / 3);
			return this.media(0, 0, 0);
		}

		void verificaAprovado() {
			if (this.media > 7) {
				System.out.println("o aluno aprovado");
			} else if (this.media >= 5 && this.media < 7) {
				System.out.println("aluno em exame");
			} else {
				System.out.println("aluno reprovado");
			}
		} }
