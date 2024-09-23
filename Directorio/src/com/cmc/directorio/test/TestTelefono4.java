package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono4 {
	public static void main(String[] args) {
		Telefono telf1 = new Telefono("movi", "098234234", 20);
		Telefono telf2 = new Telefono("claro", "098234235", 21);
		Telefono telf3 = new Telefono("claro", "098234236", 22);
		Telefono telf4 = new Telefono("claro", "098234237", 23);
		AdminTelefono at = new AdminTelefono();
		int totalTelefonosClaro = 0;

		totalTelefonosClaro = at.contarClaro(telf1, telf2, telf3, telf4);

		System.out.println("Total Teléfonos Claro: " + totalTelefonosClaro);
	}
}
