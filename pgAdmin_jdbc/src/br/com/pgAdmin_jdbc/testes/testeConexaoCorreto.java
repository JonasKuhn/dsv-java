package br.com.pgAdmin_jdbc.testes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.pgAdmin_jdbc.ConnectionFactory;

class testeConexaoCorreto {
	public static void main(String[] args) throws SQLException {
		Connection con = null;
        try {
            con = new ConnectionFactory().getConnection();

            // faz um monte de operações.
            // que podem lançar exceptions runtime e SQLException
            
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
        } finally {
            con.close();
        }
	}
}
