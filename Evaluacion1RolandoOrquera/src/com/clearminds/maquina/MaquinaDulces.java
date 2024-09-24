package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}

	public void agregarCelda(Celda celda) {
		celdas.add(celda);
	}

	public void mostrarConfiguracion() {
		for (int i = 0; i < celdas.size(); i++) {
			System.out.println("Celda " + (i + 1) + ": " + celdas.get(i).getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		for (int i = 0; i < celdas.size(); i++) {
			if (celdas.get(i).getCodigo().equals(codigo)) {
				return celdas.get(i);
			}
		}

		return null;
	}

	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {

		for (Celda celda : celdas) {
			if (celda.getProducto() == null) {
				System.out.println(
						"Celda:" + celda.getCodigo() + " Stock: " + celda.getStock() + " Sin Producto Asignado");
			} else {
				System.out.println("Celda:" + celda.getCodigo() + " Stock: " + celda.getStock() + " Producto:"
						+ celda.getProducto().getCodigo() + " " + celda.getProducto().getNombre() + " Precio:"
						+ celda.getProducto().getPrecio());
			}
		}
		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {

		for (Celda celda : celdas) {
			if (celda.getCodigo().equals(codigo)) {
				return celda.getProducto();
			}
		}

		return null;
	}

	public Double consultarPrecio(String codigo) {
		for (Celda celda : celdas) {
			if (celda.getCodigo().equals(codigo)) {
				return celda.getProducto().getPrecio();
			}
		}
		return null;
	}

	public Celda buscarCeldaProducto(String codigo) {
		for (Celda celda : celdas) {
			if (celda.getProducto() != null && celda.getProducto().getCodigo().equals(codigo)) {
				return celda;
			}
		}
		return null;
	}

	public void incrementarProductos(String codigo, int cantidadItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidadItems);
	}

	public void vender(String codigo) {
		for (Celda celda : celdas) {
			if (celda.getCodigo() == codigo) {
				celda.setStock(celda.getStock() - 1);
				saldo += celda.getProducto().getPrecio();
			}
		}
	}

	public double venderConCambio(String codigo, double valor) {
		for (Celda celda : celdas) {
			if (celda.getCodigo() == codigo) {
				celda.setStock(celda.getStock() - 1);
				saldo += celda.getProducto().getPrecio();
				return valor - celda.getProducto().getPrecio();
			}
		}
		return 0;
	}

	public ArrayList<Producto> buscarMenores(double limite) {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		for (Celda celda : celdas) {
			if (celda.getProducto().getPrecio() <= limite) {
				productos.add(celda.getProducto());
			}
		}

		return productos;
	}
}
