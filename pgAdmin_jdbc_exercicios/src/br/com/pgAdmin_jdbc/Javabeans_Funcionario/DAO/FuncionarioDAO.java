package br.com.pgAdmin_jdbc.Javabeans_Funcionario.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.pgAdmin_jdbc.Javabeans_ContatoDao.ConnectionFactory.ConnectionFactory;
import br.com.pgAdmin_jdbc.Javabeans_Funcionario.Model.Funcionario;

public class FuncionarioDAO {

	public static Connection connection = new ConnectionFactory().getConnection();

	public static void adicionar(Funcionario funcionario) throws SQLException {
		String insertFuncionario = "insert into tb_funcionarios" + "(nome_funcionario,usuario,senha)" + "values (?,?,?)";
	
		PreparedStatement stmt = connection.prepareStatement(insertFuncionario);
		
		stmt.setString(1, funcionario.getNome_funcionario());
		stmt.setString(2, funcionario.getSenha());
		stmt.setString(3, funcionario.getUsuario());
		
		stmt.execute();
		stmt.close();
	}
	
	public static void atualizarFuncionario(Funcionario funcionario, int id) {
		String atualizaSql = "update tb_funcionarios set nome_funcionario=?, usuario=?, senha=? where cod_funcionario=" + id;
	
		try {
			PreparedStatement stmt = connection.prepareStatement(atualizaSql);
			stmt.setString(1, funcionario.getNome_funcionario());
			stmt.setString(2, funcionario.getSenha());
			stmt.setString(3, funcionario.getUsuario());
			
			stmt.execute();
			stmt.close();
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static List<Funcionario> buscarFuncionario() {
		try {
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			PreparedStatement stmt = connection.prepareStatement("select * from tb_funcionarios");
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getLong("cod_funcionario"));
				funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
				funcionario.setSenha(rs.getString("senha"));
				funcionario.setUsuario(rs.getString("usuario"));
				
				funcionarios.add(funcionario);
			}
			rs.close();
			stmt.close();
			
			return funcionarios;
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static List<Funcionario> buscarFuncionarioWhere(int cod) {
		try {
			List<Funcionario> funcionarios = new ArrayList<Funcionario>();
			PreparedStatement stmt = connection.prepareStatement("select * from tb_funcionarios where cod_funcionario=" + cod);
			
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()){
				Funcionario funcionario = new Funcionario();
				funcionario.setId(rs.getLong("cod_funcionario"));
				funcionario.setNome_funcionario(rs.getString("nome_funcionario"));
				funcionario.setSenha(rs.getString("senha"));
				funcionario.setUsuario(rs.getString("usuario"));
				
				funcionarios.add(funcionario);
			}
			rs.close();
			stmt.close();
			
			return funcionarios;
			
		}catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void removerFuncionario(int cod){
		String removerSql = "delete from tb_funcionarios where cod_funcionario=" + cod;
		
		try {
			PreparedStatement stmt = connection.prepareStatement(removerSql);
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}