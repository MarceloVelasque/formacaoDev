package exercicioAula23;

public class Produto {
	 
		private String nome;
		private double preco;
		private int quantidadeEstoque;
		public Produto(String nome, double preco, int quantidadeEstoque) {
			super();
			this.nome = nome;
			this.preco = preco;
			this.quantidadeEstoque = quantidadeEstoque;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public int getQuantidadeEstoque() {
			return quantidadeEstoque;
		}
		public void setQuantidadeEstoque(int quantidadeEstoque) {
			this.quantidadeEstoque = quantidadeEstoque;
		}
		
		public boolean verificarEstoque(Produto produto) {
			if (produto.getQuantidadeEstoque() > 0) {
			return true;
			}else { 
				return false;
			}
		}
		@Override
		public String toString() {
			return "Produto [nome=" + nome + ", preco=" + preco + ", quantidadeEstoque=" + quantidadeEstoque + "]";
		}
	 
}
