package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.sql.Time;
import java.time.LocalDate;

import com.krakedev.persistencia.entidades.Banco;
import com.krakedev.persistencia.entidades.Transaccion;
import com.krakedev.persistencia.servicios.AdminBanco;
import com.krakedev.persistencia.servicios.AdminTransaccion;

public class TestActualizar {
	public static void main(String[] args) {
		try {
			// Datos a insertar para transacciones
			int codigo = 51;
			String cuenta = "7000";
			BigDecimal monto = new BigDecimal("1123.45");
			String tipo = "D";
			LocalDate fecha = LocalDate.of(2024, 10, 8);
			Time hora = Time.valueOf("12:38:00");

			// Datos a insertar para banco
			int codigoBanco = 61;
			int codigoTransaccion = codigo;
			String detalle = "Transaccion 61";

			AdminTransaccion.actualizar(new Transaccion(codigoTransaccion, cuenta, monto, tipo, fecha, hora));
			AdminBanco.actualizar(new Banco(codigoBanco, codigoTransaccion, detalle));
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
