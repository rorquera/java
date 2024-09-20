package com.krakedev;

/**
 * CLASE PARA DEFINIR CALCULOS BASICOS PARA UN CUADRADO
 */
public class Cuadrado {
	public double lado;

	public double calcularArea() {
		return lado * lado;
	}
	
	public double calcularPerimetro() {
		return lado * 4;
	}
}
