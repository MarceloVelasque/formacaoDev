package exerciciosaula31Dominio;

import java.util.ArrayList;
import java.util.List;

public class Leilao {
	private String descricao;
	private List <Lance> lances;
	public Leilao(String descricao) {
		this.descricao = descricao;
		this.lances = new ArrayList<Lance>();
		
		
	}public void propoe(Lance lance) {
	lances.add(lance);

	}public String  getDescriçao() {
		return descricao;
	} public  List <Lance>getLances(){
	return lances;
	}
}


