package com.krakedev;

/**
 * CLASE PARA PROBAR LAS OPERACIONES DE LA FIGURA GEOMETRICA RECTANGULO
 */
public class TestRectangulo {

	public static void main(String[] args) {
		Rectangulo rectangulo = new Rectangulo();
		double area;
		double perimetroRectangulo;

		rectangulo.altura = 15.5;
		rectangulo.base = 10;
		area = rectangulo.calcularArea();
		perimetroRectangulo = rectangulo.calcularPerimetro();

		System.out.println("El área es: " + area);
		System.out.println("El área es: " + perimetroRectangulo);
	}

}
