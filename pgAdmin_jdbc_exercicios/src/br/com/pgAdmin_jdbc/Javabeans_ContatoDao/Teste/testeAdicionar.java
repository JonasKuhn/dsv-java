package br.com.pgAdmin_jdbc.Javabeans_ContatoDao.Teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.DAO.AdicionarContatoDAO;
import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.Model.Contato;

public class testeAdicionar {

	public static void main(String[] args) throws SQLException {
		Contato contato = new Contato();
		contato.setNome("Júlio");
		contato.setEmail("-----");
		contato.setEndereco("25 de julho - 338");
		contato.setDataNascimento(Calendar.getInstance()); 

		AdicionarContatoDAO.adicionar(contato);

		System.out.println("Gravado!");
	}

}
