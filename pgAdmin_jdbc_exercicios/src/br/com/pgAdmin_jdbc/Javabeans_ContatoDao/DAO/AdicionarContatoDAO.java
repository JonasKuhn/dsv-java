package br.com.pgAdmin_jdbc.Javabeans_ContatoDao.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.ConnectionFactory.ConnectionFactory;
import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.Model.Contato;

public class AdicionarContatoDAO {
	public static Connection connection = new ConnectionFactory().getConnection();

	public static void adicionar(Contato contato) throws SQLException {
		String sql = "insert into contatos " + "(nome,email,endereco,dataNascimento)" + " values (?,?,?,?)";
		
		PreparedStatement stmt = connection.prepareStatement(sql); 
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		stmt.setDate(4, new Date(contato.getDataNascimento().getTimeInMillis()));

		stmt.execute();
		stmt.close();
	}
}
