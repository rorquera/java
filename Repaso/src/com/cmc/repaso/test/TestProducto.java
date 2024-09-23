package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {
	public static void main(String[] args) {
		Producto producto = new Producto("Jabon", 2.50);
		System.out.println("Costo Producto: " + producto.getPrecio() + " Costo Producto Desc: "
				+ producto.calcularPrecioPromo(10));

		producto.setPrecio(-5.20);
		System.out.println("Precio Producto: " + producto.getPrecio());
	}
}
