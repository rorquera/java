package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestRecuperarPersona {
	public static void main(String[] args) {
		try {
			Persona persona = AdminPersonas.buscarPorId("1231231231");
			System.out.println(persona);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
