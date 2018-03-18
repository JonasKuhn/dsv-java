package br.com.pgAdmin_jdbc.Javabeans_Funcionario.Teste;

import java.sql.SQLException;

import br.com.pgAdmin_jdbc.Javabeans_Funcionario.DAO.FuncionarioDAO;
import br.com.pgAdmin_jdbc.Javabeans_Funcionario.Model.Funcionario;

public class testeAdicionarFuncionario {

	public static void main(String[] args) throws SQLException {
		Funcionario funcionario = new Funcionario();
		
		funcionario.setNome_funcionario("Jonas Kuhn");
		funcionario.setUsuario("jonaskuhn22");
		funcionario.setSenha("123456");
		
		FuncionarioDAO.adicionar(funcionario);
		
		System.out.println("Gravado com Sucesso!!");
	}
}
