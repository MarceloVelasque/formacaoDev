package testetiposdedados;

public enum Meses {
	JANEIRO(1, "Janeiro", 31),
	FEVEREIRO(2, "Fevereiro", 28),
	MARCO(3, "Março", 31);
	
	private int numero, dias;
	private String nome;
	
	Meses(int numero, String nome, int dias) {
		this.numero = numero;
		this.nome = nome;
		this.dias = dias;
	}

	public int getNumero() { return numero; }
	public int getDias() { return dias; }
	public String getNome() { return nome; }
}

