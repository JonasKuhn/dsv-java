package br.com.pgAdmin_jdbc.Javabeans_Funcionario.Teste;

import java.util.List;

import br.com.pgAdmin_jdbc.Javabeans_Funcionario.DAO.FuncionarioDAO;
import br.com.pgAdmin_jdbc.Javabeans_Funcionario.Model.Funcionario;

public class testeBuscarPorFuncionarios {

	public static void main(String[] args) throws Exception {

		List<Funcionario> funcionarios = FuncionarioDAO.buscarFuncionario();
		
		for (Funcionario funcionario : funcionarios) {
			
			System.out.println("Nome: " + funcionario.getNome_funcionario());
			System.out.println("Usuario: " + funcionario.getUsuario());
			System.out.println("Senha: " + funcionario.getSenha());
		}
	}
}