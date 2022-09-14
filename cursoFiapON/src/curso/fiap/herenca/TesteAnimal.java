package curso.fiap.herenca;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal animal =new Animal();
		animal.setAlimenta("todo animal se alimenta");
		animal.setLocomove("todo animal se locomove");
		
		Cachorro cachorro =new Cachorro ();
		cachorro.setAlimenta("o cachorro se alimenta");
		cachorro.setLocomove("o cachorro se locomove");
		cachorro.setLatido("o cahorro late");
		
		Animal poodle =new Cachorro ();
		poodle.setAlimenta("poodle come ração de cachorro");
		poodle.setLocomove("poodle usa 4 patas para se locomover");

	}

}
