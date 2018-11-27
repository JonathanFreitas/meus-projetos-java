package br.com.caelum.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.caelum.classes.Contato;

public class JDBCInsere {

	public static void main(String[] args) throws SQLException {
		
		Contato c = new Contato();
		c.setNome("Flavia");
		c.setEmail("flaviacmoura@gmail.com");
		c.setEndereco("samabaia sul");
		c.setDataNascimento(Calendar.getInstance());
		
		ContatoDAO cd = new ContatoDAO();
		cd.adiciona(c);

	}

}
