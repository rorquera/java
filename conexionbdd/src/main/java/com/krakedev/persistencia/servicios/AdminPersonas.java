package com.krakedev.persistencia.servicios;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.EstadoCivil;
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

	public static Persona buscarPorId(String cedula) throws Exception {
		Persona persona = new Persona();
		EstadoCivil estadoCivil = new EstadoCivil();
		Connection conn = null;
		ResultSet rs = null;
		ResultSet rsEstadoCivil = null;
		try {
			conn = ConexionBDD.crearConexion();

			String sqlPersona = "SELECT cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento,"
					+ " CAST(cantidad_ahorrada AS numeric) AS cantidad_ahorrada,"
					+ " numero_hijos, estado_civil_codigo FROM public.personas WHERE cedula=?";

			String sqlEstadoCivil = "SELECT codigo, descripcion FROM public.estado_civil WHERE codigo=?";

			PreparedStatement pstmtPer = conn.prepareStatement(sqlPersona);
			PreparedStatement pstmtEst = conn.prepareStatement(sqlEstadoCivil);

			// Establecer los valores de los parámetros para personas
			pstmtPer.setString(1, cedula);

			// Ejecutar la sentencia para personas
			rs = pstmtPer.executeQuery();

			// Obtener los valores del ResultSet
			if (rs.next()) {
				// Recuperacion del estado civil
				pstmtEst.setString(1, rs.getString("estado_civil_codigo"));
				rsEstadoCivil = pstmtEst.executeQuery();
				if (rsEstadoCivil.next()) {
					estadoCivil.setCodigo(rs.getString("estado_civil_codigo"));
					estadoCivil.setDescripcion(rsEstadoCivil.getString("descripcion"));
				}

				persona.setCedula(cedula);
				persona.setNombre(rs.getString("nombre"));
				persona.setApellido(rs.getString("apellido"));
				persona.setEstatura(rs.getDouble("estatura"));
				persona.setFechaNacimiento((rs.getDate("fecha_nacimiento").toLocalDate()));
				persona.setHoraNacimiento(rs.getTime("hora_nacimiento"));
				persona.setCantidadAhorrada(rs.getBigDecimal("cantidad_ahorrada"));
				persona.setNumeroHijos(rs.getInt("numero_hijos"));
				persona.setEstadoCivil(estadoCivil);
			}
		} catch (SQLException e) {
			logger.info("Error al intentar recuperar los datos. " + e.getMessage());
			e.printStackTrace();
			throw new Exception("Error al intentar recuperar los datos.");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				logger.info("Error al cerrar la conexion. " + e.getMessage());
				throw new Exception("Error al cerrar la conexion.");
			}
		}
		return persona;
	}

	public static List<Persona> buscarPersonasPorNombre(String nombre) throws Exception {
		Persona persona;
		EstadoCivil estadoCivil;
		Connection conn = null;
		ResultSet rs = null;
		ResultSet rsEstadoCivil = null;
		List<Persona> personas = new ArrayList<Persona>();
		try {
			conn = ConexionBDD.crearConexion();

			String sqlPersona = "SELECT cedula, nombre, apellido, estatura, fecha_nacimiento, hora_nacimiento,"
					+ " CAST(cantidad_ahorrada AS numeric) AS cantidad_ahorrada,"
					+ " numero_hijos, estado_civil_codigo FROM public.personas WHERE nombre LIKE ?";

			String sqlEstadoCivil = "SELECT codigo, descripcion FROM public.estado_civil WHERE codigo=?";

			PreparedStatement pstmtPer = conn.prepareStatement(sqlPersona);
			PreparedStatement pstmtEst = conn.prepareStatement(sqlEstadoCivil);

			// Establecer los valores de los parámetros para personas
			pstmtPer.setString(1, "%" + nombre + "%");

			// Ejecutar la sentencia para personas
			rs = pstmtPer.executeQuery();

			// Obtener los valores del ResultSet
			while (rs.next()) {
				persona = new Persona();
				estadoCivil = new EstadoCivil();
				// Recuperacion del estado civil
				pstmtEst.setString(1, rs.getString("estado_civil_codigo"));
				rsEstadoCivil = pstmtEst.executeQuery();

				if (rsEstadoCivil.next()) {
					estadoCivil.setCodigo(rs.getString("estado_civil_codigo"));
					estadoCivil.setDescripcion(rsEstadoCivil.getString("descripcion"));
				}

				persona.setCedula(rs.getString("cedula"));
				persona.setNombre(rs.getString("nombre"));
				persona.setApellido(rs.getString("apellido"));
				persona.setEstatura(rs.getDouble("estatura"));
				persona.setFechaNacimiento((rs.getDate("fecha_nacimiento").toLocalDate()));
				persona.setHoraNacimiento(rs.getTime("hora_nacimiento"));
				persona.setCantidadAhorrada(rs.getBigDecimal("cantidad_ahorrada"));
				persona.setNumeroHijos(rs.getInt("numero_hijos"));
				persona.setEstadoCivil(estadoCivil);

				personas.add(persona);
			}
		} catch (SQLException e) {
			logger.info("Error al intentar recuperar los datos. " + e.getMessage());
			e.printStackTrace();
			throw new Exception("Error al intentar recuperar los datos.");
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				logger.info("Error al cerrar la conexion. " + e.getMessage());
				throw new Exception("Error al cerrar la conexion.");
			}
		}
		return personas;
	}
}
