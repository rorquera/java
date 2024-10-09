package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Transaccion;
import com.krakedev.persistencia.util.ConexionBDD;

public class AdminTransaccion {
	private static Logger logger = LogManager.getLogger(AdminTransaccion.class);

	public static void insertar(Transaccion transaccion) throws Exception {
		Connection conn = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlTransaccion = "INSERT INTO public.transacciones("
					+ "	codigo, numero_cuenta, monto, tipo, fecha, hora) VALUES (?, ?, ?, ?, ?, ?)";

			PreparedStatement pstmtTra = conn.prepareStatement(sqlTransaccion);

			// Datos a insertar para transaccion
			int codigo = transaccion.getCodigo();
			String numeroCuenta = transaccion.getNumeroCuenta();
			BigDecimal monto = transaccion.getMonto();
			String tipo = transaccion.getTipo();
			LocalDate fecha = transaccion.getFecha();
			Time hora = transaccion.getHora();

			// Establecer los valores de los parámetros para transaccion
			pstmtTra.setInt(1, codigo);
			pstmtTra.setString(2, numeroCuenta);
			pstmtTra.setBigDecimal(3, monto);
			pstmtTra.setString(4, tipo);
			pstmtTra.setDate(5, Date.valueOf(fecha));
			pstmtTra.setTime(6, hora);

			// Ejecutar la sentencia para transaccion
			int filasTransaccion = pstmtTra.executeUpdate();
			System.out.println("Filas insertadas transaccion: " + filasTransaccion);
		} catch (SQLException e) {
			logger.info("Error al intentar guardar los datos. " + e.getMessage());
			throw new Exception("Error al intentar guardar los datos.");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				logger.info("Error al cerrar la conexion. " + e.getMessage());
				throw new Exception("Error al cerrar la conexion.");
			}
		}
	}

	public static void actualizar(Transaccion transaccion) throws Exception {
		Connection conn = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlTransaccion = "UPDATE public.transacciones"
					+ "	SET numero_cuenta=?, monto=?, tipo=?, fecha=?, hora=? WHERE codigo=?";

			PreparedStatement pstmtTra = conn.prepareStatement(sqlTransaccion);

			// Datos a insertar para transaccion
			int codigo = transaccion.getCodigo();
			String numeroCuenta = transaccion.getNumeroCuenta();
			BigDecimal monto = transaccion.getMonto();
			String tipo = transaccion.getTipo();
			LocalDate fecha = transaccion.getFecha();
			Time hora = transaccion.getHora();

			// Establecer los valores de los parámetros para transaccion
			pstmtTra.setString(1, numeroCuenta);
			pstmtTra.setBigDecimal(2, monto);
			pstmtTra.setString(3, tipo);
			pstmtTra.setDate(4, Date.valueOf(fecha));
			pstmtTra.setTime(5, hora);
			pstmtTra.setInt(6, codigo);

			// Ejecutar la sentencia para transaccion
			int filasTransaccion = pstmtTra.executeUpdate();
			System.out.println("Filas afectadas transaccion: " + filasTransaccion);
		} catch (SQLException e) {
			logger.info("Error al intentar actualizar los datos. " + e.getMessage());
			throw new Exception("Error al intentar actualizar los datos.");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				logger.info("Error al cerrar la conexion. " + e.getMessage());
				throw new Exception("Error al cerrar la conexion.");
			}
		}
	}

	public static void eliminar(int codigo) throws Exception {
		Connection conn = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlTransaccion = "DELETE FROM public.transacciones WHERE codigo=?";

			PreparedStatement pstmtTra = conn.prepareStatement(sqlTransaccion);

			// Establecer los valores de los parámetros para transaccion
			pstmtTra.setInt(1, codigo);

			// Ejecutar la sentencia para transaccion
			int filasTransaccion = pstmtTra.executeUpdate();
			System.out.println("Filas afectadas transaccion: " + filasTransaccion);
		} catch (SQLException e) {
			logger.info("Error al intentar eliminar los datos. " + e.getMessage());
			throw new Exception("Error al intentar eliminar los datos.");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				logger.info("Error al cerrar la conexion. " + e.getMessage());
				throw new Exception("Error al cerrar la conexion.");
			}
		}
	}
}
