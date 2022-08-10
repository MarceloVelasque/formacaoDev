import Modelo.Gerente;
import Modelo.Recepcionista;

public class Principal {
	public static void main(String[] args) {
		Recepcionista recepcionista =new Recepcionista();
		recepcionista.atender();
		recepcionista.falarIngles();
		System.out.println("_______________________________");
		Gerente marcia =new Gerente();
		marcia.atender();
		marcia.falarIngles();
	}
	
}
