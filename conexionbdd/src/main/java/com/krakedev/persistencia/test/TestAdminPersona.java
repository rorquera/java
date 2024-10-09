package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestAdminPersona {
	public static void main(String[] args) {
		try {
			String cedula = "1725458741";
			String nombre = "Mario";
			String apellido = "Ser";
			double estatura = 1.75;
			LocalDate fechaNacimiento = LocalDate.of(2023, 11, 22);
			Time horaNacimiento = Time.valueOf("10:30:00");
			BigDecimal cantidadAhorrada = new BigDecimal("123.45");
			int numeroHijos = 10;
			EstadoCivil estadoCivil = new EstadoCivil("U", "Union Libre");

			AdminPersonas.insertar(new Persona(cedula, nombre, apellido, estatura, fechaNacimiento, horaNacimiento,
					cantidadAhorrada, numeroHijos, estadoCivil));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
