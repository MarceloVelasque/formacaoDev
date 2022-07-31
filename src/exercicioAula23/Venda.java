package exercicioAula23;

import java.util.ArrayList;

public class Venda {
	private double vlrtotal;
	private  ArrayList<Produto> listaVenda;
	
	

	public Venda() {
		super();
	}

	public Venda(double vlrtotal, ArrayList<Produto> listaVenda) {
		super();
		this.vlrtotal = vlrtotal;
		this.listaVenda = listaVenda;
	}

	public double getVlrtotal() {
		return vlrtotal;
	}

	public void setVlrtotal(double vlrtotal) {
		this.vlrtotal = vlrtotal;
	}

	public ArrayList<Produto> getListaVenda() {
		return listaVenda;
	}

	public void setListaVEnda(ArrayList<Produto> listaVenda) {
		this.listaVenda = listaVenda;
	}

	public void adicionarItemVenda(Produto produto) {
		this.vlrtotal += produto.getPreco();
	}

	public void visualizarVenda() {
		toString();
	}

	@Override
	public String toString() {
		return "Venda [listaVenda=" + listaVenda + "]";
	}

	public void concluirVenda(Pagamento pagamento) {
		System.out.println("o valor total das vendas "+this.getVlrtotal());
		pagamento.realizarPagamento(pagamento);
		this.setListaVenda(new ArrayList<Produto>());
		
		

	}

	private void setListaVenda(ArrayList<Produto> arrayList) {
		// TODO Auto-generated method stub
		
	}
}
