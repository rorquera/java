package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {
	public static void main(String[] args) {
		Contacto contacto1 = new Contacto("Vera", new Telefono("Movi", "0665220356", 40), 10);
		Contacto contacto2 = new Contacto("Messi", new Telefono("Claro", "0665220357", 41), 20);
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
		System.out.println("Operadoras Iguales?: " +  ac.compararOperadoras(contacto1, contacto2));

	}
}
