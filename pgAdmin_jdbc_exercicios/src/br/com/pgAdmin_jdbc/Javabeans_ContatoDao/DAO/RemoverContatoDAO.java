package br.com.pgAdmin_jdbc.Javabeans_ContatoDao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.ConnectionFactory.ConnectionFactory;

public class RemoverContatoDAO {

	public static Connection connection = new ConnectionFactory().getConnection();
	
	public static void removerContato(int id) throws SQLException {
		String sql = "delete from contatos where id=" + id;

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
