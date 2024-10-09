package com.krakedev.excepciones;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;

public class TestConexion {
	public static void main(String[] args) {
		Connection conn = null;

		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String pass = "admin";

		String sqlTra = "INSERT INTO public.transacciones(codigo, numero_cuenta, monto, tipo, fecha, hora)"
				+ "	VALUES (?, ?, ?, ?, ?, ?)";

		String sqlBan = "INSERT INTO public.banco(codigo_banco, codigo_transaccion, detalle) VALUES (?, ?, ?)";

		try {
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection(url, user, pass);
			System.out.println("Conexion establecida " + conn);

			PreparedStatement pstmtTra = conn.prepareStatement(sqlTra);
			PreparedStatement pstmtBan = conn.prepareStatement(sqlBan);

			// Datos a insertar para transacciones
			int codigo = 31;
			String cuenta = "5001";
			BigDecimal monto = new BigDecimal("123.45");
			String tipo = "C";
			LocalDate fecha = LocalDate.of(2023, 11, 22);
			Time hora = Time.valueOf("10:30:00");

			// Datos a insertar para banco
			int codigoBanco = 27;
			int codigoTransaccion = codigo;
			String detalle = "Transaccion 1";

			// Establecer los valores de los parámetros para transacciones
			pstmtTra.setInt(1, codigo);
			pstmtTra.setString(2, cuenta);
			pstmtTra.setBigDecimal(3, monto);
			pstmtTra.setString(4, tipo);
			pstmtTra.setDate(5, Date.valueOf(fecha));
			pstmtTra.setTime(6, hora);

			// Establecer los valores de los parámetros para transacciones
			pstmtBan.setInt(1, codigoBanco);
			pstmtBan.setInt(2, codigoTransaccion);
			pstmtBan.setString(3, detalle);

			// Ejecutar la sentencia para transacciones
			int filasTransacciones = pstmtTra.executeUpdate();
			System.out.println("Filas insertadas transacciones: " + filasTransacciones);

			// Ejecutar la sentencia para transacciones
			int filasBanco = pstmtBan.executeUpdate();
			System.out.println("Filas insertadas banco: " + filasBanco);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
