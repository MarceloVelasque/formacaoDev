package ArraysEArrayList;

import java.util.ArrayList;
import java.util.List;

public class InterfaceList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
				carrinho2.add("Maça");
				carrinho2.add("Morango");
				carrinho2.add("Maça");
				
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

				carrinho2.clear();
				System.out.println(carrinho2.isEmpty());
				// o metodo clear remove todos os objetos do set
				
				//=================================================
				System.out.println("=================================================");
	}

}
