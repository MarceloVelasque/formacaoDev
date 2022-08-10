public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
		//this. é usado para diferenciar objeto nome, pegando lá de cima "this.nome = nome;"
		// note que a cor "nome" é igual a de cima justamente para diferenciar
	}
	
	public String getNome() { return this.nome; }
	public void setNome(String nome) { this.nome = nome; }
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
