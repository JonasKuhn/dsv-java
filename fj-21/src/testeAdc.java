import java.sql.SQLException;
import java.util.Calendar;

import br.com.jonaskuhn.DAO.AdicionarContatoDAO;
import br.com.jonaskuhn.model.Contato;

public class testeAdc{

	public static void main(String[] args) throws SQLException {
		Contato contato = new Contato();
		contato.setNome("Júlio");
		contato.setEmail("-----");
		contato.setEndereco("25 de julho - 338");
		contato.setDataNascimento(Calendar.getInstance()); 

		AdicionarContatoDAO.adicionarContato(contato);

		System.out.println("Gravado!");
	}

}
