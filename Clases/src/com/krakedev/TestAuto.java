package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		Auto auto1;
		Auto auto2;
		auto1 = new Auto();
		auto2 = new Auto();

		auto1.marca = "Peugeot";
		auto1.anio = 2024;
		auto1.precio = 3500.00;

		System.out.println("Auto 1");
		System.out.println("Marca: " + auto1.marca);
		System.out.println("Año: " + auto1.anio);
		System.out.println("Precio: " + auto1.precio);

		System.out.println("-----------------------------");
		System.out.println("Auto 2");

		auto2.marca = "Renaul";
		auto2.anio = 2023;
		auto2.precio = 2500.75;

		System.out.println("Marca: " + auto2.marca);
		System.out.println("Año: " + auto2.anio);
		System.out.println("Precio: " + auto2.precio);
	}

}
