package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {
	public static void main(String[] args) {
		Contacto contacto1 = new Contacto("Jax", new Telefono("Movi", "0648220356", 50), 50);
		Contacto contacto2 = new Contacto("Serge", new Telefono("Movi", "0865220357", 51), 30);
		AdminContactos ac = new AdminContactos();
		Contacto respContacto;

		System.out.println("\u25CF BUSCAR MAS PESADO");
		respContacto = ac.buscarMasPesado(contacto1, contacto2);
		System.out.println("Apellido: " + respContacto.getApellido());
		System.out.println("Operadora: " + respContacto.getTelefono().getOperadora());
		System.out.println("Número: " + respContacto.getTelefono().getNumero());
		System.out.println("Peso: " + respContacto.getPeso());

		System.out.println("\n");
		System.out.println("\u25CF COMPARAR OPERADORAS");
		System.out.println("Operadoras Iguales?: " + ac.compararOperadoras(contacto1, contacto2));

	}
}
