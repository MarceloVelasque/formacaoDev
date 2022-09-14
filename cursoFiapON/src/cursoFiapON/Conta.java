package cursoFiapON;

public class Conta {
	int numero;
	double saldo;
	Cliente cliente = new Cliente();
	
	
	
	public Conta() {
		super();
	}

	public Conta(int numero, double saldo, Cliente cliente) {
		super();
		this.numero = numero;
		this.saldo = saldo;
		this.cliente = cliente;
	}

	public double recuperarSaldo() {
		return saldo;

	}

	public void depositar(double valor) {
		saldo = saldo + valor;

	}

	public void retirar(double valor) {
		saldo = saldo + valor;
 
	}
	
	public void setNumero(int numero) {
		this.numero=numero;

	}
	
	public int getNumero() {
		return numero;
	}
	}

