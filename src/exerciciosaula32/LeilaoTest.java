package exerciciosaula32;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import exerciciosaula32.Avaliador;
import exerciciosaula32.Cliente;
import exerciciosaula32.Leilao;
import exerciciosaula32.Usuario;

public class LeilaoTest {

	@Test
	public void testarLancesOrdemCrescente() {
		// Cenário
		Usuario joao =new Usuario("João");
		Usuario jose =new Usuario("José");
		Usuario maria =new Usuario("Maria");

		Leilao leilao = new Leilao("Play 5");

		leilao.propoe(new Lance(maria, 2500.0));
		leilao.propoe(new Lance(joao, 3000.0));
		leilao.propoe(new Lance(jose, 4000.0));

		// Ação
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);

		// Verificação
		double maiorLanceEsperado = 4000;
		double menorLanceEsperado = 2500;

		assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
		assertEquals(menorLanceEsperado, avaliador.getMenorLance());

	}

	@Test
	public void testarLancesOrdemDecrescente() {
		// Cenário
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Play 5");

		leilao.propoe(new Lance(jose, 4000.0));
		leilao.propoe(new Lance(joao, 3000.0));
		leilao.propoe(new Lance(maria, 2500.0));

		// Ação
		Avaliador avaliador = new Avaliador();
		((Avaliador) avaliador).avalia(leilao);

		// Verificação
		double maiorLanceEsperado = 4000;
		double menorLanceEsperado = 2500;

		assertEquals(maiorLanceEsperado, avaliador.getMaiorLance());
		assertEquals(menorLanceEsperado, avaliador.getMenorLance());

	}

	@Test
	public void testarLancesOrdemAleatoria() {
		// Cenário
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Play 5");

		leilao.propoe(new Lance(joao, 3000.0));
		leilao.propoe(new Lance(jose, 4000.0));
		leilao.propoe(new Lance(maria, 2500.0));
		leilao.propoe(new Lance(jose, 3500.0));

		// Ação
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);

		// Verificação
		double maiorLanceEsperado = 4000;
		double menorLanceEsperado = 2500;

		assertEquals(maiorLanceEsperado, ((Avaliador) avaliador).getMaiorLance());
		assertEquals(menorLanceEsperado, ((Avaliador) avaliador).getMenorLance());

	}

	@Test
	public void testarLancesMesmoValor() {
		// Cenário
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("José");
		Usuario maria = new Usuario("Maria");

		Leilao leilao = new Leilao("Play 5");

		leilao.propoe(new Lance(joao, 3000.0));
		leilao.propoe(new Lance(jose, 3000.0));
		leilao.propoe(new Lance(maria, 3000.0));
		leilao.propoe(new Lance(jose, 3000.0));

		// Ação
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);

		// Verificação
		double maiorLanceEsperado = 3000;
		double menorLanceEsperado = 3000;

		assertEquals(maiorLanceEsperado, ((Avaliador) avaliador).getMaiorLance());
		assertEquals(menorLanceEsperado, ((Avaliador) avaliador).getMenorLance());

	}

	@Test
	public void testarLancesApenasUmLance() {
		// Cenário
		Usuario joao = new Usuario("João");

		Leilao leilao = new Leilao("Play 5");

		leilao.propoe(new Lance(joao, 3000.0));

		// Ação
		Avaliador avaliador = new Avaliador();
		avaliador.avalia(leilao);

		// Verificação
		double maiorLanceEsperado = 3000;
		double menorLanceEsperado = 3000;

		assertEquals(maiorLanceEsperado, ((Avaliador) avaliador).getMaiorLance());
		assertEquals(menorLanceEsperado, ((Avaliador) avaliador).getMenorLance());

	}

}