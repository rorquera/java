package com.krakedev.persistencia.test;

import java.util.List;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscar {
	public static void main(String[] args) {
		try {
			List<Persona> personas = AdminPersonas.buscarPersonasPorNombre("do");
			System.out.println(personas);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
