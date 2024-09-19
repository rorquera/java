package com.krakedev;

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

		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);

		System.out.println("------------------------");
		System.out.println("Persona 1");

		p.nombre = "Rolando";
		p.edad = 39;
		p.estatura = 1.75;

		System.out.println("Nombre: " + p.nombre);
		System.out.println("Edad: " + p.edad);
		System.out.println("Estatura: " + p.estatura);

		System.out.println("------------------------");

		System.out.println("Persona 2");

		p2.nombre = "Marco";
		p2.edad = 28;
		p2.estatura = 1.70;

		System.out.println("Nombre: " + p2.nombre);
		System.out.println("Edad: " + p2.edad);
		System.out.println("Estatura: " + p2.estatura);
	}

}
