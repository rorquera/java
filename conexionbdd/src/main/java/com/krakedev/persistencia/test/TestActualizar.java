package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestActualizar {
	public static void main(String[] args) {
		try {
			String cedula = "1725458741";
			String nombre = "Mario";
			String apellido = "Quirola";
			double estatura = 1.65;
			LocalDate fechaNacimiento = LocalDate.of(1970, 11, 22);
			Time horaNacimiento = Time.valueOf("12:35:00");
			BigDecimal cantidadAhorrada = new BigDecimal("1123.45");
			int numeroHijos = 2;
			EstadoCivil estadoCivil = new EstadoCivil("C", "Casado");

			AdminPersonas.actualizar(new Persona(cedula, nombre, apellido, estatura, fechaNacimiento, horaNacimiento,
					cantidadAhorrada, numeroHijos, estadoCivil));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
