package exercicioaula38;
import java.util.List;

import java.util.List;

//import exercicio.Pessoa;

//import aula_39_40.model.Pessoa;

public interface IPessoaDAO {
	void adicionar(Pessoa p);

	void alterar(Pessoa p);

	void excluir(Integer id);

	List<Pessoa> listarTodas();

	Pessoa buscarPorId(Integer id);

}

