package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;

public class Transaccion {
	private int codigo;
	private String numeroCuenta;
	private BigDecimal monto;
	private String tipo;
	private LocalDate fecha;
	private Time hora;

	public Transaccion(int codigo, String numeroCuenta, BigDecimal monto, String tipo, LocalDate fecha, Time hora) {
		super();
		this.codigo = codigo;
		this.numeroCuenta = numeroCuenta;
		this.monto = monto;
		this.tipo = tipo;
		this.fecha = fecha;
		this.hora = hora;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	@Override
	public String toString() {
		return "Transaccion [codigo=" + codigo + ", numeroCuenta=" + numeroCuenta + ", monto=" + monto + ", tipo="
				+ tipo + ", fecha=" + fecha + ", hora=" + hora + "]";
	}

}
