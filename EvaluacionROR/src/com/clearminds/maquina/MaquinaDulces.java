package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;

	public void configurarMaquina(String codigoCelda1, String codigoCelda2, String codigoCelda3, String codigoCelda4) {
		celda1 = new Celda(codigoCelda1);
		celda2 = new Celda(codigoCelda2);
		celda3 = new Celda(codigoCelda3);
		celda4 = new Celda(codigoCelda4);
	}

	public void mostrarConfiguracion() {
		System.out.println("Código Celda 1: " + celda1.getCodigo());
		System.out.println("Código Celda 2: " + celda2.getCodigo());
		System.out.println("Código Celda 3: " + celda3.getCodigo());
		System.out.println("Código Celda 4: " + celda4.getCodigo());
	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidad);
	}

	public void mostrarProductos() {
		System.out.println("****************CELDA " + celda1.getCodigo());
		System.out.println("Stock: " + celda1.getStock());
		if (celda1.getProducto() == null) {
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Nombre Producto: " + celda1.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda1.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda1.getProducto().getCodigo());
		}

		System.out.println("****************CELDA " + celda2.getCodigo());
		System.out.println("Stock: " + celda2.getStock());
		if (celda2.getProducto() == null) {
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Nombre Producto: " + celda2.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda2.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda2.getProducto().getCodigo());
		}

		System.out.println("****************CELDA " + celda3.getCodigo());
		System.out.println("Stock: " + celda3.getStock());
		if (celda3.getProducto() == null) {
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Nombre Producto: " + celda3.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda3.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda3.getProducto().getCodigo());
		}

		System.out.println("****************CELDA " + celda4.getCodigo());
		System.out.println("Stock: " + celda4.getStock());
		if (celda4.getProducto() == null) {
			System.out.println("La celda no tiene producto!!!");
		} else {
			System.out.println("Nombre Producto: " + celda4.getProducto().getNombre());
			System.out.println("Precio Producto: " + celda4.getProducto().getPrecio());
			System.out.println("Código Producto: " + celda4.getProducto().getCodigo());
		}

		System.out.println("Saldo: " + saldo);
	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public Double consultarPrecio(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto().getPrecio();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto().getPrecio();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto().getPrecio();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto().getPrecio();
		} else {
			return null;
		}
	}

	public Celda buscarCeldaProducto(String codigo) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getProducto() != null && celda2.getProducto().getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getProducto() != null && celda3.getProducto().getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getProducto() != null && celda4.getProducto().getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	public void incrementarProductos(String codigo, int cantidadItems) {
		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() + cantidadItems);
	}

	public void vender(String codigo) {
		if (celda1.getCodigo() == codigo) {
			celda1.setStock(celda1.getStock() - 1);
			saldo += celda1.getProducto().getPrecio();
		}
		if (celda2.getCodigo() == codigo) {
			celda2.setStock(celda2.getStock() - 1);
			saldo += celda2.getProducto().getPrecio();
		}
		if (celda3.getCodigo() == codigo) {
			celda3.setStock(celda3.getStock() - 1);
			saldo += celda3.getProducto().getPrecio();
		}
		if (celda4.getCodigo() == codigo) {
			celda4.setStock(celda4.getStock() - 1);
			saldo += celda4.getProducto().getPrecio();
		}
	}

	public double venderConCambio(String codigo, double valor) {
		if (celda1.getCodigo() == codigo) {
			celda1.setStock(celda1.getStock() - 1);
			saldo += celda1.getProducto().getPrecio();
			return valor - celda1.getProducto().getPrecio();
		}
		if (celda2.getCodigo() == codigo) {
			celda2.setStock(celda2.getStock() - 1);
			saldo += celda2.getProducto().getPrecio();
			return valor - celda2.getProducto().getPrecio();
		}
		if (celda3.getCodigo() == codigo) {
			celda3.setStock(celda3.getStock() - 1);
			saldo += celda3.getProducto().getPrecio();
			return valor - celda3.getProducto().getPrecio();
		}
		if (celda4.getCodigo() == codigo) {
			celda4.setStock(celda4.getStock() - 1);
			saldo += celda4.getProducto().getPrecio();
			return valor - celda4.getProducto().getPrecio();
		}

		return 0;
	}
}
