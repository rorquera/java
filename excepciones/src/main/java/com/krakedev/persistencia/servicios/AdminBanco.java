package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Banco;
import com.krakedev.persistencia.util.ConexionBDD;

public class AdminBanco {
	private static Logger logger = LogManager.getLogger(AdminBanco.class);

	public static void insertar(Banco banco) throws Exception {
		Connection conn = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlBanco = "INSERT INTO public.banco(codigo_banco, codigo_transaccion, detalle)"
					+ "	VALUES (?, ?, ?)";

			PreparedStatement pstmtBan = conn.prepareStatement(sqlBanco);

			// Datos a insertar para banco
			int codigoBanco = banco.getCodigoBanco();
			int codigoTransaccion = banco.getCodigoTransaccion();
			String detalle = banco.getDetalle();

			// Establecer los valores de los parámetros para banco
			pstmtBan.setInt(1, codigoBanco);
			pstmtBan.setInt(2, codigoTransaccion);
			pstmtBan.setString(3, detalle);

			// Ejecutar la sentencia para banco
			int filasBanco = pstmtBan.executeUpdate();
			System.out.println("Filas insertadas banco: " + filasBanco);
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

	public static void actualizar(Banco banco) throws Exception {
		Connection conn = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlBanco = "UPDATE public.banco SET codigo_transaccion=?, detalle=? WHERE codigo_banco=?";

			PreparedStatement pstmtBan = conn.prepareStatement(sqlBanco);

			// Datos a actualizar para banco
			int codigoBanco = banco.getCodigoBanco();
			int codigoTransaccion = banco.getCodigoTransaccion();
			String detalle = banco.getDetalle();

			// Establecer los valores de los parámetros para banco
			pstmtBan.setInt(1, codigoTransaccion);
			pstmtBan.setString(2, detalle);
			pstmtBan.setInt(3, codigoBanco);

			// Ejecutar la sentencia para banco
			int filasBanco = pstmtBan.executeUpdate();
			System.out.println("Filas afectadas banco: " + filasBanco);
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

	public static void eliminar(int codigoBanco) throws Exception {
		Connection conn = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlBanco = "DELETE FROM public.banco WHERE codigo_banco=?";

			PreparedStatement pstmtPer = conn.prepareStatement(sqlBanco);

			// Establecer los valores de los parámetros para banco
			pstmtPer.setInt(1, codigoBanco);

			// Ejecutar la sentencia para banco
			int filasBanco = pstmtPer.executeUpdate();
			System.out.println("Filas afectadas banco: " + filasBanco);
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
