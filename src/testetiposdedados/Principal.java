package testetiposdedados;

//*public class Principal {

	//import bumeracoes.Meses;

	public class Principal {
		private enum DiasSemana {
			SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
		}
		
		public static void main(String[] args) {
			System.out.println(DiasSemana.SEGUNDA.name());
			System.out.println(DiasSemana.valueOf("SEGUNDA"));
			
			DiasSemana diasSemana[] = DiasSemana.values();
			System.out.println(diasSemana[1]);
			
			for (Meses mes : Meses.values()) {
				if (mes.equals(Meses.FEVEREIRO)) {
					System.out.println("Fevereiro é um mês complicado!");
				} else {
					System.out.println(mes.getNome() + " - " + mes.getDias());
				}
			}
		}

	}
	


