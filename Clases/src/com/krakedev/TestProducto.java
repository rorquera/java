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

		productoA.setNombre("Paracetamol");
		productoA.setDescripcion("Caja de Paracetamol");
		productoA.setPrecio(2.5f);
		productoA.setStockAnual(350);

		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock Anual: " + productoA.getStockAnual());

		System.out.println("-------------------");
		System.out.println("Producto B");

		productoB.setNombre("Ibuprofeno");
		productoB.setDescripcion("Caja de Ibuprofeno");
		productoB.setPrecio(3.5f);
		productoB.setStockAnual(345);

		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock Anual: " + productoB.getStockAnual());

		System.out.println("-------------------");
		System.out.println("Producto C");

		productoC.setNombre("Agua Oxigenada");
		productoC.setDescripcion("Frasco de agua oxigenada de 250ml");
		productoC.setPrecio(1.75f);
		productoC.setStockAnual(450);

		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock Anual: " + productoC.getStockAnual());
	}

}
