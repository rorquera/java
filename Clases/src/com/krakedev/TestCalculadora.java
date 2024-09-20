package com.krakedev;

/**
 * CLASE PARA PROBAR LAS INSTANCIAS DE TIPO CALCULADORA
 */
public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		int resultadoSuma;
		double resultadoResta;
		double resultadoMultiplicacion;
		double resultadoDivision;
		double resultadoPromedio;

		resultadoSuma = calculadora.sumar(10, 20);
		resultadoResta = calculadora.restar(75, 15);
		resultadoMultiplicacion = calculadora.multiplicar(75, 15);
		resultadoDivision = calculadora.dividir(75, 15);
		resultadoPromedio = calculadora.promediar(75, 15, 20);

		System.out.println("SUMA: " + resultadoSuma);
		System.out.println("RESTA: " + resultadoResta);
		System.out.println("MULTIPLICACIÓN: " + resultadoMultiplicacion);
		System.out.println("DIVISIÓN: " + resultadoDivision);
		System.out.println("PROMEDIO: " + resultadoPromedio);
		System.out.println("MOSTRAR MENSAJE: ");
		calculadora.mostrarResultado();
	}

}
