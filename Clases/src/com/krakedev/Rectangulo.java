package com.krakedev;

/**
 * CLASE PARA DEFINIR CALCULOS BASICOS PARA UN RECTANGULO
 */
public class Rectangulo {
	public double altura;
	public double base;

	public double calcularArea() {
		return base * altura;
	}

	public double calcularPerimetro() {
		return base * 2 + altura * 2;
	}

}
