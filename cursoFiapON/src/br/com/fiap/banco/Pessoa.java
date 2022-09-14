package br.com.fiap.banco;
//emcapsulamento get set
import java.io.Serializable;
/*
 * usando o implements Serializable isso siginifica que ao inciar
 * um objeto dessa classe pessoa as informações desse objeto serão
 * serializaveis de fato transformada em pacotes de byts
 * para serem trafegadas pela rede
 */
public class Pessoa implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome; 
	/*o metodo get vai ser responsável por 
	 * obter essa informação e o metodo set
	 * vai ser responsável por alterar aquela informação
	 * ambos os metodos são publicos para que possam ser
	 * acessado fora do escopó dessa classe
	 */
	public String getNome () {
		return nome;
	/*o metodo get vai ser responsavel por retorna 
	 * o tipo de dado justamente do atributro em questão que
	 * aqui no caso é nome, repare que não tem nenhum 
	 * parametro dentro de aspas()
	 */
	}public void setNome (String nome) {
		this.nome=nome;
		
		/*
		 * foi criado aqui o metodo set que não vai ter nenhum
		 * retorno, repare que ele recebe como parametro (String nome)
		 * o novo mome que será associado e a lógica desse metodo
		 * é eu alterar o nome da classe pelo novo nome que venho
		 * de parametro usando o this.nome=nome;
		 */
	}
	
	
}
