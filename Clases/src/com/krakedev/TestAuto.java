package com.krakedev;
/**
 * CLASE PARA PROBAR LAS INSTANCIAS DE TIPO AUTO
 */
public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		auto1 = new Auto();
		auto2 = new Auto();

		auto1.setMarca("Peugeot");
		auto1.setAnio(2024);
		auto1.setPrecio(3500.00);

		System.out.println("Auto 1");
		System.out.println("Marca: " + auto1.getMarca());
		System.out.println("Año: " + auto1.getAnio());
		System.out.println("Precio: " + auto1.getPrecio());

		System.out.println("-----------------------------");
		System.out.println("Auto 2");

		auto2.setMarca("Renaul");
		auto2.setAnio(2023);
		auto2.setPrecio(2500.75);

		System.out.println("Marca: " + auto2.getMarca());
		System.out.println("Año: " + auto2.getAnio());
		System.out.println("Precio: " + auto2.getPrecio());
	}

}
