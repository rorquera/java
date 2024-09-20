package com.krakedev;

/**
 * CLASE QUE PERMITE DEFINIR INFORMACION BASICA DE UN PRODUCTO
 */
public class Producto {
	private String nombre;
	private String descripcion;
	private float precio;
	private int stockAnual;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStockAnual() {
		return stockAnual;
	}

	public void setStockAnual(int stockAnual) {
		this.stockAnual = stockAnual;
	}

}
