package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.caelum.classes.Contato;

public class ContatoDAO {
	
	private Connection con ;
	
	public ContatoDAO() {
		this.con = new ConnectionFactory().getConnection(); 
	}
	
	public void adiciona(Contato contato) {

		String sql = "insert into contatos(nome,email,endereco,dataNascimento) values "+
				"(?,?,?,?)";
		
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, contato.getNome());
			stmt.setString(2, contato.getEmail());
			stmt.setString(3, contato.getEndereco());
			stmt.setDate(4, new java.sql.Date(contato.getDataNascimento().getTimeInMillis()));
			
			stmt.execute();
			stmt.close();
			System.out.println("GRAVADO!");
		}catch(SQLException e){
			throw new RuntimeException(e);
		
		}
	}
	
	public List<Contato> getLista(){
		try {
			List<Contato> contatos = new ArrayList<Contato>();
			
			PreparedStatement stmt = this.con.prepareStatement("select * from contatos");
			
			ResultSet rs =  stmt.executeQuery();
			
			while (rs.next()) {
				Contato c = new Contato();
				c.setNome(rs.getString("nome"));
				c.setEmail(rs.getString("email"));
				c.setEndereco(rs.getString("endereco"));
				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				c.setDataNascimento(data);
				
				contatos.add(c);
			}
			rs.close();
			stmt.close();
			return contatos;
		}catch(SQLException e){
			throw new RuntimeException(e);
		}
		
	}
	
}
