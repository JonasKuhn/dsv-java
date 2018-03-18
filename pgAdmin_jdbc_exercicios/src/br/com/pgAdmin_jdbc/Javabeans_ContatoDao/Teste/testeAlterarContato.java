package br.com.pgAdmin_jdbc.Javabeans_ContatoDao.Teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.DAO.AlterarContatoDAO;
import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.Model.Contato;

public class testeAlterarContato {

	public static void main(String[] args) throws SQLException {
		int id = 8;

		Contato contato = new Contato();
		contato.setNome("Jonas K.");
		contato.setEmail("jonaskuhn220@gmail.com");	
		contato.setEndereco("25 de julho - 338");
		contato.setDataNascimento(Calendar.getInstance());

		AlterarContatoDAO.alteraContato(contato, id);

		System.out.println("Alterado com SUCESSO! \n");

	}

}
