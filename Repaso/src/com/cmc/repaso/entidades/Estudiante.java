package com.cmc.repaso.entidades;

public class Estudiante {
	private String nombre;
	private double nota;
	private String resultado;

	public Estudiante(String nombre) {
		this.nombre = nombre;
	}

	public void calificar(double nota) {
		this.nota = nota;
		if (this.nota < 8) {
			resultado = "F";
		} else {
			resultado = "A";
		}
		System.out.println("Resultado: " + this.nombre + " " + this.resultado);
	}
}
