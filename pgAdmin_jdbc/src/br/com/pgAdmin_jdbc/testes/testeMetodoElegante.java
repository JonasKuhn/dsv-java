package br.com.pgAdmin_jdbc.testes;

import java.util.Calendar;

import br.com.pgAdmin_jdbc.DAO.ContatoDAO;
import br.com.pgAdmin_jdbc.Model.Contato;

public class testeMetodoElegante {

	public static void main(String[] args) {

        Contato contato = new Contato();
        contato.setNome("Caelum");
        contato.setEmail("contato@caelum.com.br");
        contato.setEndereco("R. Vergueiro 3185 cj87");
        contato.setDataNascimento(Calendar.getInstance());
        
        ContatoDAO.adiciona(contato);

        System.out.println("Gravado!");
	}
}
