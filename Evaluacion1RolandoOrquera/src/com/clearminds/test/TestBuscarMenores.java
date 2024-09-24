package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda(new Celda("E"));
		maquina.agregarCelda(new Celda("F"));

		Producto productoA = new Producto("KE34", "Chips", 4.85);
		Producto productoB = new Producto("ADCR", "Oreo", 5.54);
		Producto productoC = new Producto("BDCR", "Doritos", 1.54);
		Producto productoD = new Producto("CDCR", "Galak", 2.00);
		Producto productoE = new Producto("DDCR", "Yogurt", 1.00);
		Producto productoF = new Producto("EDCR", "Manicho", 0.54);

		maquina.cargarProducto(productoA, "A", 5);
		maquina.cargarProducto(productoB, "B", 4);
		maquina.cargarProducto(productoC, "C", 2);
		maquina.cargarProducto(productoD, "D", 3);
		maquina.cargarProducto(productoE, "E", 7);
		maquina.cargarProducto(productoF, "F", 1);

		double limite = 4;
		ArrayList<Producto> productos = maquina.buscarMenores(limite);
		System.out.println("Productos Menores a " + limite + ":");
		for (Producto producto : productos) {
			System.out.println("Nombre: " + producto.getNombre() + " Precio:" + producto.getPrecio());
		}
	}
}
