package com.clearminds.componentes;

public class Producto {
	private String nombre;
	private Double precio;
	private String codigo;

	public Producto(String codigo, String nombre, Double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public void incrementarPrecio(int porcentajeIncremente) {
		this.precio += this.precio * porcentajeIncremente / 100;
	}

	public void disminuirPrecio(double valorDescuento) {
		this.precio -= valorDescuento;
	}
}
