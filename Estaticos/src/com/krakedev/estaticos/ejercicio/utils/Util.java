package com.krakedev.estaticos.ejercicio.utils;

public class Util {
	public static String formatearHora(int valor) {
		String cadenaFormateada = String.format("%02d", valor);
		if (cadenaFormateada.length() == 1) {
			return cadenaFormateada = "0" + cadenaFormateada;
		} else {
			return cadenaFormateada;
		}
	}

	public static String formatearDia(int valor) {
		String dia = "";
		switch (valor) {
		case 0: {
			dia = "LUNES";
			break;
		}
		case 1: {
			dia = "MARTES";
			break;
		}
		case 2: {
			dia = "MIERCOLES";
			break;
		}
		case 3: {
			dia = "JUEVES";
			break;
		}
		case 4: {
			dia = "VIERNES";
			break;
		}
		case 5: {
			dia = "SABADO";
			break;
		}
		case 6: {
			dia = "DOMINGO";
			break;
		}
		}
		return dia;
	}
}
