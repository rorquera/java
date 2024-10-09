package com.krakedev.persistencia.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConexionBDD {
	private static Logger logger = LogManager.getLogger(ConexionBDD.class);

	public static Connection crearConexion() throws Exception {
		Connection conn = null;
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "admin";

		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, user, pass);

		} catch (ClassNotFoundException e) {
			logger.info("No se encontró la clase para la conexión. " + e.getMessage());
			throw new Exception("No se encontró la clase para la conexión.");
		} catch (SQLException e) {
			logger.info("No se pudo conectar a la base de datos. " + e.getMessage());
			throw new Exception("No se pudo conectar a la base de datos.");
		}
		return conn;
	}
}
