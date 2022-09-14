package exercicioaula32;

import org.junit.Assert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class Exercicio01CalculadoraTest {

	
	@Test
	@DisplayName ("deveria somar dois números positivos")
	public void deveriaSomarDoisNumerosPositivos() {
		Exercicio01Calculadora calc =new  Exercicio01Calculadora();
		int soma = calc.somar(41, 1);
		
		Assert.assertEquals(42,soma);
	}
	@Test
	public void deveriaSubtrairDoisNumeros() {
		Exercicio01Calculadora calc =new  Exercicio01Calculadora();
		int subtrair = calc.subtrair(42, 0);
		Assert.assertEquals(42,subtrair );

	}
	@SuppressWarnings("deprecation")
	@Test
	public void deveriaMultiplicarDoisNumero() {
		Exercicio01Calculadora calc = new Exercicio01Calculadora ();
		float  multiplicar  = (float) calc.multiplicar(3, 6);
		Assert.assertEquals(0, multiplicar);
		
	}
	@SuppressWarnings("deprecation")
	public  void deveriaDividirDoisNumeros() {
		Exercicio01Calculadora calc =new  Exercicio01Calculadora ();
		float dividir =(float) calc.dividir(5, 3);
		Assert.assertEquals(-5, dividir);
	}

	}

