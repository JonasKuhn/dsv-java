package br.com.pgAdmin_jdbc.Javabeans_Funcionario.Teste;

import br.com.pgAdmin_jdbc.Javabeans_Funcionario.DAO.FuncionarioDAO;

public class RemoverFuncionario {

	public static void main(String[] args) {
		int cod = 1;
		
		FuncionarioDAO.removerFuncionario(cod);
		
		System.out.println("Funcionario removido com Sucesso!");

	}

}
