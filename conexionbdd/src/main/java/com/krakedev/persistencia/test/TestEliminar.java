package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {
	public static void main(String[] args) {
		try {
			String cedula = "1725458741";

			AdminPersonas.eliminar(cedula);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
