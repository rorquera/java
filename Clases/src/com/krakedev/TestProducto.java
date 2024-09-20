package com.krakedev;

/**
 * CLASE PARA PROBAR LAS INSTANCIAS DE TIPO PRODUCTO
 */
public class TestProducto {

	public static void main(String[] args) {
		Producto productoA;
		Producto productoB;
		Producto productoC;

		productoA = new Producto("Paracetamol","Caja de Paracetamol",2.5f,350);
		productoB = new Producto("Ibuprofeno","Caja de Ibuprofeno",3.5f,345);
		productoC = new Producto("Agua Oxigenada","Frasco de agua oxigenada de 250ml",1.75f,450);

		System.out.println("Producto A");


		System.out.println("Nombre: " + productoA.getNombre());
		System.out.println("Descripcion: " + productoA.getDescripcion());
		System.out.println("Precio: " + productoA.getPrecio());
		System.out.println("Stock Anual: " + productoA.getStockAnual());

		System.out.println("-------------------");
		System.out.println("Producto B");


		System.out.println("Nombre: " + productoB.getNombre());
		System.out.println("Descripcion: " + productoB.getDescripcion());
		System.out.println("Precio: " + productoB.getPrecio());
		System.out.println("Stock Anual: " + productoB.getStockAnual());

		System.out.println("-------------------");
		System.out.println("Producto C");


		System.out.println("Nombre: " + productoC.getNombre());
		System.out.println("Descripcion: " + productoC.getDescripcion());
		System.out.println("Precio: " + productoC.getPrecio());
		System.out.println("Stock Anual: " + productoC.getStockAnual());
	}

}
