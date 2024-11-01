package br.com.caelum.jdbc;

public class ConnectionFactory {

	try {
		return DriverManager.getConnection(
		 "jdbc:mysql://localhost/fj21", "root", "");
				 } catch (SQLException e) {
			throw new RuntimeException(e);
	}
		
		
}
