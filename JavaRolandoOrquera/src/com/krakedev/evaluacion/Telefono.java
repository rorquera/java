package com.krakedev.evaluacion;

public class Telefono {
	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		this.numero = numero;
		this.tipo = tipo;
		boolean esTipoCorrecto = false;
		boolean esNulo = true;

		if (numero != null && tipo != null) {
			esNulo = false;
		}

		if (!esNulo && (tipo.equals("Movil") || tipo.equals("Convencional"))) {
			esTipoCorrecto = true;
		}

		if (!esNulo && esTipoCorrecto && tipo.equals("Movil") && numero.length() == 10) {
			this.estado = "C";
		} else if (!esNulo && esTipoCorrecto && tipo.equals("Convencional") && numero.length() == 7) {
			this.estado = "C";
		} else {
			this.estado = "E";
		}

	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

}
