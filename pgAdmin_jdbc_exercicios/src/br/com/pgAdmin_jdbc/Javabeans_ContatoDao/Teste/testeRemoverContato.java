package br.com.pgAdmin_jdbc.Javabeans_ContatoDao.Teste;

import java.sql.SQLException;

import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.DAO.RemoverContatoDAO;

public class testeRemoverContato {

	public static void main(String[] args) throws SQLException {
		int id = 7;
		
		RemoverContatoDAO.removerContato(id);
		
		System.out.println("Contato apagado!");

	}

}
