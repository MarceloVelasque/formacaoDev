package aula22Exercicio01;

public class Gerente extends Funcionario {

	public Gerente(String nome) {
		super(nome);
		
	}
	private String area;
	private Object salario;
	public Gerente(String nome, String area) {
		super(nome);
		this.area = area;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	
	public void calcularImposto() {
		 imposto = (this.getSalario() /100* 3);
	}
	
	@Override
	public void imprimirDados() {
		
		super.imprimirDados();
		
	}
	@Override
	public String toString() {
		return "Gerente [area=" + area + ", getArea()=" + getArea() + ", getSalario()=" + getSalario() + ", toString()="
				+ super.toString() + ", getNome()=" + getNome(area) + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}
