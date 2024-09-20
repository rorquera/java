package com.krakedev.test;

import com.krakedev.Persona;

/**
 * CLASE PARA PROBAR LAS INSTANCIAS DE TIPO PERSONA
 */
public class TestPersona {

	public static void main(String[] args) {
		Persona p;
		Persona p2;
		p = new Persona();
		p2 = new Persona();

		System.out.println("Persona sin seteo de valores");

		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());

		System.out.println("------------------------");
		System.out.println("Persona 1");

		p.setNombre("Rolando");
		p.setEdad(39);
		p.setEstatura(1.75);

		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());

		System.out.println("------------------------");

		System.out.println("Persona 2");

		p2.setNombre("Marco");
		p2.setEdad(28);
		p2.setEstatura(1.70);

		System.out.println("Nombre: " + p2.getNombre());
		System.out.println("Edad: " + p2.getEdad());
		System.out.println("Estatura: " + p2.getEstatura());
	}

}
