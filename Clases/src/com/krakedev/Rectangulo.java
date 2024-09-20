package com.krakedev;

/**
 * CLASE PARA DEFINIR CALCULOS BASICOS PARA UN RECTANGULO
 */
public class Rectangulo {
	private double altura;
	private double base;

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double calcularArea() {
		return base * altura;
	}

	public double calcularPerimetro() {
		return base * 2 + altura * 2;
	}

}
