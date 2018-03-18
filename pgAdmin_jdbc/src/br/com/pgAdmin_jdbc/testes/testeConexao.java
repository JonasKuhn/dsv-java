package br.com.pgAdmin_jdbc.testes;
import java.sql.Connection;
import java.sql.SQLException;

import br.com.pgAdmin_jdbc.ConnectionFactory;

public class testeConexao {
	public static void main(String[] args) throws SQLException {
		Connection connection = new ConnectionFactory().getConnection();
        System.out.println("Conexão aberta!");
        connection.close();
	}
}	