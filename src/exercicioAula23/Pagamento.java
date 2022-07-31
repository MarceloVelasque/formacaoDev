package exercicioAula23;

public class Pagamento {
	private int tipoPagemento;

	public Pagamento() {
		super();
	}

	public Pagamento(int tipoPagemento) {
		super();
		this.tipoPagemento = tipoPagemento;
	}

	public int getTipoPagemento() {
		return tipoPagemento;
	}

	public void setTipoPagemento(int tipoPagemento) {
		this.tipoPagemento = tipoPagemento;
	}

	public void selecionarTipoPagamento(int pagamento) {
		if (pagamento == 1) {
			System.out.println("VOCÊ ESCOLHEU PAGAR NO DINHEIRO");
			this.tipoPagemento = pagamento;
		} else if (pagamento == 2) {

			System.out.println("VOCÊ ESCOLHEU PAGAR NO CHEQUE");
			this.tipoPagemento = pagamento;
		} else if (pagamento == 3) {

			System.out.println("VOCÊ ESCOLHEU PAGAR NO CARTÃO");
			this.tipoPagemento = pagamento;
		} else {
			System.out.println(" FORMA DE PAGAMENTO INVALIDA");
		}
	}

	public void realizarPagamento(Pagamento pagamento) {
		System.out.println(
				" O SEU PAGAMENTO FOI REALIZADO COM SUCESSO, O SEU TIPO DE PAGAMENTO FOI " + this.getTipoPagemento());
		if (pagamento.getTipoPagemento() == 1) {
			System.out.println("VOCÊ ESCOLHEU PAGAR NO DINHEIRO");
		} else if (pagamento.getTipoPagemento() == 2) {
			System.out.println(" VOCÊ ESCOLHEU PAGAR NO CHEQUE");

		} else if (pagamento.getTipoPagemento() == 3) {
			System.out.println("VOCÊ ESCOLHEU PAGAR NO CARTÃO");
		} else {
			System.out.println("OPÇÃO INVALIDA");
		}
}}
