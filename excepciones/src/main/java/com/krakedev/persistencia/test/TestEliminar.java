package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminBanco;
import com.krakedev.persistencia.servicios.AdminTransaccion;

public class TestEliminar {
	public static void main(String[] args) {
		try {
			int codigoTransaccion = 51;
			int codigoBanco = 61;

			AdminBanco.eliminar(codigoBanco);
			AdminTransaccion.eliminar(codigoTransaccion);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
