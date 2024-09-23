package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {
	public static void main(String[] args) {
		Telefono telef = new Telefono("claro", "0889554578", 30);
		Contacto c = new Contacto("Leon", telef, 31);

		System.out.println("Apellido: " + c.getApellido());
		System.out.println("Activo: " + c.isActivo());
		System.out.println("Operadora: " + c.getTelefono().getOperadora());
		System.out.println("Número: " + c.getTelefono().getNumero());
	}
}
