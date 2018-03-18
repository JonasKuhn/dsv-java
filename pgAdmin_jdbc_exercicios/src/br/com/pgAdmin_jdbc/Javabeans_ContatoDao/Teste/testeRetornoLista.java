package br.com.pgAdmin_jdbc.Javabeans_ContatoDao.Teste;

import java.text.SimpleDateFormat;
import java.util.List;

import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.DAO.BuscarContatosDAO;
import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.Model.Contato;

public class testeRetornoLista {

	public static void main(String[] args) throws Exception {

		List<Contato> contatos = BuscarContatosDAO.buscarContatos();

		// interando dados do banco na lista contatos
		for (Contato contato : contatos) {
			System.out.println("Nome: " + contato.getNome());
			System.out.println("Email: " + contato.getEmail());
			System.out.println("Endereço: " + contato.getEndereco());
			
			//utitlizado para fazzer um padrao de formato para a data
			SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
			String str = fmt.format(contato.getDataNascimento().getTime());
			
			System.out.println("Data de Nascimento: " + str + "\n");
		}
	}

}
