package br.com.pgAdmin_jdbc.Javabeans_Funcionario.Teste;

import br.com.pgAdmin_jdbc.Javabeans_Funcionario.DAO.FuncionarioDAO;
import br.com.pgAdmin_jdbc.Javabeans_Funcionario.Model.Funcionario;

public class testeAtualizarDadosFuncionario {

	public static void main(String[] args) {
		int id = 1;
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome_funcionario("Jonas k.");
		funcionario.setSenha("123123123");
		funcionario.setUsuario("joninhaskuhn");

		FuncionarioDAO.atualizarFuncionario(funcionario, id);
		
		System.out.println("Funcionario Atualizado!!");
	}

}
