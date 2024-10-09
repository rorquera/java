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

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.util.ConexionBDD;

public class AdminPersonas {
	private static Logger logger = LogManager.getLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection conn = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlPersona = "INSERT INTO public.personas("
					+ "	cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento, cantidad_ahorrada, numero_hijos, estado_civil_codigo)"
					+ "	VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

			PreparedStatement pstmtPer = conn.prepareStatement(sqlPersona);

			// Datos a insertar para personas
			String cedula = persona.getCedula();
			String nombre = persona.getNombre();
			String apellido = persona.getApellido();
			double estatura = persona.getEstatura();
			LocalDate fechaNacimiento = persona.getFechaNacimiento();
			Time horaNacimiento = persona.getHoraNacimiento();
			BigDecimal cantidadAhorrada = persona.getCantidadAhorrada();
			int numeroHijos = persona.getNumeroHijos();
			String estadoCivil = persona.getEstadoCivil().getCodigo();

			// Establecer los valores de los parámetros para personas
			pstmtPer.setString(1, cedula);
			pstmtPer.setString(2, nombre);
			pstmtPer.setString(3, apellido);
			pstmtPer.setDouble(4, estatura);
			pstmtPer.setDate(5, Date.valueOf(fechaNacimiento));
			pstmtPer.setTime(6, horaNacimiento);
			pstmtPer.setBigDecimal(7, cantidadAhorrada);
			pstmtPer.setInt(8, numeroHijos);
			pstmtPer.setString(9, estadoCivil);

			// Ejecutar la sentencia para personas
			int filasPersonas = pstmtPer.executeUpdate();
			System.out.println("Filas insertadas personas: " + filasPersonas);
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

	public static void actualizar(Persona persona) throws Exception {
		Connection conn = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlPersona = "UPDATE public.personas"
					+ "	SET nombre=?, apellido=?, estatura=?, fecha_nacimiento=?, hora_nacimiento=?, cantidad_ahorrada=?, numero_hijos=?, estado_civil_codigo=?"
					+ "	WHERE cedula=?";

			PreparedStatement pstmtPer = conn.prepareStatement(sqlPersona);

			// Datos a insertar para personas
			String cedula = persona.getCedula();
			String nombre = persona.getNombre();
			String apellido = persona.getApellido();
			double estatura = persona.getEstatura();
			LocalDate fechaNacimiento = persona.getFechaNacimiento();
			Time horaNacimiento = persona.getHoraNacimiento();
			BigDecimal cantidadAhorrada = persona.getCantidadAhorrada();
			int numeroHijos = persona.getNumeroHijos();
			String estadoCivil = persona.getEstadoCivil().getCodigo();

			// Establecer los valores de los parámetros para personas
			pstmtPer.setString(1, nombre);
			pstmtPer.setString(2, apellido);
			pstmtPer.setDouble(3, estatura);
			pstmtPer.setDate(4, Date.valueOf(fechaNacimiento));
			pstmtPer.setTime(5, horaNacimiento);
			pstmtPer.setBigDecimal(6, cantidadAhorrada);
			pstmtPer.setInt(7, numeroHijos);
			pstmtPer.setString(8, estadoCivil);
			pstmtPer.setString(9, cedula);

			// Ejecutar la sentencia para personas
			int filasPersonas = pstmtPer.executeUpdate();
			System.out.println("Filas afectadas personas: " + filasPersonas);
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

	public static void eliminar(String cedula) throws Exception {
		Connection conn = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlPersona = "DELETE FROM public.personas WHERE cedula=?";

			PreparedStatement pstmtPer = conn.prepareStatement(sqlPersona);

			// Establecer los valores de los parámetros para personas
			pstmtPer.setString(1, cedula);

			// Ejecutar la sentencia para personas
			int filasPersonas = pstmtPer.executeUpdate();
			System.out.println("Filas afectadas personas: " + filasPersonas);
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
