package ArraysEArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TesteCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList carrinho = new ArrayList();
		Double valor =100.55;
		int valor2 = 1;
		int valor3;
		carrinho.add(valor);
		carrinho.add("Uva");
		carrinho.add(valor2);
		
		System.out.println(carrinho.get(1));
		/*aqui foi feito uma ArrayList e estanciada com o nome
		 * carrinho, foram colocados 3 variaveis 
		 * com o nome valor valor 2 e valor 3
		 * com o metodo add. adicionamos esses valores no ArrayList
		 * carrinho,
		 */
		//o metodo get nos ajuda a recuperar o valor no indice 1
		// repare que só estammos imprimindo o indice 1 então
		// só mostrara o indice 1
		//===========================================================
		System.out.println("===========================================================");
		
		//interface List e uso de Generics
		//Generics não permite tipos primitivos
		List<String> carrinho1 =new ArrayList<String>();
		// aqui declaramos esse ArrayList com <String>
		//ou seja só é aceito nesse arraylist tipos strings
		
		//em seguida temos 3 metos do arraylist 
		//o add. que adiciona  uma variavel no arraylista.
		// o set que altera o conteúdo de umdetermiando indice no arraylist.
		// o isEmpty que nós retorna verdadeiro ou falso se esse
		//arraylist está vazio ou não.
		//o size que retorna o tamanho do nosso arraylist
		
		
		System.out.println(carrinho1.isEmpty());
		
		carrinho1.add("Maça");
		carrinho1.add("Morango");
		carrinho1.add("Maça");		
		carrinho1.set(1, "Pera");
		
		
		System.out.println(carrinho1.isEmpty());
		//isEmpety verifica se a lista está vazia
		System.out.println(carrinho1.size());
		// size retorna o número de elementos nessa lista
		//=================================================
		System.out.println("=================================================");
		
		List<String>carrinho2=new ArrayList<String>();
		carrinho.add("Maça");
		carrinho.add("Morango");
		carrinho.add("Maça");
		
		System.out.println(carrinho2.contains("Maça"));
		// esse metodo contains retorna se "Maça" está contida
		// em alguns dos itens do nosso arrayLisy
		
		System.out.println(carrinho2.indexOf("Maça"));
		//indexOf retorna qual a posição que a palavra "Maça"
		// está no arrayList carrinho2
		
		System.out.println(carrinho2.get(carrinho2.indexOf("Maça")));
		//o metodo get busca a palavra maça apartir da posição retornada
		//pelo indexOf
		
		System.out.println(carrinho2.lastIndexOf("Maça"));
		// e o metodo lastIndexOf retorna qual a última ocorrência da 
		//palavra "Maça dentro do nosso ArrayList carrinho2
		
		
		carrinho2.remove(carrinho2.indexOf("Maça"));
		System.out.println(carrinho2.get(0));
		// o meotodo remove remove um objeto do set 

		carrinho.clear();
		System.out.println(carrinho2.isEmpty());
		// o metodo clear remove todos os objetos do set
		
		//=================================================
		System.out.println("=================================================");
		// a interface List permitem itens repetidos más[
		// a interface Set e as classes que a impletam 
		//não permitem 
		Set<String>cesta=new HashSet<String>();
		System.out.println(cesta.isEmpty());
		cesta.add("Maça");
		cesta.add("Maça");
		cesta.add("maça");
		System.out.println(cesta.isEmpty());
		
		System.out.println(cesta.size());
		System.out.println(cesta);
		// note que ele não repete Maça com o M maisuculo duas vezes
		// prova que não repete itens no array
		//=================================================
		System.out.println("=================================================");
		
		
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
