package com.krakedev;

/**
 * CLASE PARA PROBAR LAS INSTANCIAS DE TIPO PRODUCTO
 */
public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;

		productoA = new Producto();
		productoB = new Producto();
		productoC = new Producto();

		System.out.println("Producto A");

		productoA.nombre = "Paracetamol";
		productoA.descripcion = "Caja de Paracetamol";
		productoA.precio = 2.5f;
		productoA.stockAnual = 350;

		System.out.println("Nombre: " + productoA.nombre);
		System.out.println("Descripcion: " + productoA.descripcion);
		System.out.println("Precio: " + productoA.precio);
		System.out.println("Stock Anual: " + productoA.stockAnual);

		System.out.println("-------------------");
		System.out.println("Producto B");

		productoB.nombre = "Ibuprofeno";
		productoB.descripcion = "Caja de Ibuprofeno";
		productoB.precio = 3.5f;
		productoB.stockAnual = 345;
		
		System.out.println("Nombre: " + productoB.nombre);
		System.out.println("Descripcion: " + productoB.descripcion);
		System.out.println("Precio: " + productoB.precio);
		System.out.println("Stock Anual: " + productoB.stockAnual);

		System.out.println("-------------------");
		System.out.println("Producto C");

		productoC.nombre = "Agua Oxigenada";
		productoC.descripcion = "Frasco de agua oxigenada de 250ml";
		productoC.precio = 1.75f;
		productoC.stockAnual = 450;
		
		System.out.println("Nombre: " + productoC.nombre);
		System.out.println("Descripcion: " + productoC.descripcion);
		System.out.println("Precio: " + productoC.precio);
		System.out.println("Stock Anual: " + productoC.stockAnual);
	}

}
