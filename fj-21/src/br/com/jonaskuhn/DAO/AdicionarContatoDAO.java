package br.com.jonaskuhn.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.jonaskuhn.ConnectionFactory.ConnectionFactory;
import br.com.jonaskuhn.model.Contato;

public class AdicionarContatoDAO {
	public static Connection connection = new ConnectionFactory().getConnection();

	public static void adicionarContato(Contato contato) throws SQLException {
		String sql = "insert into contatos" + "(nome,email,endereco,dataNascimento)" + "values (?,?,?,?)";
		
		PreparedStatement stmt = connection.prepareStatement(sql); 
		
		stmt.setString(1, contato.getNome());
		stmt.setString(2, contato.getEmail());
		stmt.setString(3, contato.getEndereco());
		stmt.setDate(4, (Date) contato.getDataNascimento().getTime());
		
		stmt.execute();
		stmt.close();
	}
}
