package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {
	public static void main(String[] args) {
		Item item = new Item();
		Item item2 = new Item();

		System.out.println("*****PRODUCTOS ACTUALES*****");
		item.setNombre("laptop");
		item.setProductosActuales(20);
		item.imprimir();

		System.out.println("*****PRODUCTOS VENDIDOS*****");
		item.vender(10);
		item.imprimir();

		System.out.println("*****PRODUCTOS DEVUELTOS*****");
		item.devolver(1);
		item.imprimir();

		System.out.println("\n");
		System.out.println("*****PRODUCTOS ACTUALES*****");
		item2.setNombre("mochila");
		item2.setProductosActuales(45);
		item2.imprimir();

		System.out.println("*****PRODUCTOS VENDIDOS*****");
		item2.vender(20);
		item2.imprimir();

		System.out.println("*****PRODUCTOS DEVUELTOS*****");
		item2.devolver(5);
		item2.imprimir();
	}
}
