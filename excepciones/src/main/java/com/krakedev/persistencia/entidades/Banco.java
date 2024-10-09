package com.krakedev.persistencia.entidades;

public class Banco {
	private int codigoBanco;
	private int codigoTransaccion;
	private String detalle;

	public Banco(int codigoBanco, int codigoTransaccion, String detalle) {
		super();
		this.codigoBanco = codigoBanco;
		this.codigoTransaccion = codigoTransaccion;
		this.detalle = detalle;
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public int getCodigoTransaccion() {
		return codigoTransaccion;
	}

	public void setCodigoTransaccion(int codigoTransaccion) {
		this.codigoTransaccion = codigoTransaccion;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	@Override
	public String toString() {
		return "Banco [codigoBanco=" + codigoBanco + ", codigoTransaccion=" + codigoTransaccion + ", detalle=" + detalle
				+ "]";
	}

}
