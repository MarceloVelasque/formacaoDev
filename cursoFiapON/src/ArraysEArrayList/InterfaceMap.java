package ArraysEArrayList;

import java.util.HashMap;
import java.util.Map;

public class InterfaceMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// aqui temos a interface Map que é muito útil quando
				//queremos recuperar um valor través da sua chave
				
				//aqui emprementamos com Map 
				Map<String, String> caixa = new HashMap<String,String>();
				// nessas três linhas abaixo adicionamos 3 caixas 
				//com as chaves e os nomes
				caixa.put("M2225", "Fernando");
				caixa.put("M2226", "Maria");
				caixa.put("M2227", "Soraya");
				
				System.out.println(caixa.isEmpty());
				// nessa linha verificamos se o nosso isEmpty está vazio
				
				System.out.println(caixa.size());
				//retornamos e imprimos o tamanho do HashMap com o size
				
				System.out.println(caixa.containsKey("M2225"));
				//verificamos se dentro desse HashMap do nome caixa
				// contem a chave "M2225"
				
				System.out.println(caixa.containsValue("Fernando"));
				//verificamos se dentro do nosso HashMap contem o valor fernando
				
				System.out.println(caixa);
				//aqui imprimos todos os intens do nosso HashMap
	}

}
