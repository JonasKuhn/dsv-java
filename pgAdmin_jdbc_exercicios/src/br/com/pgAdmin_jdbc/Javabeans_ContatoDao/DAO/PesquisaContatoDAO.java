package br.com.pgAdmin_jdbc.Javabeans_ContatoDao.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.ConnectionFactory.ConnectionFactory;
import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.Model.Contato;

public class PesquisaContatoDAO {
	public static Connection connection = new ConnectionFactory().getConnection();

	public static List<Contato> pesquisaContato(int id) {
		try {
			List<Contato> contatos = new ArrayList<Contato>();

			PreparedStatement stmt = connection.prepareStatement("select * from contatos where id =" + id);

			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				// criando o objeto Contato
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				// montando a data atrav�s do Calendar
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);

				// adicionando o objeto � lista
				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
