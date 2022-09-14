package execptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/* Um método pode optar por não tratar a exceção e simplismente
 * propagá-la, ou melhor, delagar para o método que a chamou. Acláusula 
 * throws declara exceções que podem ser lançadas em determinados
 * métodos
 */
public class TesteExceptions2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter("c:\\nota.txt");
		
		PrintWriter print=new PrintWriter(fw);
		print.println("Maça = R$ 4,00");
		print.println("Morango = R$ 6,50");
		print.println("Total = R$ 10,50");
		print.close();
		fw.close();
		
	}

}
