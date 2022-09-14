package ArraysEArrayList;

import java.util.HashSet;
import java.util.Set;

public class InterfaceSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
	}

}
