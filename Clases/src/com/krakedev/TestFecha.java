package com.krakedev;

/**
 * CLASE PARA PROBAR LAS INSTANCIAS DE TIPO FECHA
 */
public class TestFecha {

	public static void main(String[] args) {
		Fecha fecha = new Fecha();

		fecha.setAnio(2024);
		fecha.setMes(9);
		fecha.setDia(20);

		System.out.println("Año: " + fecha.getAnio());
		System.out.println("Mes: " + fecha.getMes());
		System.out.println("Día: " + fecha.getDia());
	}

}
