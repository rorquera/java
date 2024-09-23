package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {
	public static void main(String[] args) {
		AdminContactos ac = new AdminContactos();
		Contacto contacto = new Contacto("Dorian", new Telefono("Claro", "5447885412", 25), 15.00);
		System.out.println("Apellido: " + contacto.getApellido());
		System.out.println("Operadora: " + contacto.getTelefono().getOperadora());
		System.out.println("Número: " + contacto.getTelefono().getNumero());
		System.out.println("Peso: " + contacto.getPeso());
		System.out.println("WhatsApp: " + contacto.getTelefono().isTieneWhatsapp());

		System.out.println("\n \u25CF ACTIVAR USUARIO");
		ac.activarUsuario(contacto);
		System.out.println("Apellido: " + contacto.getApellido());
		System.out.println("Operadora: " + contacto.getTelefono().getOperadora());
		System.out.println("Número: " + contacto.getTelefono().getNumero());
		System.out.println("Peso: " + contacto.getPeso());
		System.out.println("Tiene WhatsApp?: " + contacto.getTelefono().isTieneWhatsapp());
		System.out.println("Esta Activo?: " + contacto.isActivo());
	}
}
