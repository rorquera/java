package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;

import com.krakedev.persistencia.entidades.Banco;
import com.krakedev.persistencia.entidades.Transaccion;
import com.krakedev.persistencia.servicios.AdminBanco;
import com.krakedev.persistencia.servicios.AdminTransaccion;

public class TestGuardar {
	public static void main(String[] args) {
		try {
			// Datos a insertar para transacciones
			int codigo = 51;
			String cuenta = "5001";
			BigDecimal monto = new BigDecimal("123.45");
			String tipo = "C";
			LocalDate fecha = LocalDate.of(2020, 11, 22);
			Time hora = Time.valueOf("7:30:00");

			// Datos a insertar para banco
			int codigoBanco = 61;
			int codigoTransaccion = codigo;
			String detalle = "Transaccion 51";

			AdminTransaccion.insertar(new Transaccion(codigoTransaccion, cuenta, monto, tipo, fecha, hora));
			AdminBanco.insertar(new Banco(codigoBanco, codigoTransaccion, detalle));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
