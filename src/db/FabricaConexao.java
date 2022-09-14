package db;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {
	
	//vai da um erro em Connection porque tera que fazer o import 
	//lebre de sempre usar o java.SQL
	private static Connection conexao = null;
	
	//constructor vazio privado não deixando criar novas estancias
	//
	private FabricaConexao() {
	}

	public static Connection getConexao() {
		try {
			if (conexao != null && conexao.isClosed()) {
				return conexao;
			}

			Properties prop = loadProperties();

			final String url = prop.getProperty("url");
			final String usuario = prop.getProperty("usuario");
			final String senha = prop.getProperty("senha");

			System.out.println("Estabelecendo conexão com o banco de dados...");
			conexao = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão realizada com sucesso!");

			return conexao;
		} catch (SQLException | IOException e) {
			throw new DbException(e.getMessage());
		}
	}

	public static void fecharConexao() {
		if (conexao != null) {
			try {
				System.out.println("Finalizando conexão com o banco de dados...");
				conexao.close();
				System.out.println("Conexão finalizada com sucesso!");
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	}

	private static Properties loadProperties() throws FileNotFoundException, IOException {
		try (FileInputStream fs = new FileInputStream(
				"C:url=jdbc:mysql://localhost/unoesc_crud_jdbc")) {
			Properties prop = new Properties();
			prop.load(fs);

			return prop;
		}
	}
}
