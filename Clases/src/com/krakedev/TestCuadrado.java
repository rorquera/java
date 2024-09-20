package com.krakedev;

/**
 * CLASE PARA PROBAR LAS OPERACIONES DE LA FIGURA GEOMETRICA CUADRADO
 */
public class TestCuadrado {

	public static void main(String[] args) {
		Cuadrado cuadrado1 = new Cuadrado();
		Cuadrado cuadrado2 = new Cuadrado();
		Cuadrado cuadrado3 = new Cuadrado();
		double area;
		double perimetro;

		cuadrado1.setLado(4);
		cuadrado2.setLado(8);
		cuadrado3.setLado(15);

		area = cuadrado1.calcularArea();
		perimetro = cuadrado1.calcularPerimetro();

		System.out.println("Área cuadrado1: " + area);
		System.out.println("Perímetro cuadrado1: " + perimetro);

		area = cuadrado2.calcularArea();
		perimetro = cuadrado2.calcularPerimetro();
		
		System.out.println("---------------------");
		System.out.println("Área cuadrado2: " + area);
		System.out.println("Perímetro cuadrado2: " + perimetro);

		area = cuadrado3.calcularArea();
		perimetro = cuadrado3.calcularPerimetro();
		
		System.out.println("---------------------");
		System.out.println("Área cuadrado3: " + area);
		System.out.println("Perímetro cuadrado3: " + perimetro);

	}

}
