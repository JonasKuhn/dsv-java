package br.com.pgAdmin_jdbc.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.pgAdmin_jdbc.ConnectionFactory;

public class testeConexaoDadosIncorreto {

	//Dessa maneira caso ocorra algum erro de inserção de dados
	//essa execução não será fechada
	public static void main(String[] args) throws SQLException {

	        // conectando
	        Connection con = new ConnectionFactory().getConnection();

	        // cria um preparedStatement
	        String sql = "insert into contatos" +
	                " (nome,email,endereco,dataNascimento)" +
	                " values (?,?,?,?)";
	        PreparedStatement stmt = con.prepareStatement(sql);

	        // preenche os valores
	        stmt.setString(1, "Caelum");
	        stmt.setString(2, "contato@caelum.com.br");
	        stmt.setString(3, "R. Vergueiro 3185 cj57");
	        stmt.setDate(4, new java.sql.Date(
	                Calendar.getInstance().getTimeInMillis()));

	        // executa
	        stmt.execute();
	        stmt.close();

	        System.out.println("Gravado!");

	        con.close();
	    }
}