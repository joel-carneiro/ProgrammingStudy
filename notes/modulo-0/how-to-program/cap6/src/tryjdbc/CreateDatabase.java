package tryjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDatabase {
	public static void main(String[] args) {
		
		final String URL = "jdbc:mysql://localhost:3306";
		final String USER = "joeldspy";
		final String PASSWORD = "123";
		
		try {
			Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("A conexão foi realizada com sucesso!");
			
			Statement statement = connection.createStatement();
			statement.execute("CREATE DATABASE IF NOT EXISTS school");
			System.out.println("O database 'school' foi criado com sucesso!");
			
			connection.close();
		} catch (SQLException e) {
			System.out.println("A conexão infelizmente falhou.");
		}
		
	}
}