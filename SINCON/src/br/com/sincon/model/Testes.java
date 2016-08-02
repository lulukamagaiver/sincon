package br.com.sincon.model;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.sincon.sql.ConnectionFactory;

public class Testes {

	public static void main(String[] args) {
		try {
		Connection connection = new ConnectionFactory().getConnection();
		System.out.println("Conexão aberta!");
		connection.close();
		} catch (SQLException e) {
			System.out.println("Erro na Conexão "+e.getMessage());
		}

	}

}
